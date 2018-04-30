/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.LexColloc;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexCollocRecord extends UpdatableRecordImpl<LexCollocRecord> implements Record6<Long, Long, Long, Long, BigDecimal, Long> {

    private static final long serialVersionUID = 1048346567;

    /**
     * Setter for <code>public.lex_colloc.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lex_colloc.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.lex_colloc.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lex_colloc.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.lex_colloc.rel_group_id</code>.
     */
    public void setRelGroupId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lex_colloc.rel_group_id</code>.
     */
    public Long getRelGroupId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.lex_colloc.collocation_id</code>.
     */
    public void setCollocationId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lex_colloc.collocation_id</code>.
     */
    public Long getCollocationId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.lex_colloc.weight</code>.
     */
    public void setWeight(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.lex_colloc.weight</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.lex_colloc.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.lex_colloc.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LexColloc.LEX_COLLOC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LexColloc.LEX_COLLOC.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return LexColloc.LEX_COLLOC.REL_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return LexColloc.LEX_COLLOC.COLLOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return LexColloc.LEX_COLLOC.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return LexColloc.LEX_COLLOC.ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRelGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCollocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRelGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCollocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value2(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value3(Long value) {
        setRelGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value4(Long value) {
        setCollocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value5(BigDecimal value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord value6(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocRecord values(Long value1, Long value2, Long value3, Long value4, BigDecimal value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LexCollocRecord
     */
    public LexCollocRecord() {
        super(LexColloc.LEX_COLLOC);
    }

    /**
     * Create a detached, initialised LexCollocRecord
     */
    public LexCollocRecord(Long id, Long lexemeId, Long relGroupId, Long collocationId, BigDecimal weight, Long orderBy) {
        super(LexColloc.LEX_COLLOC);

        set(0, id);
        set(1, lexemeId);
        set(2, relGroupId);
        set(3, collocationId);
        set(4, weight);
        set(5, orderBy);
    }
}
