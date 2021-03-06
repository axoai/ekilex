function selectDatasets(selection) {
	$('#datasetSelectDlg').find(':checkbox').prop('checked', selection)
}

function displayDetailConditionButtons() {
	$('[name="removeDetailConditionBtn"]').each(function(i, v) {
		let groupElement = $(this).closest('[name="detailGroup"]');
		if (groupElement.find('[name="detailCondition"]').length === 1) {
			$(this).hide();
		} else {
			$(this).show();
		}
	});
}

function displayDetailGroupButtons() {
	if ($('[name="detailGroup"]').length === 1) {
		$('[name="removeDetailGroupBtn"]').hide();
	} else {
		$('[name="removeDetailGroupBtn"]').show();
	}
}

function displaySimpleSearch() {
	$("#simple_search_filter").prop('hidden', false);
	$("#detail_search_filter").prop('hidden', true);
	$('#searchMode').val('SIMPLE');
	$('#searchModeBtn').text('Detailotsing');
}

function displayDetailSearch() {
	$("#simple_search_filter").prop('hidden', true);
	$("#detail_search_filter").prop('hidden', false);
	$('#searchMode').val('DETAIL');
	$('#searchModeBtn').text('Lihtotsing');
}

function toggleSearch() {
	let currentSearchMode = $('#searchMode').val();
	if (currentSearchMode === 'SIMPLE') {
		displayDetailSearch();
	} else {
		displaySimpleSearch();
	}
}

function initaliseSearchForm() {
	$('#searchModeBtn').on('click', toggleSearch);
	let datasetDlg = $('#datasetSelectDlg');
	datasetDlg.on('shown.bs.modal', () => {
		datasetDlg.find('.btn').first().focus();
	})
}

function initialiseDeatailSearch() {
	displayDetailConditionButtons();
	displayDetailGroupButtons();

	$(document).on("click", ":button[name='removeDetailConditionBtn']", function() {
		$(this).closest('[name="detailCondition"]').remove();
		displayDetailConditionButtons();
	});

	$(document).on("click", ":button[name='removeDetailGroupBtn']", function() {
		$(this).closest('[name="detailGroup"]').remove();
		displayDetailGroupButtons();
	});

	$(document).on("change", "select[name$='entity']", function() {

		let searchEntityVal = $(this).val();
		let detailGroupElement = $(this).closest('[name="detailGroup"]');
		while (detailGroupElement.find('[name="detailCondition"]').length > 1) {
			detailGroupElement.find('[name="detailCondition"]').last().remove();
		}
		let conditionElement = detailGroupElement.find('[name="detailCondition"]').first();
		let searchKeyElement = conditionElement.find('[name$="searchKey"]');
		let keyTemplate = $('#searchKeyTemplates').find('[name="' + searchEntityVal + '"]');
		searchKeyElement.find('option').remove();
		searchKeyElement.append(keyTemplate.html());
		searchKeyElement.val(searchKeyElement.find('option').first().val());
		initCondition(conditionElement);
	});

	$(document).on("change", "select[name$='searchKey']", function() {

		let searchKeyVal = $(this).val();
		let searchOperandElement = $(this).closest('[name="detailCondition"]').find('[name$="searchOperand"]');
		let operandTemplate = $('#searchOperandTemplates').find('[name="' + searchKeyVal + '"]');
		searchOperandElement.find('option').remove();
		searchOperandElement.append(operandTemplate.html());
		searchOperandElement.val(searchOperandElement.find('option').first().val());

		// should lookup by search key + operand
		let searchValueElement = $(this).closest('[name="detailCondition"]').find('[name$="searchValue"]');
		let templateElement = $('#searchValueTemplates').find('[name="' + searchKeyVal + '"]');
		let copyOfValueTemplate = $(templateElement.html());
		copyOfValueTemplate.attr('name', searchValueElement.attr('name'));
		searchValueElement.closest('div').attr('class', templateElement.attr('class'));
		searchValueElement.replaceWith(copyOfValueTemplate);
	});

	$(document).on("change", "select[name$='searchOperand']", function() {

		let searchOperandVal = $(this).val();
		let searchKeyElement = $(this).closest('[name="detailCondition"]').find('[name$="searchKey"] option:selected');
		let searchKeyVal = searchKeyElement.val();

		let searchValueElement = $(this).closest('[name="detailCondition"]').find('[name$="searchValue"]');
		if (searchOperandVal == 'NOT_EXISTS') {
			searchValueElement.empty();
			searchValueElement.prop('hidden', true);
		} else {
			let templateElement = $('#searchValueTemplates').find('[name="' + searchKeyVal + '"]');
			let copyOfValueTemplate = $(templateElement.html());
			copyOfValueTemplate.attr('name', searchValueElement.attr('name'));
			searchValueElement.closest('div').attr('class', templateElement.attr('class'));
			searchValueElement.replaceWith(copyOfValueTemplate);
		}
	});

	$(document).on("click", ":button[name='addDetailConditionBtn']", function() {
		let detailGroupElement = $(this).closest('[name="detailGroup"]');
		let addedConditionElement = createAndAttachCopyFromLastItem(detailGroupElement, 'detailCondition', 'searchCriteria');
		initCondition(addedConditionElement);
	});

	$(document).on("click", ":button[name='addDetailGroupBtn']", function() {
		let detailSearchElement = $("#detail_search_filter");
		let addedGroupElement = createAndAttachCopyFromLastItem(detailSearchElement, 'detailGroup', 'criteriaGroups');
		initConditionGroup(addedGroupElement);
	});
}

function createAndAttachCopyFromLastItem(parentElement, itemName, indexName) {
	let lastElement = parentElement.find('[name="' + itemName + '"]').last();
	let copyOfLastElement = lastElement.clone();
	let oldIndex = copyOfLastElement.data('index');
	let newIndex = oldIndex + 1;
	let oldIndexVal = indexName + '[' + oldIndex + ']';
	let newIndexVal = indexName + '[' + newIndex + ']';
	copyOfLastElement.attr('data-index', newIndex);
	copyOfLastElement.find('[name*="' + indexName + '["]').each(function(i, v) {
		$(this).attr('name', $(this).attr('name').replace(oldIndexVal, newIndexVal))
	});
	copyOfLastElement.find('input').val(null);
	lastElement.after(copyOfLastElement);
	return parentElement.find('[name="' + itemName + '"]').last();
}

function initConditionGroup(groupElement) {
	let entitySelect = groupElement.find('select[name$="entity"]');
	entitySelect.val(entitySelect.find('option').first().val());
	entitySelect.trigger('change');
	displayDetailGroupButtons();
}

function initCondition(conditionElement) {
	let searchKeySelect = conditionElement.find('select[name$="searchKey"]');
	searchKeySelect.val(searchKeySelect.find('option').first().val());
	searchKeySelect.trigger('change');
	displayDetailConditionButtons();
}