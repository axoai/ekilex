/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.GrammarDatasetRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrammarDataset extends TableImpl<GrammarDatasetRecord> {

    private static final long serialVersionUID = 386015619;

    /**
     * The reference instance of <code>public.grammar_dataset</code>
     */
    public static final GrammarDataset GRAMMAR_DATASET = new GrammarDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GrammarDatasetRecord> getRecordType() {
        return GrammarDatasetRecord.class;
    }

    /**
     * The column <code>public.grammar_dataset.grammar_id</code>.
     */
    public final TableField<GrammarDatasetRecord, Long> GRAMMAR_ID = createField("grammar_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.grammar_dataset.dataset_code</code>.
     */
    public final TableField<GrammarDatasetRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.grammar_dataset</code> table reference
     */
    public GrammarDataset() {
        this(DSL.name("grammar_dataset"), null);
    }

    /**
     * Create an aliased <code>public.grammar_dataset</code> table reference
     */
    public GrammarDataset(String alias) {
        this(DSL.name(alias), GRAMMAR_DATASET);
    }

    /**
     * Create an aliased <code>public.grammar_dataset</code> table reference
     */
    public GrammarDataset(Name alias) {
        this(alias, GRAMMAR_DATASET);
    }

    private GrammarDataset(Name alias, Table<GrammarDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private GrammarDataset(Name alias, Table<GrammarDatasetRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GRAMMAR_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GrammarDatasetRecord> getPrimaryKey() {
        return Keys.GRAMMAR_DATASET_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GrammarDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<GrammarDatasetRecord>>asList(Keys.GRAMMAR_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GrammarDatasetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GrammarDatasetRecord, ?>>asList(Keys.GRAMMAR_DATASET__GRAMMAR_DATASET_GRAMMAR_ID_FKEY, Keys.GRAMMAR_DATASET__GRAMMAR_DATASET_DATASET_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrammarDataset as(String alias) {
        return new GrammarDataset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrammarDataset as(Name alias) {
        return new GrammarDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GrammarDataset rename(String name) {
        return new GrammarDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GrammarDataset rename(Name name) {
        return new GrammarDataset(name, null);
    }
}