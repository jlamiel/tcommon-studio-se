package org.talend.core.model.metadata.builder;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.talend.core.model.metadata.DiSchemaConstants;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.SAPBWTable;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.SAPBWTableHelper;

import orgomg.cwm.objectmodel.core.TaggedValue;

@PrepareForTest({ CoreRuntimePlugin.class })
public class ConvertionHelperTest {

    @Rule
    public PowerMockRule powerMockRule = new PowerMockRule();

    
    @Test
    public void testConvertMetadataTable() {
        SAPBWTable table = ConnectionFactory.eINSTANCE.createSAPBWTable();
        table.setSourceSystemName("TALEND");
        table.setInnerIOType(SAPBWTableHelper.IO_INNERTYPE_HIERARCHY);
        IMetadataTable newTable = ConvertionHelper.convert(table);
        String sourceSysName = newTable.getAdditionalProperties().get(SAPBWTableHelper.SAP_DATASOURCE_SOURCESYSNAME);
        String innerIOType = newTable.getAdditionalProperties().get(SAPBWTableHelper.SAP_INFOOBJECT_INNER_TYPE);
        assertEquals("TALEND", sourceSysName);
        assertEquals(SAPBWTableHelper.IO_INNERTYPE_HIERARCHY, innerIOType);
    }
    
    @Test
    public void testConvertDatabaseConnectionBooleanString() {
        DatabaseConnection dbProvider = ConnectionFactory.eINSTANCE.createDatabaseConnection();

        // mock CoreRuntimePlugin
        CoreRuntimePlugin instanceMock = Mockito.mock(CoreRuntimePlugin.class);
        PowerMockito.mockStatic(CoreRuntimePlugin.class);
        Mockito.when(CoreRuntimePlugin.getInstance()).thenReturn(instanceMock);
        Mockito.when(instanceMock.getRepositoryService()).thenReturn(null);
        // ~CoreRuntimePlugin
        setJDBCMysqlConnection(dbProvider);
        IMetadataConnection convertMetadata = ConvertionHelper.convert(dbProvider, false, null);
        validJDBCMysqlConnection(convertMetadata, dbProvider);
    }

    private boolean validJDBCMysqlConnection(IMetadataConnection convertMetadata, DatabaseConnection dbProvider) {
        assertEquals(convertMetadata.getComment(), ""); //$NON-NLS-1$
        assertEquals(convertMetadata.getDatabase(), ""); //$NON-NLS-1$
        assertEquals(convertMetadata.getDataSourceName(), ""); //$NON-NLS-1$
        assertEquals(convertMetadata.getDbType(), "General JDBC"); //$NON-NLS-1$
        assertEquals(convertMetadata.getDriverJarPath(), "E:\\tools\\jdbc\\mysql-connector-java-5.1.12-bin.jar"); //$NON-NLS-1$
        assertEquals(convertMetadata.getDriverClass(), "org.gjt.mm.mysql.Driver"); //$NON-NLS-1$
        assertEquals(convertMetadata.getId(), "_9bw28cccEeGQNaw_qcyMFw"); //$NON-NLS-1$
        assertEquals(convertMetadata.getLabel(), "jdbcmysql1"); //$NON-NLS-1$
        assertEquals(convertMetadata.getPassword(), "shenze"); //$NON-NLS-1$
        assertEquals(convertMetadata.getPort(), "3306"); //$NON-NLS-1$
        assertEquals(convertMetadata.getSqlSyntax(), "SQL Syntax"); //$NON-NLS-1$
        assertEquals(convertMetadata.getUrl(), "jdbc:mysql://192.168.30.151:3306/?noDatetimeStringSync=true"); //$NON-NLS-1$
        assertEquals(convertMetadata.getUsername(), "shenze"); //$NON-NLS-1$
        assertEquals(convertMetadata.getMapping(), "mysql_id"); //$NON-NLS-1$
        assertEquals(convertMetadata.getProduct(), "JDBC"); //$NON-NLS-1$
        assertEquals(convertMetadata.isSqlMode(), false);
        assertEquals(convertMetadata.isContentModel(), false);
        assertEquals(convertMetadata.getCurrentConnection(), dbProvider);
        assertNotNull(convertMetadata.getPurpose());
        assertEquals(convertMetadata.getPurpose(), "my test purpose"); //$NON-NLS-1$
        assertNotNull(convertMetadata.getDescription());
        assertEquals(convertMetadata.getDescription(), "my test description"); //$NON-NLS-1$
        assertNotNull(convertMetadata.getAuthor());
        assertEquals(convertMetadata.getAuthor(), "test@talend.com"); //$NON-NLS-1$
        assertNotNull(convertMetadata.getStatus());
        assertEquals(convertMetadata.getStatus(), "DEV"); //$NON-NLS-1$
        assertNotNull(convertMetadata.getVersion());
        assertEquals(convertMetadata.getVersion(), "1.1"); //$NON-NLS-1$
        assertNotNull(convertMetadata.getUniverse());
        assertEquals(convertMetadata.getUniverse(), ""); //$NON-NLS-1$
        return true;
    }

    private boolean setJDBCMysqlConnection(DatabaseConnection dbProvider) {
        // General JDBC case
        dbProvider.setComment(""); //$NON-NLS-1$
        dbProvider.setSID(""); //$NON-NLS-1$
        dbProvider.setDatasourceName(""); //$NON-NLS-1$
        dbProvider.setDatabaseType("General JDBC"); //$NON-NLS-1$
        dbProvider.setDriverJarPath("E:\\tools\\jdbc\\mysql-connector-java-5.1.12-bin.jar"); //$NON-NLS-1$
        dbProvider.setDbVersionString(""); //$NON-NLS-1$
        dbProvider.setDriverClass("org.gjt.mm.mysql.Driver"); //$NON-NLS-1$
        dbProvider.setFileFieldName(""); //$NON-NLS-1$
        dbProvider.setId("_9bw28cccEeGQNaw_qcyMFw"); //$NON-NLS-1$
        dbProvider.setLabel("jdbcmysql1"); //$NON-NLS-1$
        dbProvider.setNullChar(""); //$NON-NLS-1$
        dbProvider.setRawPassword("shenze"); //$NON-NLS-1$
        dbProvider.setPort("3306"); //$NON-NLS-1$
        dbProvider.setServerName(""); //$NON-NLS-1$
        dbProvider.setSqlSynthax("SQL Syntax"); //$NON-NLS-1$
        dbProvider.setUiSchema(""); //$NON-NLS-1$
        dbProvider.setStringQuote(""); //$NON-NLS-1$
        dbProvider.setURL("jdbc:mysql://192.168.30.151:3306/?noDatetimeStringSync=true"); //$NON-NLS-1$
        dbProvider.setAdditionalParams(""); //$NON-NLS-1$
        dbProvider.setUsername("shenze"); //$NON-NLS-1$
        dbProvider.setDbmsId("mysql_id"); //$NON-NLS-1$
        dbProvider.setProductId("JDBC"); //$NON-NLS-1$
        dbProvider.setDBRootPath(""); //$NON-NLS-1$
        dbProvider.setSQLMode(false);
        dbProvider.setContextMode(false);
        dbProvider.setContextId(""); //$NON-NLS-1$
        dbProvider.setContextName(""); //$NON-NLS-1$
        ConnectionHelper.setPurpose("my test purpose", dbProvider); //$NON-NLS-1$
        ConnectionHelper.setDescription("my test description", dbProvider); //$NON-NLS-1$
        ConnectionHelper.setAuthor("test@talend.com", dbProvider); //$NON-NLS-1$
        ConnectionHelper.setDevStatus("DEV", dbProvider); //$NON-NLS-1$
        ConnectionHelper.setVersion("1.1", dbProvider); //$NON-NLS-1$
        ConnectionHelper.setUniverse("", dbProvider); //$NON-NLS-1$
        return true;
    }

    @Test
    public void testReadonlyStatusInConvert() {
        String C1 = "C1"; //$NON-NLS-1$
        String C2 = "C2"; //$NON-NLS-1$
        IMetadataTable table = new MetadataTable();
        IMetadataColumn column = new MetadataColumn();
        column.setLabel(C1); 
        table.getListColumns().add(column);
        column = new MetadataColumn();
        column.setLabel(C2); 
        table.getListColumns().add(column);

        org.talend.core.model.metadata.builder.connection.MetadataTable newTable = ConvertionHelper.convert(table);
        assertFalse(isColumnTaggedAsReadonly(newTable, C2));
        
        table.getColumn(C2).setReadOnly(true);
        newTable = ConvertionHelper.convert(table);
        assertTrue(isColumnTaggedAsReadonly(newTable, C2));
    }

    private boolean isColumnTaggedAsReadonly(org.talend.core.model.metadata.builder.connection.MetadataTable table,
            String columnName) {
        if (table == null || columnName == null) {
            return false;
        }
        EList<org.talend.core.model.metadata.builder.connection.MetadataColumn> columns = table.getColumns();
        for (org.talend.core.model.metadata.builder.connection.MetadataColumn newColumn : columns) {
            if (columnName.equals(newColumn.getLabel())) {
                EList<TaggedValue> taggedValues = newColumn.getTaggedValue();
                for (TaggedValue taggedValue : taggedValues) {
                    if (DiSchemaConstants.TALEND6_IS_READ_ONLY.equals(taggedValue.getTag())) {
                        return Boolean.valueOf(taggedValue.getValue());
                    }
                }
            }
        }
        return false;
    }

}
