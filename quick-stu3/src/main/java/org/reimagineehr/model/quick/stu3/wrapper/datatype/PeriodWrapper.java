package org.reimagineehr.model.quick.stu3.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Period;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PeriodWrapper implements Period {

	private org.hl7.fhir.dstu3.model.Period adaptee;

	public PeriodWrapper() {
	
	}

	public PeriodWrapper(org.hl7.fhir.dstu3.model.Period adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Period getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Period arg) {
		this.adaptee=arg;
	}

	public Date getStart() {
	return this.adaptee.getStartElement().getValue();
	}

	public void setStart(Date arg) {
	this.adaptee.setStart(arg);
	}

	public Date getEnd() {
	return this.adaptee.getEndElement().getValue();
	}

	public void setEnd(Date arg) {
	this.adaptee.setEnd(arg);
	}

}