package org.reimagineehr.model.quick.r4.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.math.BigDecimal;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SimpleQuantityWrapper implements SimpleQuantity {

	private org.hl7.fhir.r4.model.SimpleQuantity adaptee;

	public SimpleQuantityWrapper() {
	
	}

	public SimpleQuantityWrapper(org.hl7.fhir.r4.model.SimpleQuantity adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.SimpleQuantity getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.SimpleQuantity arg) {
		this.adaptee=arg;
	}

	public BigDecimal getValue() {
	return this.adaptee.getValueElement().getValue();
	}

	public void setValue(BigDecimal arg) {
	this.adaptee.setValue(arg);
	}

	public String getComparator() {
		if (this.adaptee.getComparator() != null) {
			return this.adaptee.getComparator().toCode();
		} else {
			return null;
		}
	}

	public void setComparator(String arg) {
		if (arg != null) {
			this.adaptee.setComparator(org.hl7.fhir.r4.model.Quantity.QuantityComparator.fromCode(arg));
		}
	}

	public String getUnit() {
	return this.adaptee.getUnitElement().getValue();
	}

	public void setUnit(String arg) {
	this.adaptee.setUnit(arg);
	}

	public String getSystem() {
	return this.adaptee.getSystemElement().getValue();
	}

	public void setSystem(String arg) {
	this.adaptee.setSystem(arg);
	}

	public String getCode() {
	return this.adaptee.getCodeElement().getValue();
	}

	public void setCode(String arg) {
	this.adaptee.setCode(arg);
	}

}