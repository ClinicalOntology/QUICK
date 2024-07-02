package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import java.math.BigDecimal;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class QuantityImpl extends DatatypeImpl implements Quantity {

	private BigDecimal value;
	private String comparator;
	private String unit;
	private String system;
	private String code;

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal arg) {
		this.value=arg;
	}

	public String getComparator() {
		return this.comparator;
	}

	public void setComparator(String arg) {
		this.comparator=arg;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String arg) {
		this.unit=arg;
	}

	public String getSystem() {
		return this.system;
	}

	public void setSystem(String arg) {
		this.system=arg;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String arg) {
		this.code=arg;
	}

}