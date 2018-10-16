/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db;


import eki.wordweb.data.db.tables.MviewWwAsWord;
import eki.wordweb.data.db.tables.MviewWwClassifier;
import eki.wordweb.data.db.tables.MviewWwCollocation;
import eki.wordweb.data.db.tables.MviewWwForm;
import eki.wordweb.data.db.tables.MviewWwLexeme;
import eki.wordweb.data.db.tables.MviewWwLexemeRelation;
import eki.wordweb.data.db.tables.MviewWwMeaning;
import eki.wordweb.data.db.tables.MviewWwMeaningRelation;
import eki.wordweb.data.db.tables.MviewWwWord;
import eki.wordweb.data.db.tables.MviewWwWordRelation;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index MVIEW_WW_AS_WORD_VALUE_IDX = Indexes0.MVIEW_WW_AS_WORD_VALUE_IDX;
    public static final Index MVIEW_WW_AS_WORD_VALUE_PREFIX_IDX = Indexes0.MVIEW_WW_AS_WORD_VALUE_PREFIX_IDX;
    public static final Index MVIEW_WW_AS_WORD_WORD_ID_IDX = Indexes0.MVIEW_WW_AS_WORD_WORD_ID_IDX;
    public static final Index MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_IDX = Indexes0.MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_IDX;
    public static final Index MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_IDX = Indexes0.MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_IDX;
    public static final Index MVIEW_WW_COLLOCATION_DATASET_CODE_IDX = Indexes0.MVIEW_WW_COLLOCATION_DATASET_CODE_IDX;
    public static final Index MVIEW_WW_COLLOCATION_LEXEME_ID_IDX = Indexes0.MVIEW_WW_COLLOCATION_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_COLLOCATION_WORD_ID_IDX = Indexes0.MVIEW_WW_COLLOCATION_WORD_ID_IDX;
    public static final Index MVIEW_WW_FORM_LANG_IDX = Indexes0.MVIEW_WW_FORM_LANG_IDX;
    public static final Index MVIEW_WW_FORM_MODE_IDX = Indexes0.MVIEW_WW_FORM_MODE_IDX;
    public static final Index MVIEW_WW_FORM_VALUE_IDX = Indexes0.MVIEW_WW_FORM_VALUE_IDX;
    public static final Index MVIEW_WW_FORM_WORD_ID_IDX = Indexes0.MVIEW_WW_FORM_WORD_ID_IDX;
    public static final Index MVIEW_WW_FORM_WORD_IDX = Indexes0.MVIEW_WW_FORM_WORD_IDX;
    public static final Index MVIEW_WW_LEXEME_LEXEME_ID_IDX = Indexes0.MVIEW_WW_LEXEME_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_MEANING_ID_IDX = Indexes0.MVIEW_WW_LEXEME_MEANING_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_WORD_ID_IDX = Indexes0.MVIEW_WW_LEXEME_WORD_ID_IDX;
    public static final Index MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX = Indexes0.MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_MEANING_DATASET_CODE_IDX = Indexes0.MVIEW_WW_MEANING_DATASET_CODE_IDX;
    public static final Index MVIEW_WW_MEANING_LEXEME_ID_IDX = Indexes0.MVIEW_WW_MEANING_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_MEANING_MEANING_ID_IDX = Indexes0.MVIEW_WW_MEANING_MEANING_ID_IDX;
    public static final Index MVIEW_WW_MEANING_WORD_ID_IDX = Indexes0.MVIEW_WW_MEANING_WORD_ID_IDX;
    public static final Index MVIEW_WW_MEANING_RELATION_LEXEME_ID_IDX = Indexes0.MVIEW_WW_MEANING_RELATION_LEXEME_ID_IDX;
    public static final Index MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX = Indexes0.MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX;
    public static final Index MVIEW_WW_WORD_LANG_IDX = Indexes0.MVIEW_WW_WORD_LANG_IDX;
    public static final Index MVIEW_WW_WORD_VALUE_IDX = Indexes0.MVIEW_WW_WORD_VALUE_IDX;
    public static final Index MVIEW_WW_WORD_VALUE_PREFIX_IDX = Indexes0.MVIEW_WW_WORD_VALUE_PREFIX_IDX;
    public static final Index MVIEW_WW_WORD_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_WORD_ID_IDX;
    public static final Index MVIEW_WW_WORD_RELATION_WORD_ID_IDX = Indexes0.MVIEW_WW_WORD_RELATION_WORD_ID_IDX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index MVIEW_WW_AS_WORD_VALUE_IDX = Internal.createIndex("mview_ww_as_word_value_idx", MviewWwAsWord.MVIEW_WW_AS_WORD, new OrderField[] { MviewWwAsWord.MVIEW_WW_AS_WORD.AS_WORD }, false);
        public static Index MVIEW_WW_AS_WORD_VALUE_PREFIX_IDX = Internal.createIndex("mview_ww_as_word_value_prefix_idx", MviewWwAsWord.MVIEW_WW_AS_WORD, new OrderField[] { MviewWwAsWord.MVIEW_WW_AS_WORD.AS_WORD }, false);
        public static Index MVIEW_WW_AS_WORD_WORD_ID_IDX = Internal.createIndex("mview_ww_as_word_word_id_idx", MviewWwAsWord.MVIEW_WW_AS_WORD, new OrderField[] { MviewWwAsWord.MVIEW_WW_AS_WORD.WORD_ID }, false);
        public static Index MVIEW_WW_CLASSIFIER_NAME_CODE_LANG_IDX = Internal.createIndex("mview_ww_classifier_name_code_lang_idx", MviewWwClassifier.MVIEW_WW_CLASSIFIER, new OrderField[] { MviewWwClassifier.MVIEW_WW_CLASSIFIER.NAME, MviewWwClassifier.MVIEW_WW_CLASSIFIER.CODE, MviewWwClassifier.MVIEW_WW_CLASSIFIER.LANG }, false);
        public static Index MVIEW_WW_CLASSIFIER_NAME_ORIGIN_CODE_LANG_IDX = Internal.createIndex("mview_ww_classifier_name_origin_code_lang_idx", MviewWwClassifier.MVIEW_WW_CLASSIFIER, new OrderField[] { MviewWwClassifier.MVIEW_WW_CLASSIFIER.NAME, MviewWwClassifier.MVIEW_WW_CLASSIFIER.ORIGIN, MviewWwClassifier.MVIEW_WW_CLASSIFIER.CODE, MviewWwClassifier.MVIEW_WW_CLASSIFIER.LANG }, false);
        public static Index MVIEW_WW_COLLOCATION_DATASET_CODE_IDX = Internal.createIndex("mview_ww_collocation_dataset_code_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.DATASET_CODE }, false);
        public static Index MVIEW_WW_COLLOCATION_LEXEME_ID_IDX = Internal.createIndex("mview_ww_collocation_lexeme_id_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.LEXEME_ID }, false);
        public static Index MVIEW_WW_COLLOCATION_WORD_ID_IDX = Internal.createIndex("mview_ww_collocation_word_id_idx", MviewWwCollocation.MVIEW_WW_COLLOCATION, new OrderField[] { MviewWwCollocation.MVIEW_WW_COLLOCATION.WORD_ID }, false);
        public static Index MVIEW_WW_FORM_LANG_IDX = Internal.createIndex("mview_ww_form_lang_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.LANG }, false);
        public static Index MVIEW_WW_FORM_MODE_IDX = Internal.createIndex("mview_ww_form_mode_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.MODE }, false);
        public static Index MVIEW_WW_FORM_VALUE_IDX = Internal.createIndex("mview_ww_form_value_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.FORM }, false);
        public static Index MVIEW_WW_FORM_WORD_ID_IDX = Internal.createIndex("mview_ww_form_word_id_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.WORD_ID }, false);
        public static Index MVIEW_WW_FORM_WORD_IDX = Internal.createIndex("mview_ww_form_word_idx", MviewWwForm.MVIEW_WW_FORM, new OrderField[] { MviewWwForm.MVIEW_WW_FORM.WORD }, false);
        public static Index MVIEW_WW_LEXEME_LEXEME_ID_IDX = Internal.createIndex("mview_ww_lexeme_lexeme_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.LEXEME_ID }, false);
        public static Index MVIEW_WW_LEXEME_MEANING_ID_IDX = Internal.createIndex("mview_ww_lexeme_meaning_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.MEANING_ID }, false);
        public static Index MVIEW_WW_LEXEME_WORD_ID_IDX = Internal.createIndex("mview_ww_lexeme_word_id_idx", MviewWwLexeme.MVIEW_WW_LEXEME, new OrderField[] { MviewWwLexeme.MVIEW_WW_LEXEME.WORD_ID }, false);
        public static Index MVIEW_WW_LEXEME_RELATION_LEXEME_ID_IDX = Internal.createIndex("mview_ww_lexeme_relation_lexeme_id_idx", MviewWwLexemeRelation.MVIEW_WW_LEXEME_RELATION, new OrderField[] { MviewWwLexemeRelation.MVIEW_WW_LEXEME_RELATION.LEXEME_ID }, false);
        public static Index MVIEW_WW_MEANING_DATASET_CODE_IDX = Internal.createIndex("mview_ww_meaning_dataset_code_idx", MviewWwMeaning.MVIEW_WW_MEANING, new OrderField[] { MviewWwMeaning.MVIEW_WW_MEANING.DATASET_CODE }, false);
        public static Index MVIEW_WW_MEANING_LEXEME_ID_IDX = Internal.createIndex("mview_ww_meaning_lexeme_id_idx", MviewWwMeaning.MVIEW_WW_MEANING, new OrderField[] { MviewWwMeaning.MVIEW_WW_MEANING.LEXEME_ID }, false);
        public static Index MVIEW_WW_MEANING_MEANING_ID_IDX = Internal.createIndex("mview_ww_meaning_meaning_id_idx", MviewWwMeaning.MVIEW_WW_MEANING, new OrderField[] { MviewWwMeaning.MVIEW_WW_MEANING.MEANING_ID }, false);
        public static Index MVIEW_WW_MEANING_WORD_ID_IDX = Internal.createIndex("mview_ww_meaning_word_id_idx", MviewWwMeaning.MVIEW_WW_MEANING, new OrderField[] { MviewWwMeaning.MVIEW_WW_MEANING.WORD_ID }, false);
        public static Index MVIEW_WW_MEANING_RELATION_LEXEME_ID_IDX = Internal.createIndex("mview_ww_meaning_relation_lexeme_id_idx", MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION, new OrderField[] { MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION.LEXEME_ID }, false);
        public static Index MVIEW_WW_MEANING_RELATION_MEANING_ID_IDX = Internal.createIndex("mview_ww_meaning_relation_meaning_id_idx", MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION, new OrderField[] { MviewWwMeaningRelation.MVIEW_WW_MEANING_RELATION.MEANING_ID }, false);
        public static Index MVIEW_WW_WORD_LANG_IDX = Internal.createIndex("mview_ww_word_lang_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.LANG }, false);
        public static Index MVIEW_WW_WORD_VALUE_IDX = Internal.createIndex("mview_ww_word_value_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD }, false);
        public static Index MVIEW_WW_WORD_VALUE_PREFIX_IDX = Internal.createIndex("mview_ww_word_value_prefix_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD }, false);
        public static Index MVIEW_WW_WORD_WORD_ID_IDX = Internal.createIndex("mview_ww_word_word_id_idx", MviewWwWord.MVIEW_WW_WORD, new OrderField[] { MviewWwWord.MVIEW_WW_WORD.WORD_ID }, false);
        public static Index MVIEW_WW_WORD_RELATION_WORD_ID_IDX = Internal.createIndex("mview_ww_word_relation_word_id_idx", MviewWwWordRelation.MVIEW_WW_WORD_RELATION, new OrderField[] { MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_ID }, false);
    }
}
