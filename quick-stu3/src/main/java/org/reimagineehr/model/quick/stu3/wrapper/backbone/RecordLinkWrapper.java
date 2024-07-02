package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.RecordLink;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RecordLinkWrapper implements RecordLink {

	private org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent adaptee;

	public RecordLinkWrapper() {
	
	}

	public RecordLinkWrapper(org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent arg) {
		this.adaptee=arg;
	}

	public IndividualCareRecipient getOther() {
		IndividualCareRecipient returnValue = null;
		org.hl7.fhir.dstu3.model.Reference reference = this.adaptee.getOther();
		org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.dstu3.model.Patient) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson)resource);}
		return returnValue;
	}

	public void setOther(IndividualCareRecipient arg) {
		org.hl7.fhir.dstu3.model.Resource resource = ((org.reimagineehr.model.quick.stu3.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.dstu3.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.dstu3.model.Patient||resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) {
		reference = new org.hl7.fhir.dstu3.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"other", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setOther(reference);
	}

	public String getType() {
		if (this.adaptee.getType() != null) {
			return this.adaptee.getType().toCode();
		} else {
			return null;
		}
	}

	public void setType(String arg) {
		if (arg != null) {
			this.adaptee.setType(org.hl7.fhir.dstu3.model.Patient.LinkType.fromCode(arg));
		}
	}

}