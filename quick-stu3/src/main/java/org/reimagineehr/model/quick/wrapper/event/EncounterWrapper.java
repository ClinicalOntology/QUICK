package org.reimagineehr.model.quick.wrapper.event;

import org.reimagineehr.model.quick.api.event.Encounter;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.finding.Finding;
import org.reimagineehr.model.quick.api.choice.OccurrenceAllChoice;
import org.reimagineehr.model.quick.api.request.Request;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Coding;
import org.reimagineehr.model.quick.api.event.Appointment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.backbone.EncounterDiagnosisOrProcedure;
import org.reimagineehr.model.quick.api.backbone.Hospitalization;
import org.reimagineehr.model.quick.api.backbone.PatientLocation;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class EncounterWrapper implements Encounter {

	private org.hl7.fhir.dstu3.model.Encounter adaptee;

	public EncounterWrapper() {
	
	}

	public EncounterWrapper(org.hl7.fhir.dstu3.model.Encounter adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Encounter getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Encounter arg) {
		this.adaptee=arg;
	}

	public String getId() {
	return this.adaptee.getIdElement().getValue();
	}

	public void setId(String arg) {
	this.adaptee.setId(arg);
	}

	public Meta getMeta() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.MetaWrapper(this.adaptee.getMeta());
	}

	public void setMeta(Meta arg) {
	
		this.adaptee.setMeta(((org.reimagineehr.model.quick.wrapper.datatype.MetaWrapper)arg).getAdaptee());
	}

	public String getImplicitRules() {
	return this.adaptee.getImplicitRulesElement().getValue();
	}

	public void setImplicitRules(String arg) {
	this.adaptee.setImplicitRules(arg);
	}

	public String getLanguage() {
	return this.adaptee.getLanguageElement().getValue();
	}

	public void setLanguage(String arg) {
	this.adaptee.setLanguage(arg);
	}

	public Narrative getText() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.NarrativeWrapper(this.adaptee.getText());
	}

	public void setText(Narrative arg) {
	
		this.adaptee.setText(((org.reimagineehr.model.quick.wrapper.datatype.NarrativeWrapper)arg).getAdaptee());
	}

	public List<Identifier> getIdentifier() {
		List<org.reimagineehr.model.quick.api.datatype.Identifier> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Identifier> items = this.adaptee.getIdentifier();
		for(org.hl7.fhir.dstu3.model.Identifier item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper(item));
		}
		return returnList;
	}

	public void setIdentifier(java.util.List<Identifier> arg) {
		List<org.hl7.fhir.dstu3.model.Identifier> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Identifier item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper)item).getAdaptee());
		}
		this.adaptee.setIdentifier(targetList);
	}

	public void addIdentifier(Identifier arg) {
		this.adaptee.addIdentifier(((org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public String getStatus() {
		if (this.adaptee.getStatus() != null) {
			return this.adaptee.getStatus().toCode();
		} else {
			return null;
		}
	}

	public void setStatus(String arg) {
		if (arg != null) {
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.Encounter.EncounterStatus.fromCode(arg));
		}
	}

	public CodeableConcept getStatusReason() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setStatusReason(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public CareRecipient getSubject() {
		CareRecipient returnValue = null;
		org.hl7.fhir.dstu3.model.Reference reference = this.adaptee.getSubject();
		org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.dstu3.model.Patient) { returnValue = new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.Group) { returnValue = new org.reimagineehr.model.quick.wrapper.party.GroupWrapper((org.hl7.fhir.dstu3.model.Group)resource);}
		return returnValue;
	}

	public void setSubject(CareRecipient arg) {
		org.hl7.fhir.dstu3.model.Resource resource = ((org.reimagineehr.model.quick.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.dstu3.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.dstu3.model.Patient||resource instanceof org.hl7.fhir.dstu3.model.Group) {
		reference = new org.hl7.fhir.dstu3.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"subject", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setSubject(reference);
	}

	public List<Participation> getPerformer() {
	
		java.util.List<Participation> returnList = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent> itemList = this.adaptee.getParticipant();
		for(org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent item : itemList) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.EncounterParticipantWrapper(item));	}
		return returnList;
	}

	public void setPerformer(java.util.List<Participation> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Encounter.EncounterParticipantComponent> itemList = new java.util.ArrayList<>();
		for(Participation item : arg) {
			itemList.add(((org.reimagineehr.model.quick.wrapper.backbone.EncounterParticipantWrapper)item).getAdaptee());
		}
		this.adaptee.setParticipant(itemList);
	}

	public void addPerformer(Participation arg) {
	this.adaptee.getParticipant().add(((org.reimagineehr.model.quick.wrapper.backbone.EncounterParticipantWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getReasonCode() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getReason());
	}

	public void setReasonCode(java.util.List<CodeableConcept> arg) {
		this.adaptee.setReason(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addReasonCode(CodeableConcept arg) {
		this.adaptee.addReason(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<Finding> getReasonReference() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setReasonReference(java.util.List<Finding> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addReasonReference(Finding arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public OccurrenceAllChoice getOccurrence() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setOccurrence(OccurrenceAllChoice arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public List<Request> getBasedOn() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setBasedOn(java.util.List<Request> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addBasedOn(Request arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Party getRecorder() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRecorder(Party arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Date getRecorded() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRecorded(Date arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Coding getEncounterClass() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCoding(this.adaptee.getClass_());
	}

	public void setEncounterClass(Coding arg) {
		this.adaptee.setClass_(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCoding(arg));
	}

	public List<CodeableConcept> getType() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getType());
	}

	public void setType(java.util.List<CodeableConcept> arg) {
		this.adaptee.setType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addType(CodeableConcept arg) {
		this.adaptee.addType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getServiceType() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setServiceType(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public CodeableConcept getPriority() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getPriority());
	}

	public void setPriority(CodeableConcept arg) {
	this.adaptee.setPriority(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<Appointment> getAppointment() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setAppointment(java.util.List<Appointment> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addAppointment(Appointment arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public Duration getLength() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.DurationWrapper(this.adaptee.getLength());
	}

	public void setLength(Duration arg) {
	
		this.adaptee.setLength(((org.reimagineehr.model.quick.wrapper.datatype.DurationWrapper)arg).getAdaptee());
	}

	public List<EncounterDiagnosisOrProcedure> getDiagnosisOrProcedure() {
	
		java.util.List<EncounterDiagnosisOrProcedure> returnList = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Encounter.DiagnosisComponent> itemList = this.adaptee.getDiagnosis();
		for(org.hl7.fhir.dstu3.model.Encounter.DiagnosisComponent item : itemList) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.EncounterDiagnosisOrProcedureWrapper(item));	}
		return returnList;
	}

	public void setDiagnosisOrProcedure(java.util.List<EncounterDiagnosisOrProcedure> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Encounter.DiagnosisComponent> itemList = new java.util.ArrayList<>();
		for(EncounterDiagnosisOrProcedure item : arg) {
			itemList.add(((org.reimagineehr.model.quick.wrapper.backbone.EncounterDiagnosisOrProcedureWrapper)item).getAdaptee());
		}
		this.adaptee.setDiagnosis(itemList);
	}

	public void addDiagnosisOrProcedure(EncounterDiagnosisOrProcedure arg) {
	this.adaptee.getDiagnosis().add(((org.reimagineehr.model.quick.wrapper.backbone.EncounterDiagnosisOrProcedureWrapper)arg).getAdaptee());
	}

	public Hospitalization getHospitalization() {
	
		return new org.reimagineehr.model.quick.wrapper.backbone.HospitalizationWrapper(this.adaptee.getHospitalization());
	}

	public void setHospitalization(Hospitalization arg) {
	
		this.adaptee.setHospitalization(((org.reimagineehr.model.quick.wrapper.backbone.HospitalizationWrapper)arg).getAdaptee());
	}

	public List<PatientLocation> getLocation() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setLocation(java.util.List<PatientLocation> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addLocation(PatientLocation arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Organization getServiceProvider() {
		return new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getServiceProvider()).getResource());
	}

	public void setServiceProvider(Organization arg) {
		this.adaptee.setServiceProvider(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public Encounter getPartOf() {
		return new org.reimagineehr.model.quick.wrapper.event.EncounterWrapper((org.hl7.fhir.dstu3.model.Encounter)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getPartOf()).getResource());
	}

	public void setPartOf(Encounter arg) {
		this.adaptee.setPartOf(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.event.EncounterWrapper)arg).getAdaptee()));
	}

}