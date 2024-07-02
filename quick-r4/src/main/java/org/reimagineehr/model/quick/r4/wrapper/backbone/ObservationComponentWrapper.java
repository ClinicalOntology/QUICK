package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.ObservationComponent;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.util.List;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ObservationComponentWrapper implements ObservationComponent {

	private org.hl7.fhir.r4.model.Observation.ObservationComponentComponent adaptee;

	public ObservationComponentWrapper() {
	
	}

	public ObservationComponentWrapper(org.hl7.fhir.r4.model.Observation.ObservationComponentComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Observation.ObservationComponentComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Observation.ObservationComponentComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public ObservationValueChoice getValue() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getValue();
		if(type instanceof org.hl7.fhir.r4.model.Quantity) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.QuantityWrapper((org.hl7.fhir.r4.model.Quantity)type);
		} else if(type instanceof org.hl7.fhir.r4.model.CodeableConcept) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper((org.hl7.fhir.r4.model.CodeableConcept)type);
		} else if(type instanceof org.hl7.fhir.r4.model.StringType) {
			choice = ((org.hl7.fhir.r4.model.StringType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.Range) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper((org.hl7.fhir.r4.model.Range)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Ratio) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RatioWrapper((org.hl7.fhir.r4.model.Ratio)type);
		} else if(type instanceof org.hl7.fhir.r4.model.DateTimeType) {
			choice = ((org.hl7.fhir.r4.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.Period) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper((org.hl7.fhir.r4.model.Period)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.ObservationValueChoiceImpl(choice);
	}

	public void setValue(ObservationValueChoice arg) {
	
		ObservationValueChoice choice = arg;
		if(choice.getQuantity() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.r4.wrapper.datatype.QuantityWrapper)choice.getQuantity()).getAdaptee());
		}else if(choice.getCodeableConcept() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper)choice.getCodeableConcept()).getAdaptee());
		}else if(choice.getString() != null) {
			this.adaptee.setValue(new org.hl7.fhir.r4.model.StringType(choice.getString()));
		}else if(choice.getRange() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getRatio() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.r4.wrapper.datatype.RatioWrapper)choice.getRatio()).getAdaptee());
		}else if(choice.getDateTime() != null) {
			this.adaptee.setValue(new org.hl7.fhir.r4.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getPeriod() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}
	}

	public CodeableConcept getDataAbsentReason() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getDataAbsentReason());
	}

	public void setDataAbsentReason(CodeableConcept arg) {
	this.adaptee.setDataAbsentReason(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getInterpretation() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCodeableConcept(this.adaptee.getInterpretation());
	}

	public void setInterpretation(java.util.List<CodeableConcept> arg) {
		this.adaptee.setInterpretation(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public void addInterpretation(CodeableConcept arg) {
		this.adaptee.addInterpretation(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

}