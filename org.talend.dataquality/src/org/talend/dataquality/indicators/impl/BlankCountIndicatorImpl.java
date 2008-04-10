/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.dataquality.indicators.BlankCountIndicator;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Blank Count Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.BlankCountIndicatorImpl#getBlankCount <em>Blank Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlankCountIndicatorImpl extends TextIndicatorImpl implements BlankCountIndicator {

    /**
     * The default value of the '{@link #getBlankCount() <em>Blank Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlankCount()
     * @generated
     * @ordered
     */
    protected static final int BLANK_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getBlankCount() <em>Blank Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlankCount()
     * @generated
     * @ordered
     */
    protected int blankCount = BLANK_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BlankCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.BLANK_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getBlankCount() {
        return blankCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBlankCount(int newBlankCount) {
        int oldBlankCount = blankCount;
        blankCount = newBlankCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT, oldBlankCount, blankCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                return new Integer(getBlankCount());
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                setBlankCount(((Integer)newValue).intValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                setBlankCount(BLANK_COUNT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                return blankCount != BLANK_COUNT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("blankCount: ");
        result.append(blankCount);
        return result.toString();
    }

    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        if (data == null) {
            return ok;
        }

        // Check on the correct type of data must be done when constructing the indicator.
        assert data instanceof String : "Cannot check for blank on non string: " + data;
        String str = (String) data;
        if (StringUtils.isBlank(str)) {
            this.blankCount++;
        }
        return ok;
    }

} // BlankCountIndicatorImpl
