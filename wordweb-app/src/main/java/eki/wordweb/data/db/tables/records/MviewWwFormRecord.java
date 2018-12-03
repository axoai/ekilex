/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwForm;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.TableRecordImpl;


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
public class MviewWwFormRecord extends TableRecordImpl<MviewWwFormRecord> implements Record19<Long, String, String, String[], Long, Long, String, String, String, String, Integer, String, Boolean, String, String[], String, String, String, Integer> {

    private static final long serialVersionUID = 659706146;

    /**
     * Setter for <code>public.mview_ww_form.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_form.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_form.lang</code>.
     */
    public void setLang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.lang</code>.
     */
    public String getLang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mview_ww_form.dataset_codes</code>.
     */
    public void setDatasetCodes(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.dataset_codes</code>.
     */
    public String[] getDatasetCodes() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.mview_ww_form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.mview_ww_form.form_id</code>.
     */
    public void setFormId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.form_id</code>.
     */
    public Long getFormId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.mview_ww_form.mode</code>.
     */
    public void setMode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.mode</code>.
     */
    public String getMode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_group1</code>.
     */
    public void setMorphGroup1(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_group1</code>.
     */
    public String getMorphGroup1() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_group2</code>.
     */
    public void setMorphGroup2(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_group2</code>.
     */
    public String getMorphGroup2() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_group3</code>.
     */
    public void setMorphGroup3(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_group3</code>.
     */
    public String getMorphGroup3() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.mview_ww_form.display_level</code>.
     */
    public void setDisplayLevel(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.display_level</code>.
     */
    public Integer getDisplayLevel() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_exists</code>.
     */
    public void setMorphExists(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_exists</code>.
     */
    public Boolean getMorphExists() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.mview_ww_form.form</code>.
     */
    public void setForm(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.form</code>.
     */
    public String getForm() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.mview_ww_form.components</code>.
     */
    public void setComponents(String... value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(14);
    }

    /**
     * Setter for <code>public.mview_ww_form.display_form</code>.
     */
    public void setDisplayForm(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.display_form</code>.
     */
    public String getDisplayForm() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.mview_ww_form.vocal_form</code>.
     */
    public void setVocalForm(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.vocal_form</code>.
     */
    public String getVocalForm() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.mview_ww_form.sound_file</code>.
     */
    public void setSoundFile(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.sound_file</code>.
     */
    public String getSoundFile() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.mview_ww_form.order_by</code>.
     */
    public void setOrderBy(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.order_by</code>.
     */
    public Integer getOrderBy() {
        return (Integer) get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, String, String[], Long, Long, String, String, String, String, Integer, String, Boolean, String, String[], String, String, String, Integer> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, String, String[], Long, Long, String, String, String, String, Integer, String, Boolean, String, String[], String, String, String, Integer> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MviewWwForm.MVIEW_WW_FORM.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MviewWwForm.MVIEW_WW_FORM.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MviewWwForm.MVIEW_WW_FORM.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return MviewWwForm.MVIEW_WW_FORM.DATASET_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return MviewWwForm.MVIEW_WW_FORM.PARADIGM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return MviewWwForm.MVIEW_WW_FORM.FORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MviewWwForm.MVIEW_WW_FORM.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_GROUP1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_GROUP2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_GROUP3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return MviewWwForm.MVIEW_WW_FORM.DISPLAY_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_EXISTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return MviewWwForm.MVIEW_WW_FORM.FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field15() {
        return MviewWwForm.MVIEW_WW_FORM.COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return MviewWwForm.MVIEW_WW_FORM.DISPLAY_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return MviewWwForm.MVIEW_WW_FORM.VOCAL_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return MviewWwForm.MVIEW_WW_FORM.SOUND_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return MviewWwForm.MVIEW_WW_FORM.ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getDatasetCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMorphGroup1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMorphGroup2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMorphGroup3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getDisplayLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getMorphExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component15() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getDatasetCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMorphGroup1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMorphGroup2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMorphGroup3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getDisplayLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getMorphExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value15() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value2(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value3(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value4(String... value) {
        setDatasetCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value5(Long value) {
        setParadigmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value6(Long value) {
        setFormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value7(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value8(String value) {
        setMorphGroup1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value9(String value) {
        setMorphGroup2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value10(String value) {
        setMorphGroup3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value11(Integer value) {
        setDisplayLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value12(String value) {
        setMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value13(Boolean value) {
        setMorphExists(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value14(String value) {
        setForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value15(String... value) {
        setComponents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value16(String value) {
        setDisplayForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value17(String value) {
        setVocalForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value18(String value) {
        setSoundFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value19(Integer value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord values(Long value1, String value2, String value3, String[] value4, Long value5, Long value6, String value7, String value8, String value9, String value10, Integer value11, String value12, Boolean value13, String value14, String[] value15, String value16, String value17, String value18, Integer value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwFormRecord
     */
    public MviewWwFormRecord() {
        super(MviewWwForm.MVIEW_WW_FORM);
    }

    /**
     * Create a detached, initialised MviewWwFormRecord
     */
    public MviewWwFormRecord(Long wordId, String word, String lang, String[] datasetCodes, Long paradigmId, Long formId, String mode, String morphGroup1, String morphGroup2, String morphGroup3, Integer displayLevel, String morphCode, Boolean morphExists, String form, String[] components, String displayForm, String vocalForm, String soundFile, Integer orderBy) {
        super(MviewWwForm.MVIEW_WW_FORM);

        set(0, wordId);
        set(1, word);
        set(2, lang);
        set(3, datasetCodes);
        set(4, paradigmId);
        set(5, formId);
        set(6, mode);
        set(7, morphGroup1);
        set(8, morphGroup2);
        set(9, morphGroup3);
        set(10, displayLevel);
        set(11, morphCode);
        set(12, morphExists);
        set(13, form);
        set(14, components);
        set(15, displayForm);
        set(16, vocalForm);
        set(17, soundFile);
        set(18, orderBy);
    }
}
