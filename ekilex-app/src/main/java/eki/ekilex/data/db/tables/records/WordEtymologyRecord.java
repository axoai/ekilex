/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.WordEtymology;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WordEtymologyRecord extends UpdatableRecordImpl<WordEtymologyRecord> implements Record7<Long, Long, Long, String[], Boolean, Boolean, Long> {

    private static final long serialVersionUID = 813580129;

    /**
     * Setter for <code>public.word_etymology.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.word_etymology.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.word_etymology.word1_id</code>.
     */
    public void setWord1Id(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.word_etymology.word1_id</code>.
     */
    public Long getWord1Id() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.word_etymology.word2_id</code>.
     */
    public void setWord2Id(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.word_etymology.word2_id</code>.
     */
    public Long getWord2Id() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.word_etymology.comments</code>.
     */
    public void setComments(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.word_etymology.comments</code>.
     */
    public String[] getComments() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.word_etymology.is_questionable</code>.
     */
    public void setIsQuestionable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.word_etymology.is_questionable</code>.
     */
    public Boolean getIsQuestionable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.word_etymology.is_compound</code>.
     */
    public void setIsCompound(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.word_etymology.is_compound</code>.
     */
    public Boolean getIsCompound() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.word_etymology.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.word_etymology.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, String[], Boolean, Boolean, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, String[], Boolean, Boolean, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return WordEtymology.WORD_ETYMOLOGY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return WordEtymology.WORD_ETYMOLOGY.WORD1_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return WordEtymology.WORD_ETYMOLOGY.WORD2_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return WordEtymology.WORD_ETYMOLOGY.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return WordEtymology.WORD_ETYMOLOGY.IS_QUESTIONABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return WordEtymology.WORD_ETYMOLOGY.IS_COMPOUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return WordEtymology.WORD_ETYMOLOGY.ORDER_BY;
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
        return getWord1Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getWord2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsQuestionable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsCompound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
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
        return getWord1Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getWord2Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsQuestionable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsCompound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value2(Long value) {
        setWord1Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value3(Long value) {
        setWord2Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value4(String... value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value5(Boolean value) {
        setIsQuestionable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value6(Boolean value) {
        setIsCompound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord value7(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordEtymologyRecord values(Long value1, Long value2, Long value3, String[] value4, Boolean value5, Boolean value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordEtymologyRecord
     */
    public WordEtymologyRecord() {
        super(WordEtymology.WORD_ETYMOLOGY);
    }

    /**
     * Create a detached, initialised WordEtymologyRecord
     */
    public WordEtymologyRecord(Long id, Long word1Id, Long word2Id, String[] comments, Boolean isQuestionable, Boolean isCompound, Long orderBy) {
        super(WordEtymology.WORD_ETYMOLOGY);

        set(0, id);
        set(1, word1Id);
        set(2, word2Id);
        set(3, comments);
        set(4, isQuestionable);
        set(5, isCompound);
        set(6, orderBy);
    }
}
