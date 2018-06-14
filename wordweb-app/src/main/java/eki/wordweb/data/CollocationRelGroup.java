package eki.wordweb.data;

import java.util.List;

import eki.common.data.AbstractDataObject;

public class CollocationRelGroup extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private String name;

	private List<Collocation> collocations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Collocation> getCollocations() {
		return collocations;
	}

	public void setCollocations(List<Collocation> collocations) {
		this.collocations = collocations;
	}

}