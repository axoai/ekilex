/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwLexeme;
import eki.ekilex.data.db.udt.records.TypeUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class ViewWwLexemeRecord extends TableRecordImpl<ViewWwLexemeRecord> implements Record8<Long, Long, Long, String[], String[], String[], String[], TypeUsageRecord[]> {

    private static final long serialVersionUID = -751607058;

    /**
     * Setter for <code>public.view_ww_lexeme.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.word_id</code>.
     */
    public void setWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.advice_notes</code>.
     */
    public void setAdviceNotes(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.advice_notes</code>.
     */
    public String[] getAdviceNotes() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.public_notes</code>.
     */
    public void setPublicNotes(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.public_notes</code>.
     */
    public String[] getPublicNotes() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.grammars</code>.
     */
    public void setGrammars(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.grammars</code>.
     */
    public String[] getGrammars() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.governments</code>.
     */
    public void setGovernments(String... value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.governments</code>.
     */
    public String[] getGovernments() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>public.view_ww_lexeme.usages</code>.
     */
    public void setUsages(TypeUsageRecord... value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme.usages</code>.
     */
    public TypeUsageRecord[] getUsages() {
        return (TypeUsageRecord[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, String[], String[], String[], String[], TypeUsageRecord[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, String[], String[], String[], String[], TypeUsageRecord[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ViewWwLexeme.VIEW_WW_LEXEME.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ViewWwLexeme.VIEW_WW_LEXEME.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ViewWwLexeme.VIEW_WW_LEXEME.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return ViewWwLexeme.VIEW_WW_LEXEME.ADVICE_NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return ViewWwLexeme.VIEW_WW_LEXEME.PUBLIC_NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return ViewWwLexeme.VIEW_WW_LEXEME.GRAMMARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return ViewWwLexeme.VIEW_WW_LEXEME.GOVERNMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeUsageRecord[]> field8() {
        return ViewWwLexeme.VIEW_WW_LEXEME.USAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getAdviceNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getPublicNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getGrammars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component7() {
        return getGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord[] component8() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getAdviceNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getPublicNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getGrammars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord[] value8() {
        return getUsages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value2(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value3(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value4(String... value) {
        setAdviceNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value5(String... value) {
        setPublicNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value6(String... value) {
        setGrammars(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value7(String... value) {
        setGovernments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord value8(TypeUsageRecord... value) {
        setUsages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwLexemeRecord values(Long value1, Long value2, Long value3, String[] value4, String[] value5, String[] value6, String[] value7, TypeUsageRecord[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwLexemeRecord
     */
    public ViewWwLexemeRecord() {
        super(ViewWwLexeme.VIEW_WW_LEXEME);
    }

    /**
     * Create a detached, initialised ViewWwLexemeRecord
     */
    public ViewWwLexemeRecord(Long lexemeId, Long wordId, Long meaningId, String[] adviceNotes, String[] publicNotes, String[] grammars, String[] governments, TypeUsageRecord[] usages) {
        super(ViewWwLexeme.VIEW_WW_LEXEME);

        set(0, lexemeId);
        set(1, wordId);
        set(2, meaningId);
        set(3, adviceNotes);
        set(4, publicNotes);
        set(5, grammars);
        set(6, governments);
        set(7, usages);
    }
}
