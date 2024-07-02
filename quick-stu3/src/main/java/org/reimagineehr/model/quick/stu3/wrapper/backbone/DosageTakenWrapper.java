package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DosageTaken;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DosageTakenWrapper implements DosageTaken {

	private org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent adaptee;

	public DosageTakenWrapper() {
	
	}

	public DosageTakenWrapper(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent arg) {
		this.adaptee=arg;
	}

	public String getText() {
	return this.adaptee.getTextElement().getValue();
	}

	public void setText(String arg) {
	this.adaptee.setText(arg);
	}

	public CodeableConcept getSite() {
	return new org.reimagineehr.model.quick.stu3.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getSite());
	}

	public void setSite(CodeableConcept arg) {
	this.adaptee.setSite(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
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

	public SimpleQuantity getDose() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getDose());
	}

	public void setDose(SimpleQuantity arg) {
	
		this.adaptee.setDose(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

	public QuantityRangeRatioOrStringChoice getRate() {
	
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getRate();
		if(type instanceof org.hl7.fhir.dstu3.model.Ratio) {
			choice = new org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper((org.hl7.fhir.dstu3.model.Ratio)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.SimpleQuantity) {
			choice = new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper((org.hl7.fhir.dstu3.model.SimpleQuantity)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.QuantityRangeRatioOrStringChoiceImpl(choice);
	}

	public void setRate(QuantityRangeRatioOrStringChoice arg) {
	
		QuantityRangeRatioOrStringChoice choice = arg;
		if(choice.getRatio() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper)choice.getRatio()).getAdaptee());
		}else if(choice.getSimpleQuantity() != null) {
			this.adaptee.setRate(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)choice.getSimpleQuantity()).getAdaptee());
		}
	}

}