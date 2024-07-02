package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class LanguageCompetencyWrapper implements LanguageCompetency {

	private org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent adaptee;

	public LanguageCompetencyWrapper() {
	
	}

	public LanguageCompetencyWrapper(org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getLanguage() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getLanguage());
	}

	public void setLanguage(CodeableConcept arg) {
	this.adaptee.setLanguage(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public Boolean getPreferred() {
	return this.adaptee.getPreferredElement().getValue();
	}

	public void setPreferred(Boolean arg) {
	this.adaptee.setPreferred(arg);
	}

}