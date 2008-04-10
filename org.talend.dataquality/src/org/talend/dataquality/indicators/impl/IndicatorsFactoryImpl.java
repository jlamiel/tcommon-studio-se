/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.dataquality.indicators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsFactoryImpl extends EFactoryImpl implements IndicatorsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IndicatorsFactory init() {
        try {
            IndicatorsFactory theIndicatorsFactory = (IndicatorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://dataquality.indicators"); 
            if (theIndicatorsFactory != null) {
                return theIndicatorsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new IndicatorsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case IndicatorsPackage.INDICATOR: return createIndicator();
            case IndicatorsPackage.ROW_COUNT_INDICATOR: return createRowCountIndicator();
            case IndicatorsPackage.SUM_INDICATOR: return createSumIndicator();
            case IndicatorsPackage.COMPOSITE_INDICATOR: return createCompositeIndicator();
            case IndicatorsPackage.RANGE_INDICATOR: return createRangeIndicator();
            case IndicatorsPackage.BOX_INDICATOR: return createBoxIndicator();
            case IndicatorsPackage.INDICATOR_TYPE: return createIndicatorType();
            case IndicatorsPackage.INTEGER_SUM_INDICATOR: return createIntegerSumIndicator();
            case IndicatorsPackage.DOUBLE_SUM_INDICATOR: return createDoubleSumIndicator();
            case IndicatorsPackage.BIG_DECIMAL_INDICATOR: return createBigDecimalIndicator();
            case IndicatorsPackage.FREQUENCY_INDICATOR: return createFrequencyIndicator();
            case IndicatorsPackage.INTEGER_MEAN_INDICATOR: return createIntegerMeanIndicator();
            case IndicatorsPackage.DOUBLE_MEAN_INDICATOR: return createDoubleMeanIndicator();
            case IndicatorsPackage.BIG_DECIMAL_MEAN_INDICATOR: return createBigDecimalMeanIndicator();
            case IndicatorsPackage.BLANK_COUNT_INDICATOR: return createBlankCountIndicator();
            case IndicatorsPackage.INDICATOR_PARAMETERS: return createIndicatorParameters();
            case IndicatorsPackage.MEDIAN_INDICATOR: return createMedianIndicator();
            case IndicatorsPackage.VALUE_INDICATOR: return createValueIndicator();
            case IndicatorsPackage.MIN_VALUE_INDICATOR: return createMinValueIndicator();
            case IndicatorsPackage.MAX_VALUE_INDICATOR: return createMaxValueIndicator();
            case IndicatorsPackage.MODE_INDICATOR: return createModeIndicator();
            case IndicatorsPackage.NULL_COUNT_INDICATOR: return createNullCountIndicator();
            case IndicatorsPackage.DISTINCT_COUNT_INDICATOR: return createDistinctCountIndicator();
            case IndicatorsPackage.UNIQUE_COUNT_INDICATOR: return createUniqueCountIndicator();
            case IndicatorsPackage.DUPLICATE_COUNT_INDICATOR: return createDuplicateCountIndicator();
            case IndicatorsPackage.IQR_INDICATOR: return createIQRIndicator();
            case IndicatorsPackage.TEXT_INDICATOR: return createTextIndicator();
            case IndicatorsPackage.MIN_LENGTH_INDICATOR: return createMinLengthIndicator();
            case IndicatorsPackage.MAX_LENGTH_INDICATOR: return createMaxLengthIndicator();
            case IndicatorsPackage.AVERAGE_LENGTH_INDICATOR: return createAverageLengthIndicator();
            case IndicatorsPackage.LENGTH_INDICATOR: return createLengthIndicator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case IndicatorsPackage.ENUM_STATISTICS:
                return createEnumStatisticsFromString(eDataType, initialValue);
            case IndicatorsPackage.DATAMINING_TYPE:
                return createDataminingTypeFromString(eDataType, initialValue);
            case IndicatorsPackage.DATATYPE:
                return createDatatypeFromString(eDataType, initialValue);
            case IndicatorsPackage.JAVA_SET:
                return createJavaSetFromString(eDataType, initialValue);
            case IndicatorsPackage.JAVA_HASH_MAP:
                return createJavaHashMapFromString(eDataType, initialValue);
            case IndicatorsPackage.JAVA_TREE_MAP:
                return createJavaTreeMapFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case IndicatorsPackage.ENUM_STATISTICS:
                return convertEnumStatisticsToString(eDataType, instanceValue);
            case IndicatorsPackage.DATAMINING_TYPE:
                return convertDataminingTypeToString(eDataType, instanceValue);
            case IndicatorsPackage.DATATYPE:
                return convertDatatypeToString(eDataType, instanceValue);
            case IndicatorsPackage.JAVA_SET:
                return convertJavaSetToString(eDataType, instanceValue);
            case IndicatorsPackage.JAVA_HASH_MAP:
                return convertJavaHashMapToString(eDataType, instanceValue);
            case IndicatorsPackage.JAVA_TREE_MAP:
                return convertJavaTreeMapToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Indicator createIndicator() {
        IndicatorImpl indicator = new IndicatorImpl();
        return indicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RowCountIndicator createRowCountIndicator() {
        RowCountIndicatorImpl rowCountIndicator = new RowCountIndicatorImpl();
        return rowCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SumIndicator createSumIndicator() {
        SumIndicatorImpl sumIndicator = new SumIndicatorImpl();
        return sumIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompositeIndicator createCompositeIndicator() {
        CompositeIndicatorImpl compositeIndicator = new CompositeIndicatorImpl();
        return compositeIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeIndicator createRangeIndicator() {
        RangeIndicatorImpl rangeIndicator = new RangeIndicatorImpl();
        return rangeIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoxIndicator createBoxIndicator() {
        BoxIndicatorImpl boxIndicator = new BoxIndicatorImpl();
        return boxIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorType createIndicatorType() {
        IndicatorTypeImpl indicatorType = new IndicatorTypeImpl();
        return indicatorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerSumIndicator createIntegerSumIndicator() {
        IntegerSumIndicatorImpl integerSumIndicator = new IntegerSumIndicatorImpl();
        return integerSumIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DoubleSumIndicator createDoubleSumIndicator() {
        DoubleSumIndicatorImpl doubleSumIndicator = new DoubleSumIndicatorImpl();
        return doubleSumIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimalIndicator createBigDecimalIndicator() {
        BigDecimalIndicatorImpl bigDecimalIndicator = new BigDecimalIndicatorImpl();
        return bigDecimalIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FrequencyIndicator createFrequencyIndicator() {
        FrequencyIndicatorImpl frequencyIndicator = new FrequencyIndicatorImpl();
        return frequencyIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerMeanIndicator createIntegerMeanIndicator() {
        IntegerMeanIndicatorImpl integerMeanIndicator = new IntegerMeanIndicatorImpl();
        return integerMeanIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DoubleMeanIndicator createDoubleMeanIndicator() {
        DoubleMeanIndicatorImpl doubleMeanIndicator = new DoubleMeanIndicatorImpl();
        return doubleMeanIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimalMeanIndicator createBigDecimalMeanIndicator() {
        BigDecimalMeanIndicatorImpl bigDecimalMeanIndicator = new BigDecimalMeanIndicatorImpl();
        return bigDecimalMeanIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlankCountIndicator createBlankCountIndicator() {
        BlankCountIndicatorImpl blankCountIndicator = new BlankCountIndicatorImpl();
        return blankCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorParameters createIndicatorParameters() {
        IndicatorParametersImpl indicatorParameters = new IndicatorParametersImpl();
        return indicatorParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MedianIndicator createMedianIndicator() {
        MedianIndicatorImpl medianIndicator = new MedianIndicatorImpl();
        return medianIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueIndicator createValueIndicator() {
        ValueIndicatorImpl valueIndicator = new ValueIndicatorImpl();
        return valueIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinValueIndicator createMinValueIndicator() {
        MinValueIndicatorImpl minValueIndicator = new MinValueIndicatorImpl();
        return minValueIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxValueIndicator createMaxValueIndicator() {
        MaxValueIndicatorImpl maxValueIndicator = new MaxValueIndicatorImpl();
        return maxValueIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeIndicator createModeIndicator() {
        ModeIndicatorImpl modeIndicator = new ModeIndicatorImpl();
        return modeIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NullCountIndicator createNullCountIndicator() {
        NullCountIndicatorImpl nullCountIndicator = new NullCountIndicatorImpl();
        return nullCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DistinctCountIndicator createDistinctCountIndicator() {
        DistinctCountIndicatorImpl distinctCountIndicator = new DistinctCountIndicatorImpl();
        return distinctCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UniqueCountIndicator createUniqueCountIndicator() {
        UniqueCountIndicatorImpl uniqueCountIndicator = new UniqueCountIndicatorImpl();
        return uniqueCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DuplicateCountIndicator createDuplicateCountIndicator() {
        DuplicateCountIndicatorImpl duplicateCountIndicator = new DuplicateCountIndicatorImpl();
        return duplicateCountIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IQRIndicator createIQRIndicator() {
        IQRIndicatorImpl iqrIndicator = new IQRIndicatorImpl();
        return iqrIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextIndicator createTextIndicator() {
        TextIndicatorImpl textIndicator = new TextIndicatorImpl();
        return textIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinLengthIndicator createMinLengthIndicator() {
        MinLengthIndicatorImpl minLengthIndicator = new MinLengthIndicatorImpl();
        return minLengthIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxLengthIndicator createMaxLengthIndicator() {
        MaxLengthIndicatorImpl maxLengthIndicator = new MaxLengthIndicatorImpl();
        return maxLengthIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageLengthIndicator createAverageLengthIndicator() {
        AverageLengthIndicatorImpl averageLengthIndicator = new AverageLengthIndicatorImpl();
        return averageLengthIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LengthIndicator createLengthIndicator() {
        LengthIndicatorImpl lengthIndicator = new LengthIndicatorImpl();
        return lengthIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumStatistics createEnumStatisticsFromString(EDataType eDataType, String initialValue) {
        EnumStatistics result = EnumStatistics.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEnumStatisticsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataminingType createDataminingTypeFromString(EDataType eDataType, String initialValue) {
        DataminingType result = DataminingType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDataminingTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Datatype createDatatypeFromString(EDataType eDataType, String initialValue) {
        Datatype result = Datatype.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDatatypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Set createJavaSetFromString(EDataType eDataType, String initialValue) {
        return (Set)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJavaSetToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public HashMap createJavaHashMapFromString(EDataType eDataType, String initialValue) {
        return (HashMap)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJavaHashMapToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public TreeMap createJavaTreeMapFromString(EDataType eDataType, String initialValue) {
        return (TreeMap)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJavaTreeMapToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorsPackage getIndicatorsPackage() {
        return (IndicatorsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IndicatorsPackage getPackage() {
        return IndicatorsPackage.eINSTANCE;
    }

} //IndicatorsFactoryImpl
