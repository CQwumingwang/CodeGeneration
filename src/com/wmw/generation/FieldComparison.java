package com.wmw.generation;

/**
 * @ClassName FieldComparison
 * @Description TODO mysql java 字段类型对照
 * @Author wumingwang
 * @Date 2019/4/30 16:13
 * @Version 1.0
 */
public class FieldComparison {

    /**
     * 根据数据库字段类型获取java类型
     * @param typeName 数据库字段类型
     * @return
     */
    public static String getField(String typeName){
        String field = "String";
        switch (typeName){
            case "varchar": field = "String";break;
            case "char": field = "String";break;
            case "text": field = "String";break;
            case "tinytext": field = "String";break;
            case "mediumtext": field = "String";break;
            case "longtext": field = "String";break;
            case "blob": field = "byte[]";break;
            case "tinyblob": field = "byte[]";break;
            case "longblob": field = "byte[]";break;
            case "mediumblob": field = "byte[]";break;
            case "int": field = "Integer";break;
            case "tinyint": field = "Integer";break;
            case "bigint": field = "Long";break;
            case "bit": field = "boolean";break;
            case "date": field = "Date";break;
            case "datetime": field = "Date";break;
            case "timestamp": field = "Date";break;
            case "decimal": field = "BigDecimal";break;
            case "double": field = "Double";break;
            case "binary": field = "byte[]";break;
            case "enum": field = "String";break;
            case "float": field = "Float";break;
            case "year": field = "Date";break;
            case "time": field = "Date";break;
            default: break;
        }
        return field;
    }

    /**
     * 根据数据库字段类型获取包引用
     * @param typeName 数据库字段类型
     * @return
     */
    public static String getImport(String typeName){
        String vau = "";
        switch (typeName){
            case "date": vau = "import java.util.Date";break;
            case "datetime": vau = "import java.util.Date";break;
            case "timestamp": vau = "import java.util.Date";break;
            case "decimal": vau = "import java.math.BigDecimal";break;
            case "year": vau = "import java.util.Date";break;
            case "time": vau = "import java.util.Date";break;
            default: break;
        }
        return vau;
    }

    /**
     * 根据数据库字段类型获取jdbcType类型
     * @param typeName 数据库字段类型
     * @return
     */
    public static String getJdbcType(String typeName){
        String jdbcType = "String";
        switch (typeName){
            case "varchar": jdbcType = "VARCHAR";break;
            case "char": jdbcType = "CHAR";break;
            case "text": jdbcType = "TEXT";break;
            case "tinytext": jdbcType = "TINYTEXT";break;
            case "mediumtext": jdbcType = "MEDIUMTEXT";break;
            case "longtext": jdbcType = "LONGTEXT";break;
            case "blob": jdbcType = "BLOB";break;
            case "tinyblob": jdbcType = "TINYBLOB";break;
            case "longblob": jdbcType = "LONGBLOB";break;
            case "mediumblob": jdbcType = "MEDIUMBLOB";break;
            case "int": jdbcType = "INTEGER";break;
            case "tinyint": jdbcType = "INTEGER";break;
            case "bigint": jdbcType = "BIGINT";break;
            case "bit": jdbcType = "BIT";break;
            case "date": jdbcType = "TIMESTAMP";break;
            case "datetime": jdbcType = "TIMESTAMP";break;
            case "timestamp": jdbcType = "TIMESTAMP";break;
            case "decimal": jdbcType = "BigDecimal";break;
            case "double": jdbcType = "Double";break;
            case "binary": jdbcType = "BINARY";break;
            case "enum": jdbcType = "ENUM";break;
            case "float": jdbcType = "FLOAT";break;
            case "year": jdbcType = "TIMESTAMP";break;
            case "time": jdbcType = "TIMESTAMP";break;
            default: break;
        }
        return jdbcType;
    }
}
