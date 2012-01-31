// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package tosstudio.context;

import junit.framework.Assert;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.swtbot.TalendSwtBotForTos;
import org.talend.swtbot.Utilities;
import org.talend.swtbot.items.TalendContextItem;
import org.talend.swtbot.items.TalendJobItem;

/**
 * DOC fzhong class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class UpdateDependentJobsTest extends TalendSwtBotForTos {

    private TalendJobItem jobItem;

    private TalendContextItem contextItem;

    private static final String JOBNAME = "jobTest"; //$NON-NLS-1$

    private static final String CONTEXT_NAME = "contextTest"; //$NON-NLS-1$

    @Before
    public void initialisePrivateFields() {
        jobItem = new TalendJobItem(JOBNAME);
        jobItem.create();
        contextItem = new TalendContextItem(CONTEXT_NAME);
        contextItem.create();
        Utilities.dndMetadataOntoJob(jobItem.getEditor(), contextItem.getItem(), null, new Point(100, 100));
        jobItem.getEditor().save();
        for (int i = 0; i < 5; i++)
            jobItem.copyAndPaste();
    }

    @Test
    public void updateDependentJobsTest() {
        contextItem.getItem().doubleClick();
        gefBot.shell("Create / Edit a context group").activate();
        gefBot.button("Next >").click();
        gefBot.cTabItem("Values as table").activate();
        gefBot.tree(0).getTreeItem(System.getProperty("context.variable0")).click(1);
        gefBot.text().setText("test");
        gefBot.tree(0).getTreeItem(System.getProperty("context.variable0")).select();
        gefBot.button("Finish").click();

        gefBot.shell("Modification").activate();
        gefBot.button("Yes").click();

        gefBot.shell("Update Detection").activate();
        gefBot.button("OK").click();

        assertContextInJob(jobItem.getItemFullName());
        assertContextInJob("Copy_of_" + JOBNAME + " 0.1");
        assertContextInJob("Copy_of_" + JOBNAME + "_a 0.1");
        assertContextInJob("Copy_of_" + JOBNAME + "_b 0.1");
        assertContextInJob("Copy_of_" + JOBNAME + "_c 0.1");
        assertContextInJob("Copy_of_" + JOBNAME + "_d 0.1");
    }

    @After
    public void removePreviouslyCreateItems() {
        for (SWTBotEditor editor : gefBot.editors()) {
            editor.saveAndClose();
        }
        Utilities.cleanUpRepository(jobItem.getParentNode());
        Utilities.cleanUpRepository(contextItem.getParentNode());
        Utilities.emptyRecycleBin();
    }

    private void assertContextInJob(String jobFullName) {
        jobItem.getParentNode().getNode(jobFullName).select().doubleClick();
        gefBot.viewByTitle("Contexts(Job " + jobFullName + ")").setFocus();
        gefBot.cTabItem("Values as table").activate();
        String var0 = System.getProperty("context.variable0");
        Assert.assertEquals("context in job(" + jobFullName + ") did not update", "test", gefBot.tree(0)
                .getTreeItem(CONTEXT_NAME).getNode(var0).cell(1));
    }
}
