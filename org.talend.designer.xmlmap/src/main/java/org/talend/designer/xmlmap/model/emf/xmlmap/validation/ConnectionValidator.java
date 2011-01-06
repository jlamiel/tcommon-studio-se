/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.validation;

import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;

/**
 * A sample validator interface for {@link org.talend.designer.xmlmap.model.emf.xmlmap.Connection}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConnectionValidator {
	boolean validate();

	boolean validateSource(TreeNode value);
	boolean validateTarget(TreeNode value);
}
