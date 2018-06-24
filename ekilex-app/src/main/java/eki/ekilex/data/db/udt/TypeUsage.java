/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.udt;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.udt.records.TypeUsageRecord;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeUsage extends UDTImpl<TypeUsageRecord> {

    private static final long serialVersionUID = 634917456;

    /**
     * The reference instance of <code>public.type_usage</code>
     */
    public static final TypeUsage TYPE_USAGE = new TypeUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeUsageRecord> getRecordType() {
        return TypeUsageRecord.class;
    }

    /**
     * The attribute <code>public.type_usage.usage</code>.
     */
    public static final UDTField<TypeUsageRecord, String> USAGE = createField("usage", org.jooq.impl.SQLDataType.CLOB, TYPE_USAGE, "");

    /**
     * The attribute <code>public.type_usage.usage_lang</code>.
     */
    public static final UDTField<TypeUsageRecord, String> USAGE_LANG = createField("usage_lang", org.jooq.impl.SQLDataType.CHAR(3), TYPE_USAGE, "");

    /**
     * The attribute <code>public.type_usage.usage_type_code</code>.
     */
    public static final UDTField<TypeUsageRecord, String> USAGE_TYPE_CODE = createField("usage_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), TYPE_USAGE, "");

    /**
     * The attribute <code>public.type_usage.usage_translations</code>.
     */
    public static final UDTField<TypeUsageRecord, String[]> USAGE_TRANSLATIONS = createField("usage_translations", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), TYPE_USAGE, "");

    /**
     * The attribute <code>public.type_usage.usage_definitions</code>.
     */
    public static final UDTField<TypeUsageRecord, String[]> USAGE_DEFINITIONS = createField("usage_definitions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), TYPE_USAGE, "");

    /**
     * The attribute <code>public.type_usage.usage_authors</code>.
     */
    public static final UDTField<TypeUsageRecord, String[]> USAGE_AUTHORS = createField("usage_authors", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), TYPE_USAGE, "");

    /**
     * No further instances allowed
     */
    private TypeUsage() {
        super("type_usage", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
