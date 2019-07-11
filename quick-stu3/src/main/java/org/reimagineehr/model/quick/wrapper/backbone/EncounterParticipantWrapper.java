package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class EncounterParticipantWrapper implements Participation {

	private org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent adaptee;

	public EncounterParticipantWrapper() {
	
	}

	public EncounterParticipantWrapper(org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getRole() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRole(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Party getActor() {
		Party returnValue = null;
		org.hl7.fhir.dstu3.model.Reference reference = this.adaptee.getIndividual();
		org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.dstu3.model.Practitioner) { returnValue = new org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper((org.hl7.fhir.dstu3.model.Practitioner)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) { returnValue = new org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson)resource);}
		return returnValue;
	}

	public void setActor(Party arg) {
		org.hl7.fhir.dstu3.model.Resource resource = ((org.reimagineehr.model.quick.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.dstu3.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.dstu3.model.Practitioner||resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) {
		reference = new org.hl7.fhir.dstu3.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"actor", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setIndividual(reference);
	}

	public Organization getOnBehalfOf() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setOnBehalfOf(Organization arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public String getRequired() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRequired(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getStatus() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setStatus(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}