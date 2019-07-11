package org.reimagineehr.model.quick.wrapper.event;

import org.reimagineehr.model.quick.api.event.MedicationDispense;
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
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.datatype.Quantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationDispenseWrapper implements MedicationDispense {

	private org.hl7.fhir.dstu3.model.MedicationDispense adaptee;

	public MedicationDispenseWrapper() {
	
	}

	public MedicationDispenseWrapper(org.hl7.fhir.dstu3.model.MedicationDispense adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationDispense getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationDispense arg) {
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
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispenseStatus.fromCode(arg));
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
		java.util.List<org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispensePerformerComponent> itemList = this.adaptee.getPerformer();
		for(org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispensePerformerComponent item : itemList) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.MedicationDispensePerformerWrapper(item));	}
		return returnList;
	}

	public void setPerformer(java.util.List<Participation> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.MedicationDispense.MedicationDispensePerformerComponent> itemList = new java.util.ArrayList<>();
		for(Participation item : arg) {
			itemList.add(((org.reimagineehr.model.quick.wrapper.backbone.MedicationDispensePerformerWrapper)item).getAdaptee());
		}
		this.adaptee.setPerformer(itemList);
	}

	public void addPerformer(Participation arg) {
	this.adaptee.getPerformer().add(((org.reimagineehr.model.quick.wrapper.backbone.MedicationDispensePerformerWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getReasonCode() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setReasonCode(java.util.List<CodeableConcept> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addReasonCode(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
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

	public SimpleQuantity getQuantity() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getQuantity());
	}

	public void setQuantity(SimpleQuantity arg) {
	
		this.adaptee.setQuantity(((org.reimagineehr.model.quick.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

	public SimpleQuantity getDaysSupply() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getDaysSupply());
	}

	public void setDaysSupply(SimpleQuantity arg) {
	
		this.adaptee.setDaysSupply(((org.reimagineehr.model.quick.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

	public List<DosageInstruction> getDosageInstruction() {
		List<org.reimagineehr.model.quick.api.backbone.DosageInstruction> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Dosage> items = this.adaptee.getDosageInstruction();
		for(org.hl7.fhir.dstu3.model.Dosage item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.DosageInstructionWrapper(item));
		}
		return returnList;
	}

	public void setDosageInstruction(java.util.List<DosageInstruction> arg) {
		List<org.hl7.fhir.dstu3.model.Dosage> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.DosageInstruction item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.DosageInstructionWrapper)item).getAdaptee());
		}
		this.adaptee.setDosageInstruction(targetList);
	}

	public void addDosageInstruction(DosageInstruction arg) {
		this.adaptee.addDosageInstruction(((org.reimagineehr.model.quick.wrapper.backbone.DosageInstructionWrapper)arg).getAdaptee());
	}

	public Medication getMedication() {
		return new org.reimagineehr.model.quick.wrapper.other.MedicationWrapper((org.hl7.fhir.dstu3.model.Medication)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getMedication()).getResource());
	}

	public void setMedication(Medication arg) {
		this.adaptee.setMedication(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.other.MedicationWrapper)arg).getAdaptee()));
	}

	public Quantity getFillNumber() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setFillNumber(Quantity arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}