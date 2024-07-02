package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Timing;
import java.util.List;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.TimingRepeat;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class TimingWrapper implements Timing {

	private org.hl7.fhir.dstu3.model.Timing adaptee;

	public TimingWrapper() {
	
	}

	public TimingWrapper(org.hl7.fhir.dstu3.model.Timing adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Timing getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Timing arg) {
		this.adaptee=arg;
	}

	public List<Date> getEvent() {
		java.util.List<Date> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getEvent() != null) {
			for(org.hl7.fhir.dstu3.model.DateTimeType type: this.adaptee.getEvent()) {
				retVals.add(type.getValue());
			}
		}
		return retVals;
	}

	public void setEvent(java.util.List<Date> arg) {
	
		java.util.List<org.hl7.fhir.dstu3.model.DateTimeType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(Date type: arg) {
				values.add(new org.hl7.fhir.dstu3.model.DateTimeType(type));
			}
		}
		this.adaptee.setEvent(values);
	}

	public void addEvent(Date arg) {
	
		this.adaptee.addEvent(arg);
	}

	public TimingRepeat getRepeat() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.backbone.TimingRepeatWrapper(this.adaptee.getRepeat());
	}

	public void setRepeat(TimingRepeat arg) {
	
		this.adaptee.setRepeat(((org.reimagineehr.model.quick.stu3.wrapper.backbone.TimingRepeatWrapper)arg).getAdaptee());
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.stu3.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

}