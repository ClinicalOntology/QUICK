package org.reimagineehr.model.quick.wrapper.event;

import org.reimagineehr.model.quick.api.event.MedicationAdministration;
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
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.backbone.DosageTaken;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationAdministrationWrapper implements MedicationAdministration {

	private org.hl7.fhir.dstu3.model.MedicationAdministration adaptee;

	public MedicationAdministrationWrapper() {
	
	}

	public MedicationAdministrationWrapper(org.hl7.fhir.dstu3.model.MedicationAdministration adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationAdministration getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationAdministration arg) {
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
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationStatus.fromCode(arg));
		}
	}

	public CodeableConcept getStatusReason() {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-status-reason");
		if(extensions != null && extensions.size() > 0) {
			org.hl7.fhir.dstu3.model.Extension extension = extensions.get(0);
			return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept)extension.getValue());
		} else {
			return null;
		}
	}

	public void setStatusReason(CodeableConcept arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-status-reason");
		org.hl7.fhir.dstu3.model.Extension extension = null;
		if(extensions == null || extensions.size() <= 0) {
			extension = this.adaptee.addExtension();
			extension.setUrl("http://example.com/extensions/my-status-reason");
		} else {
			extension = extensions.get(0);
		}
			extension.setValue(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
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
		java.util.List<org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent> itemList = this.adaptee.getPerformer();
		for(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent item : itemList) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.MedicationAdministrationPerformerWrapper(item));	}
		return returnList;
	}

	public void setPerformer(java.util.List<Participation> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent> itemList = new java.util.ArrayList<>();
		for(Participation item : arg) {
			itemList.add(((org.reimagineehr.model.quick.wrapper.backbone.MedicationAdministrationPerformerWrapper)item).getAdaptee());
		}
		this.adaptee.setPerformer(itemList);
	}

	public void addPerformer(Participation arg) {
	this.adaptee.getPerformer().add(((org.reimagineehr.model.quick.wrapper.backbone.MedicationAdministrationPerformerWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getReasonCode() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getReasonCode());
	}

	public void setReasonCode(java.util.List<CodeableConcept> arg) {
		this.adaptee.setReasonCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addReasonCode(CodeableConcept arg) {
		this.adaptee.addReasonCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<Finding> getReasonReference() {
		java.util.List<Finding> returnValue = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Reference> references = this.adaptee.getReasonReference();
		for(org.hl7.fhir.dstu3.model.Reference reference : references) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
			if(resource == null) {
				throw new RuntimeException("Reference cannot have a null resource. Please first fetch resource");
			} else 
				if(resource instanceof org.hl7.fhir.dstu3.model.Condition) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.finding.ConditionWrapper((org.hl7.fhir.dstu3.model.Condition) resource));
				}
				else if(resource instanceof org.hl7.fhir.dstu3.model.Observation) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper((org.hl7.fhir.dstu3.model.Observation) resource));
				}
			}
			return returnValue;
	}

	public void setReasonReference(java.util.List<Finding> arg) {
	for(Finding item : arg) {
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(item instanceof org.hl7.fhir.dstu3.model.Condition) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ConditionWrapper)item).getAdaptee());
			this.adaptee.addReasonReference(reference);
		} else if(item instanceof org.hl7.fhir.dstu3.model.Observation) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper)item).getAdaptee());
			this.adaptee.addReasonReference(reference);
		}
	}
	}

	public void addReasonReference(Finding arg) {
	
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(arg instanceof org.hl7.fhir.dstu3.model.Condition) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ConditionWrapper)arg).getAdaptee());
			this.adaptee.addReasonReference(reference);
		} else if(arg instanceof org.hl7.fhir.dstu3.model.Observation) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper)arg).getAdaptee());
			this.adaptee.addReasonReference(reference);
		}
	}

	public OccurrenceAllChoice getOccurrence() {
	
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getEffective();
		if(type instanceof org.hl7.fhir.dstu3.model.DateTimeType) {
			choice = ((org.hl7.fhir.dstu3.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Period) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper((org.hl7.fhir.dstu3.model.Period)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.OccurrenceAllChoiceImpl(choice);
	}

	public void setOccurrence(OccurrenceAllChoice arg) {
	
		OccurrenceAllChoice choice = arg;
		if(choice.getDateTime() != null) {
			this.adaptee.setEffective(new org.hl7.fhir.dstu3.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getPeriod() != null) {
			this.adaptee.setEffective(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}
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

	public Medication getMedication() {
		return new org.reimagineehr.model.quick.wrapper.other.MedicationWrapper((org.hl7.fhir.dstu3.model.Medication)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getMedication()).getResource());
	}

	public void setMedication(Medication arg) {
		this.adaptee.setMedication(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.other.MedicationWrapper)arg).getAdaptee()));
	}

	public DosageTaken getDosage() {
	
		return new org.reimagineehr.model.quick.wrapper.backbone.DosageTakenWrapper(this.adaptee.getDosage());
	}

	public void setDosage(DosageTaken arg) {
	
		this.adaptee.setDosage(((org.reimagineehr.model.quick.wrapper.backbone.DosageTakenWrapper)arg).getAdaptee());
	}

}