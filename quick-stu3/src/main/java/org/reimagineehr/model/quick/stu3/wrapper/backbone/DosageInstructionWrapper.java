package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DosageInstructionWrapper implements DosageInstruction {

	private org.hl7.fhir.dstu3.model.Dosage adaptee;

	public DosageInstructionWrapper() {
	
	}

	public DosageInstructionWrapper(org.hl7.fhir.dstu3.model.Dosage adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Dosage getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Dosage arg) {
		this.adaptee=arg;
	}

	public List<DoseAndRate> getDoseAndRate() {
	
		java.util.List<org.reimagineehr.model.quick.api.backbone.DoseAndRate> retValue = new java.util.ArrayList<>();
	
		org.reimagineehr.model.quick.api.backbone.DoseAndRate item = new org.reimagineehr.model.quick.impl.backbone.DoseAndRateImpl();
	
		retValue.add(item);
		Object choice0 = null;
		org.hl7.fhir.dstu3.model.Type type0 = this.adaptee.getDose();
		if(type0 instanceof org.hl7.fhir.dstu3.model.SimpleQuantity) {
			choice0 = new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper((org.hl7.fhir.dstu3.model.SimpleQuantity)type0);
		} else if(type0 instanceof org.hl7.fhir.dstu3.model.Range) {
			choice0 = new org.reimagineehr.model.quick.stu3.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type0);
		}
		item.setDose(new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice0));
	
		Object choice1 = null;
		org.hl7.fhir.dstu3.model.Type type1 = this.adaptee.getRate();
		if(type1 instanceof org.hl7.fhir.dstu3.model.SimpleQuantity) {
			choice1 = new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper((org.hl7.fhir.dstu3.model.SimpleQuantity)type1);
		} else if(type1 instanceof org.hl7.fhir.dstu3.model.Range) {
			choice1 = new org.reimagineehr.model.quick.stu3.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type1);
		} else if(type1 instanceof org.hl7.fhir.dstu3.model.Ratio) {
			choice1 = new org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper((org.hl7.fhir.dstu3.model.Ratio)type1);
		}
		item.setRate(new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice1));
	
		return retValue;
	}

	public void setDoseAndRate(java.util.List<DoseAndRate> arg) {
	
		if(arg != null && arg.size() > 0) {
		org.reimagineehr.model.quick.api.backbone.DoseAndRate item = arg.get(0);
		org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice choice0 = item.getDose();
		if(choice0.getSimpleQuantity() != null) {
			this.adaptee.setDose(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)choice0.getSimpleQuantity()).getAdaptee());
		}else if(choice0.getRange() != null) {
			this.adaptee.setDose(((org.reimagineehr.model.quick.stu3.wrapper.datatype.RangeWrapper)choice0.getRange()).getAdaptee());
		}
		item.setDose(new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice0));
	
		org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice choice1 = item.getRate();
		if(choice1.getSimpleQuantity() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)choice1.getSimpleQuantity()).getAdaptee());
		}else if(choice1.getRange() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.stu3.wrapper.datatype.RangeWrapper)choice1.getRange()).getAdaptee());
		}else if(choice1.getRatio() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper)choice1.getRatio()).getAdaptee());
		}
		item.setRate(new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice1));
	
		}
	}

	public void addDoseAndRate(DoseAndRate arg) {
		if(getDoseAndRate() != null) {
			getDoseAndRate().add(arg);
		} else {
			List<DoseAndRate> items = new java.util.ArrayList<>();
			setDoseAndRate(items);
			items.add(arg);
		}
	}

	public Timing getTiming() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.backbone.TimingWrapper(this.adaptee.getTiming());
	}

	public void setTiming(Timing arg) {
	
		this.adaptee.setTiming(((org.reimagineehr.model.quick.stu3.wrapper.backbone.TimingWrapper)arg).getAdaptee());
	}

	public CodeableConcept getRoute() {
	return new org.reimagineehr.model.quick.stu3.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getRoute());
	}

	public void setRoute(CodeableConcept arg) {
	this.adaptee.setRoute(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getMethod() {
	return new org.reimagineehr.model.quick.stu3.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getMethod());
	}

	public void setMethod(CodeableConcept arg) {
	this.adaptee.setMethod(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

}