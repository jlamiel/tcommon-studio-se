/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.validation;

import org.eclipse.emf.common.util.EList;

import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;

/**
 * A sample validator interface for {@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XmlMapDataValidator {
	boolean validate();

	boolean validateInputTrees(EList<InputXmlTree> value);
	boolean validateOutputTrees(EList<OutputXmlTree> value);
}
