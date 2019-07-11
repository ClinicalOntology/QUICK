package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ContactPointWrapper implements ContactPoint {

	private org.hl7.fhir.dstu3.model.ContactPoint adaptee;

	public ContactPointWrapper() {
	
	}

	public ContactPointWrapper(org.hl7.fhir.dstu3.model.ContactPoint adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.ContactPoint getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.ContactPoint arg) {
		this.adaptee=arg;
	}

	public String getSystem() {
		if (this.adaptee.getSystem() != null) {
			return this.adaptee.getSystem().toCode();
		} else {
			return null;
		}
	}

	public void setSystem(String arg) {
		if (arg != null) {
			this.adaptee.setSystem(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem.fromCode(arg));
		}
	}

	public String getValue() {
	return this.adaptee.getValueElement().getValue();
	}

	public void setValue(String arg) {
	this.adaptee.setValue(arg);
	}

	public String getUse() {
		if (this.adaptee.getUse() != null) {
			return this.adaptee.getUse().toCode();
		} else {
			return null;
		}
	}

	public void setUse(String arg) {
		if (arg != null) {
			this.adaptee.setUse(org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse.fromCode(arg));
		}
	}

	public Integer getRank() {
	return this.adaptee.getRankElement().getValue();
	}

	public void setRank(Integer arg) {
	this.adaptee.setRank(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

}