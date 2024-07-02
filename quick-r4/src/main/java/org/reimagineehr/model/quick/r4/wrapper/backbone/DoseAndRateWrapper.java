package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DoseAndRateWrapper implements DoseAndRate {

	private org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent adaptee;

	public DoseAndRateWrapper() {
	
	}

	public DoseAndRateWrapper(org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getType() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getType());
	}

	public void setType(CodeableConcept arg) {
	this.adaptee.setType(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public QuantityRangeRatioOrStringChoice getDose() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getDose();
		if(type instanceof org.hl7.fhir.r4.model.Range) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper((org.hl7.fhir.r4.model.Range)type);
		} else if(type instanceof org.hl7.fhir.r4.model.SimpleQuantity) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper((org.hl7.fhir.r4.model.SimpleQuantity)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice);
	}

	public void setDose(QuantityRangeRatioOrStringChoice arg) {
	
		QuantityRangeRatioOrStringChoice choice = arg;
		if(choice.getRange() != null) {
			this.adaptee.setDose(((org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getSimpleQuantity() != null) {
			this.adaptee.setDose(((org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper)choice.getSimpleQuantity()).getAdaptee());
		}
	}

	public QuantityRangeRatioOrStringChoice getRate() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getRate();
		if(type instanceof org.hl7.fhir.r4.model.Ratio) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RatioWrapper((org.hl7.fhir.r4.model.Ratio)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Range) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper((org.hl7.fhir.r4.model.Range)type);
		} else if(type instanceof org.hl7.fhir.r4.model.SimpleQuantity) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper((org.hl7.fhir.r4.model.SimpleQuantity)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice);
	}

	public void setRate(QuantityRangeRatioOrStringChoice arg) {
	
		QuantityRangeRatioOrStringChoice choice = arg;
		if(choice.getRatio() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.r4.wrapper.datatype.RatioWrapper)choice.getRatio()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getSimpleQuantity() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper)choice.getSimpleQuantity()).getAdaptee());
		}
	}

}