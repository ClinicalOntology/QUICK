package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.SampledData;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.math.BigDecimal;
import java.lang.Integer;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SampledDataImpl extends DatatypeImpl implements SampledData {

	private SimpleQuantity origin;
	private BigDecimal period;
	private BigDecimal factor;
	private BigDecimal lowerLimit;
	private BigDecimal upperLimit;
	private Integer dimensions;
	private String data;

	public SimpleQuantity getOrigin() {
		return this.origin;
	}

	public void setOrigin(SimpleQuantity arg) {
		this.origin=arg;
	}

	public BigDecimal getPeriod() {
		return this.period;
	}

	public void setPeriod(BigDecimal arg) {
		this.period=arg;
	}

	public BigDecimal getFactor() {
		return this.factor;
	}

	public void setFactor(BigDecimal arg) {
		this.factor=arg;
	}

	public BigDecimal getLowerLimit() {
		return this.lowerLimit;
	}

	public void setLowerLimit(BigDecimal arg) {
		this.lowerLimit=arg;
	}

	public BigDecimal getUpperLimit() {
		return this.upperLimit;
	}

	public void setUpperLimit(BigDecimal arg) {
		this.upperLimit=arg;
	}

	public Integer getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(Integer arg) {
		this.dimensions=arg;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String arg) {
		this.data=arg;
	}

}