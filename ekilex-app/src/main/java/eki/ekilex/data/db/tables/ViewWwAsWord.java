/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwAsWordRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwAsWord extends TableImpl<ViewWwAsWordRecord> {

    private static final long serialVersionUID = 395060923;

    /**
     * The reference instance of <code>public.view_ww_as_word</code>
     */
    public static final ViewWwAsWord VIEW_WW_AS_WORD = new ViewWwAsWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwAsWordRecord> getRecordType() {
        return ViewWwAsWordRecord.class;
    }

    /**
     * The column <code>public.view_ww_as_word.word_id</code>.
     */
    public final TableField<ViewWwAsWordRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_as_word.word</code>.
     */
    public final TableField<ViewWwAsWordRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_as_word.as_word</code>.
     */
    public final TableField<ViewWwAsWordRecord, String> AS_WORD = createField("as_word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.view_ww_as_word</code> table reference
     */
    public ViewWwAsWord() {
        this(DSL.name("view_ww_as_word"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_as_word</code> table reference
     */
    public ViewWwAsWord(String alias) {
        this(DSL.name(alias), VIEW_WW_AS_WORD);
    }

    /**
     * Create an aliased <code>public.view_ww_as_word</code> table reference
     */
    public ViewWwAsWord(Name alias) {
        this(alias, VIEW_WW_AS_WORD);
    }

    private ViewWwAsWord(Name alias, Table<ViewWwAsWordRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwAsWord(Name alias, Table<ViewWwAsWordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public ViewWwAsWord as(String alias) {
        return new ViewWwAsWord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwAsWord as(Name alias) {
        return new ViewWwAsWord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwAsWord rename(String name) {
        return new ViewWwAsWord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwAsWord rename(Name name) {
        return new ViewWwAsWord(name, null);
    }
}
