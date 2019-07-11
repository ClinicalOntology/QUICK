package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.GroupCharacteristic;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GroupCharacteristicWrapper implements GroupCharacteristic {

	private org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent adaptee;

	public GroupCharacteristicWrapper() {
	
	}

	public GroupCharacteristicWrapper(org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public ObservationValueChoice getValue() {
	
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getValue();
		if(type instanceof org.hl7.fhir.dstu3.model.CodeableConcept) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper((org.hl7.fhir.dstu3.model.CodeableConcept)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.BooleanType) {
			choice = ((org.hl7.fhir.dstu3.model.BooleanType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Quantity) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper((org.hl7.fhir.dstu3.model.Quantity)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.Range) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.ObservationValueChoiceImpl(choice);
	}

	public void setValue(ObservationValueChoice arg) {
	
		ObservationValueChoice choice = arg;
		if(choice.getCodeableConcept() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper)choice.getCodeableConcept()).getAdaptee());
		}else if(choice.getBoolean() != null) {
			this.adaptee.setValue(new org.hl7.fhir.dstu3.model.BooleanType(choice.getBoolean()));
		}else if(choice.getQuantity() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper)choice.getQuantity()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}
	}

	public Boolean getExclude() {
	return this.adaptee.getExcludeElement().getValue();
	}

	public void setExclude(Boolean arg) {
	this.adaptee.setExclude(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

}