package org.reimagineehr.model.quick.r4.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.SampledData;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.math.BigDecimal;
import java.lang.Integer;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SampledDataWrapper implements SampledData {

	private org.hl7.fhir.r4.model.SampledData adaptee;

	public SampledDataWrapper() {
	
	}

	public SampledDataWrapper(org.hl7.fhir.r4.model.SampledData adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.SampledData getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.SampledData arg) {
		this.adaptee=arg;
	}

	public SimpleQuantity getOrigin() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.convertQuantityToSimpleQuantityWrapper(this.adaptee.getOrigin());
	}

	public void setOrigin(SimpleQuantity arg) {
		this.adaptee.setOrigin(org.reimagineehr.model.quick.r4.utils.R4Utils.convertSimpleQuantityWrapperToQuantity(arg));
	}

	public BigDecimal getPeriod() {
	return this.adaptee.getPeriodElement().getValue();
	}

	public void setPeriod(BigDecimal arg) {
	this.adaptee.setPeriod(arg);
	}

	public BigDecimal getFactor() {
	return this.adaptee.getFactorElement().getValue();
	}

	public void setFactor(BigDecimal arg) {
	this.adaptee.setFactor(arg);
	}

	public BigDecimal getLowerLimit() {
	return this.adaptee.getLowerLimitElement().getValue();
	}

	public void setLowerLimit(BigDecimal arg) {
	this.adaptee.setLowerLimit(arg);
	}

	public BigDecimal getUpperLimit() {
	return this.adaptee.getUpperLimitElement().getValue();
	}

	public void setUpperLimit(BigDecimal arg) {
	this.adaptee.setUpperLimit(arg);
	}

	public Integer getDimensions() {
	return this.adaptee.getDimensionsElement().getValue();
	}

	public void setDimensions(Integer arg) {
	this.adaptee.setDimensions(arg);
	}

	public String getData() {
	return this.adaptee.getDataElement().getValue();
	}

	public void setData(String arg) {
	this.adaptee.setData(arg);
	}

}