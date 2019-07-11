package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Hospitalization;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.choice.OrganizationLocationChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class HospitalizationWrapper implements Hospitalization {

	private org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent adaptee;

	public HospitalizationWrapper() {
	
	}

	public HospitalizationWrapper(org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Encounter.EncounterHospitalizationComponent arg) {
		this.adaptee=arg;
	}

	public Identifier getPreAdmissionIdentifier() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper(this.adaptee.getPreAdmissionIdentifier());
	}

	public void setPreAdmissionIdentifier(Identifier arg) {
	
		this.adaptee.setPreAdmissionIdentifier(((org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public OrganizationLocationChoice getOrigin() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setOrigin(OrganizationLocationChoice arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public CodeableConcept getAdmitSource() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getAdmitSource());
	}

	public void setAdmitSource(CodeableConcept arg) {
	this.adaptee.setAdmitSource(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getReAdmission() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getReAdmission());
	}

	public void setReAdmission(CodeableConcept arg) {
	this.adaptee.setReAdmission(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getDietPreference() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getDietPreference());
	}

	public void setDietPreference(java.util.List<CodeableConcept> arg) {
		this.adaptee.setDietPreference(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addDietPreference(CodeableConcept arg) {
		this.adaptee.addDietPreference(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getSpecialCourtesy() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getSpecialCourtesy());
	}

	public void setSpecialCourtesy(java.util.List<CodeableConcept> arg) {
		this.adaptee.setSpecialCourtesy(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addSpecialCourtesy(CodeableConcept arg) {
		this.adaptee.addSpecialCourtesy(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getSpecialArrangement() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getSpecialArrangement());
	}

	public void setSpecialArrangement(java.util.List<CodeableConcept> arg) {
		this.adaptee.setSpecialArrangement(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addSpecialArrangement(CodeableConcept arg) {
		this.adaptee.addSpecialArrangement(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public OrganizationLocationChoice getDestination() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setDestination(OrganizationLocationChoice arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public CodeableConcept getDischargeDisposition() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getDischargeDisposition());
	}

	public void setDischargeDisposition(CodeableConcept arg) {
	this.adaptee.setDischargeDisposition(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

}