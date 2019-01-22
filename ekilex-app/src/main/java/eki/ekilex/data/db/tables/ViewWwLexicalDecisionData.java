/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwLexicalDecisionDataRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexicalDecisionData extends TableImpl<ViewWwLexicalDecisionDataRecord> {

    private static final long serialVersionUID = 615746160;

    /**
     * The reference instance of <code>public.view_ww_lexical_decision_data</code>
     */
    public static final ViewWwLexicalDecisionData VIEW_WW_LEXICAL_DECISION_DATA = new ViewWwLexicalDecisionData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwLexicalDecisionDataRecord> getRecordType() {
        return ViewWwLexicalDecisionDataRecord.class;
    }

    /**
     * The column <code>public.view_ww_lexical_decision_data.word</code>.
     */
    public final TableField<ViewWwLexicalDecisionDataRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_lexical_decision_data.lang</code>.
     */
    public final TableField<ViewWwLexicalDecisionDataRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.view_ww_lexical_decision_data.is_word</code>.
     */
    public final TableField<ViewWwLexicalDecisionDataRecord, Boolean> IS_WORD = createField("is_word", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>public.view_ww_lexical_decision_data</code> table reference
     */
    public ViewWwLexicalDecisionData() {
        this(DSL.name("view_ww_lexical_decision_data"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_lexical_decision_data</code> table reference
     */
    public ViewWwLexicalDecisionData(String alias) {
        this(DSL.name(alias), VIEW_WW_LEXICAL_DECISION_DATA);
    }

    /**
     * Create an aliased <code>public.view_ww_lexical_decision_data</code> table reference
     */
    public ViewWwLexicalDecisionData(Name alias) {
        this(alias, VIEW_WW_LEXICAL_DECISION_DATA);
    }

    private ViewWwLexicalDecisionData(Name alias, Table<ViewWwLexicalDecisionDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwLexicalDecisionData(Name alias, Table<ViewWwLexicalDecisionDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewWwLexicalDecisionData(Table<O> child, ForeignKey<O, ViewWwLexicalDecisionDataRecord> key) {
        super(child, key, VIEW_WW_LEXICAL_DECISION_DATA);
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
    public ViewWwLexicalDecisionData as(String alias) {
        return new ViewWwLexicalDecisionData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexicalDecisionData as(Name alias) {
        return new ViewWwLexicalDecisionData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexicalDecisionData rename(String name) {
        return new ViewWwLexicalDecisionData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexicalDecisionData rename(Name name) {
        return new ViewWwLexicalDecisionData(name, null);
    }
}
