/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Keys;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.LexicalDecisionDataRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexicalDecisionData extends TableImpl<LexicalDecisionDataRecord> {

    private static final long serialVersionUID = 1829658841;

    /**
     * The reference instance of <code>public.lexical_decision_data</code>
     */
    public static final LexicalDecisionData LEXICAL_DECISION_DATA = new LexicalDecisionData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexicalDecisionDataRecord> getRecordType() {
        return LexicalDecisionDataRecord.class;
    }

    /**
     * The column <code>public.lexical_decision_data.id</code>.
     */
    public final TableField<LexicalDecisionDataRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexical_decision_data_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexical_decision_data.word</code>.
     */
    public final TableField<LexicalDecisionDataRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.lexical_decision_data.lang</code>.
     */
    public final TableField<LexicalDecisionDataRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.lexical_decision_data.is_word</code>.
     */
    public final TableField<LexicalDecisionDataRecord, Boolean> IS_WORD = createField("is_word", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.lexical_decision_data</code> table reference
     */
    public LexicalDecisionData() {
        this(DSL.name("lexical_decision_data"), null);
    }

    /**
     * Create an aliased <code>public.lexical_decision_data</code> table reference
     */
    public LexicalDecisionData(String alias) {
        this(DSL.name(alias), LEXICAL_DECISION_DATA);
    }

    /**
     * Create an aliased <code>public.lexical_decision_data</code> table reference
     */
    public LexicalDecisionData(Name alias) {
        this(alias, LEXICAL_DECISION_DATA);
    }

    private LexicalDecisionData(Name alias, Table<LexicalDecisionDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexicalDecisionData(Name alias, Table<LexicalDecisionDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LexicalDecisionData(Table<O> child, ForeignKey<O, LexicalDecisionDataRecord> key) {
        super(child, key, LEXICAL_DECISION_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEXICAL_DECISION_DATA_LANG_IDX, Indexes.LEXICAL_DECISION_DATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexicalDecisionDataRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXICAL_DECISION_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexicalDecisionDataRecord> getPrimaryKey() {
        return Keys.LEXICAL_DECISION_DATA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexicalDecisionDataRecord>> getKeys() {
        return Arrays.<UniqueKey<LexicalDecisionDataRecord>>asList(Keys.LEXICAL_DECISION_DATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionData as(String alias) {
        return new LexicalDecisionData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexicalDecisionData as(Name alias) {
        return new LexicalDecisionData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexicalDecisionData rename(String name) {
        return new LexicalDecisionData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexicalDecisionData rename(Name name) {
        return new LexicalDecisionData(name, null);
    }
}
