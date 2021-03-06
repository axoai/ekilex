package eki.ekilex.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import eki.common.data.AbstractDataObject;

public class Classifier extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private String name;

	private String origin;

	private String code;

	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toIdString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).setExcludeFieldNames("value").toString();
	}

	@Override
	public boolean equals(Object object) {
		return EqualsBuilder.reflectionEquals(this, object, "value");
	}

}
