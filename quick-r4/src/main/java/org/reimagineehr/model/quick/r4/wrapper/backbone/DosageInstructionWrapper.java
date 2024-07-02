package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DosageInstructionWrapper implements DosageInstruction {

	private org.hl7.fhir.r4.model.Dosage adaptee;

	public DosageInstructionWrapper() {
	
	}

	public DosageInstructionWrapper(org.hl7.fhir.r4.model.Dosage adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Dosage getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Dosage arg) {
		this.adaptee=arg;
	}

	public List<DoseAndRate> getDoseAndRate() {
		List<org.reimagineehr.model.quick.api.backbone.DoseAndRate> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> items = this.adaptee.getDoseAndRate();
		for(org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.DoseAndRateWrapper(item));
		}
		return returnList;
	}

	public void setDoseAndRate(java.util.List<DoseAndRate> arg) {
		List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.DoseAndRate item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.DoseAndRateWrapper)item).getAdaptee());
		}
		this.adaptee.setDoseAndRate(targetList);
	}

	public void addDoseAndRate(DoseAndRate arg) {
		this.adaptee.addDoseAndRate(((org.reimagineehr.model.quick.r4.wrapper.backbone.DoseAndRateWrapper)arg).getAdaptee());
	}

	public Timing getTiming() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.backbone.TimingWrapper(this.adaptee.getTiming());
	}

	public void setTiming(Timing arg) {
	
		this.adaptee.setTiming(((org.reimagineehr.model.quick.r4.wrapper.backbone.TimingWrapper)arg).getAdaptee());
	}

	public CodeableConcept getRoute() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getRoute());
	}

	public void setRoute(CodeableConcept arg) {
	this.adaptee.setRoute(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getMethod() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getMethod());
	}

	public void setMethod(CodeableConcept arg) {
	this.adaptee.setMethod(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

}