$(document).on("change", "select.term-def-dataset-select[name='dataset']", function() {
	var datasetCode = $(this).val();
	var permLanguageSelect = $("#definitionPermLanguageSelect");
	if (datasetCode) {
		var getLanguageSelectUrl = applicationUrl + "comp/termdeflangselect/" + datasetCode;
		$.get(getLanguageSelectUrl).done(function(data) {
			permLanguageSelect.replaceWith(data);
		}).fail(function(data) {
			console.log(data);
			alert('Viga!');
		});
	} else {
		permLanguageSelect.empty();
	}
});

$(document).on("change", "select.lex-data-select[name='opCode']", function() {
	var opCode = $(this).val();
	var localForm = $(this).closest("form");
	localForm.find(".value-group").hide();
	var lexemeId = localForm.find("[name=id]").val();
	var dlgElemId = "#" + opCode + '_' + lexemeId;
	if (opCode.endsWith('Dlg')) {
		$(dlgElemId).modal("show");
		$("#addLexemeDataDlg_" + lexemeId).modal("hide");
	} else {
		$(dlgElemId).show();
	}
});

$(document).on("show.bs.modal", "[id^=addLexemeDataDlg_]", function() {
	initAddMultiDataDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addDefinitionDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editDefinitionDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=addLexemeSourceLinkDlg_]", function() {
	initAddSourceLinkDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addUsageSourceLinkDlg_]", function() {
	initAddSourceLinkDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addUsageDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editUsageDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=addLexemeRelationDlg_]", function() {
	initAddLexemeRelationDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addLexemePublicNoteDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editLexemePublicNoteDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=addMeaningDomainDlg_]", function() {
	initAddMultiDataDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editMeaningDomainDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addDefinitionSourceLinkDlg_]", function() {
	initAddSourceLinkDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addLearnerCommentDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=editLearnerCommentDlg_]", function(e) {
	initEkiEditorDlg($(this));
	alignAndFocus(e, $(this));
});

$(document).on("show.bs.modal", "[id^=addMeaningRelationDlg_]", function() {
	initAddMeaningRelationDlg($(this));
});

$(document).on("show.bs.modal", "[id^=addPublicNoteSourceLinkDlg_]", function() {
	initAddSourceLinkDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editWordGenderDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeProcessStateDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeValueStateCodeDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeGrammarDlg_]", function() {
	initGenericTextEditDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeFrequencyGroupDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemePosDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeDerivDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeRegisterDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editLexemeRegionDlg_]", function() {
	initSelectDlg($(this));
});

$(document).on("show.bs.modal", "[id^=editMeaningDomainDlg_]", function() {
	initSelectDlg($(this));
});
