package org.reimagineehr.model.quick.wrapper.request;

import org.reimagineehr.model.quick.api.request.MedicationRequest;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.backbone.DispenseRequest;
import org.reimagineehr.model.quick.api.choice.MedicationOrCodeChoice;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class MedicationRequestWrapper implements MedicationRequest {

	private org.hl7.fhir.dstu3.model.MedicationRequest adaptee;

	public MedicationRequestWrapper() {
	
	}

	public MedicationRequestWrapper(org.hl7.fhir.dstu3.model.MedicationRequest adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationRequest getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationRequest arg) {
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

	public String getIntent() {
		if (this.adaptee.getIntent() != null) {
			return this.adaptee.getIntent().toCode();
		} else {
			return null;
		}
	}

	public void setIntent(String arg) {
		if (arg != null) {
			this.adaptee.setIntent(org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestIntent.fromCode(arg));
		}
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

	public Date getAuthoredOn() {
	return this.adaptee.getAuthoredOnElement().getValue();
	}

	public void setAuthoredOn(Date arg) {
	this.adaptee.setAuthoredOn(arg);
	}

	public Party getRequester() {
		Party retVal = null;
		org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestRequesterComponent hapiType = this.adaptee.getRequester();
		org.hl7.fhir.dstu3.model.Reference agentReference = hapiType.getAgent();
		org.hl7.fhir.dstu3.model.DomainResource agentResource = (org.hl7.fhir.dstu3.model.DomainResource)agentReference.getResource();
		if(agentResource != null) {
			if  (agentResource instanceof org.hl7.fhir.dstu3.model.Practitioner) {
				retVal = new org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper((org.hl7.fhir.dstu3.model.Practitioner) agentResource);
			} else if (agentResource instanceof org.hl7.fhir.dstu3.model.Patient) {
				retVal = new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient) agentResource);
			} else if (agentResource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) {
				retVal = new org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson) agentResource);
			} else if (agentResource instanceof org.hl7.fhir.dstu3.model.Device) {
				retVal = new org.reimagineehr.model.quick.wrapper.party.DeviceWrapper((org.hl7.fhir.dstu3.model.Device) agentResource);
			} else if (agentResource instanceof org.hl7.fhir.dstu3.model.Organization) {
				retVal = new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization) agentResource);
			} else { throw new RuntimeException("Unsupported resource type");}
		}
		return retVal;
	}

	public void setRequester(Party arg) {
		org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestRequesterComponent hapiType = new org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestRequesterComponent();
		if(arg != null) {
			org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
			if  (arg instanceof org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper)arg).getAdaptee());
				hapiType.setAgent(reference);
			} else if (arg instanceof org.reimagineehr.model.quick.wrapper.party.PatientWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper)arg).getAdaptee());
				hapiType.setAgent(reference);
			} else if (arg instanceof org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper)arg).getAdaptee());
				hapiType.setAgent(reference);
			} else if (arg instanceof org.reimagineehr.model.quick.wrapper.party.DeviceWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.DeviceWrapper)arg).getAdaptee());
				hapiType.setAgent(reference);
			} else if (arg instanceof org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg).getAdaptee());
				hapiType.setAgent(reference);
			} else { throw new RuntimeException("Unsupported resource type");}
		}
		this.adaptee.setRequester(hapiType);
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

	public String getStatus() {
		if (this.adaptee.getStatus() != null) {
			return this.adaptee.getStatus().toCode();
		} else {
			return null;
		}
	}

	public void setStatus(String arg) {
		if (arg != null) {
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestStatus.fromCode(arg));
		}
	}

	public CodeableConcept getStatusReason() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setStatusReason(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
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

	public DispenseRequest getDispenseRequest() {
	
		return new org.reimagineehr.model.quick.wrapper.backbone.DispenseRequestWrapper(this.adaptee.getDispenseRequest());
	}

	public void setDispenseRequest(DispenseRequest arg) {
	
		this.adaptee.setDispenseRequest(((org.reimagineehr.model.quick.wrapper.backbone.DispenseRequestWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getCategory() {
		java.util.List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> retVal = new java.util.ArrayList<>();
		org.reimagineehr.model.quick.api.datatype.CodeableConcept codeableConcept = org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getCategory());
		retVal.add(codeableConcept);
		return retVal;
	}

	public void setCategory(java.util.List<CodeableConcept> arg) {
		if(arg != null && arg.size() > 0) {
			if(arg.size() == 1) {
				this.adaptee.setCategory(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg.get(0)));
			} else {
				throw new RuntimeException("STU3 only supports list of one item for category");
			}
		}
	}

	public void addCategory(CodeableConcept arg) {
		throw new RuntimeException("Unsupported operation");
	}

	public MedicationOrCodeChoice getMedication() {
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getMedication();
		if (type instanceof org.hl7.fhir.dstu3.model.Reference) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)this.adaptee.getMedicationReference().getResource();
			if  (resource instanceof org.hl7.fhir.dstu3.model.Medication) {
				choice = new org.reimagineehr.model.quick.wrapper.other.MedicationWrapper((org.hl7.fhir.dstu3.model.Medication) resource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if (!(type instanceof org.hl7.fhir.dstu3.model.Reference)){
			if  (type instanceof org.hl7.fhir.dstu3.model.CodeableConcept) {
				choice = org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept)type);
			} else { throw new RuntimeException("Unsupported type");}
		}
		return new org.reimagineehr.model.quick.impl.choice.MedicationOrCodeChoiceImpl(choice);
	}

	public void setMedication(MedicationOrCodeChoice arg) {
	
		org.reimagineehr.model.quick.api.resource.DomainResource domainResource = arg.getMedication();
		Object element = arg.getCode();
		if(domainResource != null) {
			if  (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.wrapper.other.MedicationWrapper) {
				this.adaptee.setMedication(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.other.MedicationWrapper) domainResource).getAdaptee()));
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if(element != null) {
			if  (element instanceof org.reimagineehr.model.quick.api.datatype.CodeableConcept) {
				this.adaptee.setMedication(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept((org.reimagineehr.model.quick.api.datatype.CodeableConcept)element));
			} else { throw new RuntimeException("Unsupported type");}
		}
	}

	public Boolean getDoNotPerform() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setDoNotPerform(Boolean arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}