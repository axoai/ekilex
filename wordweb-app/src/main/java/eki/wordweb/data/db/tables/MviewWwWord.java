/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwWordRecord;
import eki.wordweb.data.db.udt.records.TypeDefinitionRecord;
import eki.wordweb.data.db.udt.records.TypeWordRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwWord extends TableImpl<MviewWwWordRecord> {

    private static final long serialVersionUID = -1410107102;

    /**
     * The reference instance of <code>public.mview_ww_word</code>
     */
    public static final MviewWwWord MVIEW_WW_WORD = new MviewWwWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwWordRecord> getRecordType() {
        return MviewWwWordRecord.class;
    }

    /**
     * The column <code>public.mview_ww_word.word_id</code>.
     */
    public final TableField<MviewWwWordRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_word.word</code>.
     */
    public final TableField<MviewWwWordRecord, String> WORD = createField("word", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_word.homonym_nr</code>.
     */
    public final TableField<MviewWwWordRecord, Integer> HOMONYM_NR = createField("homonym_nr", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_word.lang</code>.
     */
    public final TableField<MviewWwWordRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>public.mview_ww_word.morph_code</code>.
     */
    public final TableField<MviewWwWordRecord, String> MORPH_CODE = createField("morph_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_word.display_morph_code</code>.
     */
    public final TableField<MviewWwWordRecord, String> DISPLAY_MORPH_CODE = createField("display_morph_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_word.type_code</code>.
     */
    public final TableField<MviewWwWordRecord, String> TYPE_CODE = createField("type_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_word.aspect_code</code>.
     */
    public final TableField<MviewWwWordRecord, String> ASPECT_CODE = createField("aspect_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_word.dataset_codes</code>.
     */
    public final TableField<MviewWwWordRecord, String[]> DATASET_CODES = createField("dataset_codes", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_word.meaning_count</code>.
     */
    public final TableField<MviewWwWordRecord, Integer> MEANING_COUNT = createField("meaning_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_word.meaning_words</code>.
     */
    public final TableField<MviewWwWordRecord, TypeWordRecord[]> MEANING_WORDS = createField("meaning_words", eki.wordweb.data.db.udt.TypeWord.TYPE_WORD.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_word.definitions</code>.
     */
    public final TableField<MviewWwWordRecord, TypeDefinitionRecord[]> DEFINITIONS = createField("definitions", eki.wordweb.data.db.udt.TypeDefinition.TYPE_DEFINITION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.mview_ww_word</code> table reference
     */
    public MviewWwWord() {
        this(DSL.name("mview_ww_word"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_word</code> table reference
     */
    public MviewWwWord(String alias) {
        this(DSL.name(alias), MVIEW_WW_WORD);
    }

    /**
     * Create an aliased <code>public.mview_ww_word</code> table reference
     */
    public MviewWwWord(Name alias) {
        this(alias, MVIEW_WW_WORD);
    }

    private MviewWwWord(Name alias, Table<MviewWwWordRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwWord(Name alias, Table<MviewWwWordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MviewWwWord(Table<O> child, ForeignKey<O, MviewWwWordRecord> key) {
        super(child, key, MVIEW_WW_WORD);
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
        return Arrays.<Index>asList(Indexes.MVIEW_WW_WORD_LANG_IDX, Indexes.MVIEW_WW_WORD_VALUE_IDX, Indexes.MVIEW_WW_WORD_VALUE_PREFIX_IDX, Indexes.MVIEW_WW_WORD_WORD_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWord as(String alias) {
        return new MviewWwWord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWord as(Name alias) {
        return new MviewWwWord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWord rename(String name) {
        return new MviewWwWord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWord rename(Name name) {
        return new MviewWwWord(name, null);
    }
}
