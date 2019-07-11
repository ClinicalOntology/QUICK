package org.reimagineehr.model.quick.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.datatype.Quantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RatioWrapper implements Ratio {

	private org.hl7.fhir.dstu3.model.Ratio adaptee;

	public RatioWrapper() {
	
	}

	public RatioWrapper(org.hl7.fhir.dstu3.model.Ratio adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Ratio getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Ratio arg) {
		this.adaptee=arg;
	}

	public Quantity getNumerator() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper(this.adaptee.getNumerator());
	}

	public void setNumerator(Quantity arg) {
	
		this.adaptee.setNumerator(((org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper)arg).getAdaptee());
	}

	public Quantity getDenominator() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper(this.adaptee.getDenominator());
	}

	public void setDenominator(Quantity arg) {
	
		this.adaptee.setDenominator(((org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper)arg).getAdaptee());
	}

}