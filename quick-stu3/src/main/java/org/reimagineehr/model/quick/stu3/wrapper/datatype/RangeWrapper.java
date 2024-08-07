package org.reimagineehr.model.quick.stu3.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RangeWrapper implements Range {

	private org.hl7.fhir.dstu3.model.Range adaptee;

	public RangeWrapper() {
	
	}

	public RangeWrapper(org.hl7.fhir.dstu3.model.Range adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Range getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Range arg) {
		this.adaptee=arg;
	}

	public SimpleQuantity getLow() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getLow());
	}

	public void setLow(SimpleQuantity arg) {
	
		this.adaptee.setLow(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

	public SimpleQuantity getHigh() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getHigh());
	}

	public void setHigh(SimpleQuantity arg) {
	
		this.adaptee.setHigh(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

}