package org.reimagineehr.model.quick.wrapper.event;

import org.reimagineehr.model.quick.api.event.Procedure;
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
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ProcedureWrapper implements Procedure {

	private org.hl7.fhir.dstu3.model.Procedure adaptee;

	public ProcedureWrapper() {
	
	}

	public ProcedureWrapper(org.hl7.fhir.dstu3.model.Procedure adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Procedure getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Procedure arg) {
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
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.Procedure.ProcedureStatus.fromCode(arg));
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
		java.util.List<org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent> itemList = this.adaptee.getPerformer();
		for(org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent item : itemList) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.ProcedurePerformerWrapper(item));	}
		return returnList;
	}

	public void setPerformer(java.util.List<Participation> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent> itemList = new java.util.ArrayList<>();
		for(Participation item : arg) {
			itemList.add(((org.reimagineehr.model.quick.wrapper.backbone.ProcedurePerformerWrapper)item).getAdaptee());
		}
		this.adaptee.setPerformer(itemList);
	}

	public void addPerformer(Participation arg) {
	this.adaptee.getPerformer().add(((org.reimagineehr.model.quick.wrapper.backbone.ProcedurePerformerWrapper)arg).getAdaptee());
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
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getPerformed();
		if(type instanceof org.hl7.fhir.dstu3.model.DateTimeType) {
			choice = ((org.hl7.fhir.dstu3.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Period) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper((org.hl7.fhir.dstu3.model.Period)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.StringType) {
			choice = ((org.hl7.fhir.dstu3.model.StringType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Age) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.AgeWrapper((org.hl7.fhir.dstu3.model.Age)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.Range) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.OccurrenceAllChoiceImpl(choice);
	}

	public void setOccurrence(OccurrenceAllChoice arg) {
	
		OccurrenceAllChoice choice = arg;
		if(choice.getDateTime() != null) {
			this.adaptee.setPerformed(new org.hl7.fhir.dstu3.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getPeriod() != null) {
			this.adaptee.setPerformed(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}else if(choice.getString() != null) {
			this.adaptee.setPerformed(new org.hl7.fhir.dstu3.model.StringType(choice.getString()));
		}else if(choice.getAge() != null) {
			this.adaptee.setPerformed(((org.reimagineehr.model.quick.wrapper.datatype.AgeWrapper)choice.getAge()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setPerformed(((org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}
	}

	public List<Request> getBasedOn() {
		java.util.List<Request> returnValue = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Reference> references = this.adaptee.getBasedOn();
		for(org.hl7.fhir.dstu3.model.Reference reference : references) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
			if(resource == null) {
				throw new RuntimeException("Reference cannot have a null resource. Please first fetch resource");
			} else 
				if(resource instanceof org.hl7.fhir.dstu3.model.CarePlan) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.request.CarePlanWrapper((org.hl7.fhir.dstu3.model.CarePlan) resource));
				}
				else if(resource instanceof org.hl7.fhir.dstu3.model.ProcedureRequest) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.request.ServiceRequestWrapper((org.hl7.fhir.dstu3.model.ProcedureRequest) resource));
				}
				else if(resource instanceof org.hl7.fhir.dstu3.model.ReferralRequest) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.request.ReferralRequestWrapper((org.hl7.fhir.dstu3.model.ReferralRequest) resource));
				}
			}
			return returnValue;
	}

	public void setBasedOn(java.util.List<Request> arg) {
	for(Request item : arg) {
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(item instanceof org.hl7.fhir.dstu3.model.CarePlan) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.CarePlanWrapper)item).getAdaptee());
			this.adaptee.addBasedOn(reference);
		} else if(item instanceof org.hl7.fhir.dstu3.model.ProcedureRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.ServiceRequestWrapper)item).getAdaptee());
			this.adaptee.addBasedOn(reference);
		} else if(item instanceof org.hl7.fhir.dstu3.model.ReferralRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.ReferralRequestWrapper)item).getAdaptee());
			this.adaptee.addBasedOn(reference);
		}
	}
	}

	public void addBasedOn(Request arg) {
	
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(arg instanceof org.hl7.fhir.dstu3.model.CarePlan) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.CarePlanWrapper)arg).getAdaptee());
			this.adaptee.addBasedOn(reference);
		} else if(arg instanceof org.hl7.fhir.dstu3.model.ProcedureRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.ServiceRequestWrapper)arg).getAdaptee());
			this.adaptee.addBasedOn(reference);
		} else if(arg instanceof org.hl7.fhir.dstu3.model.ReferralRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.ReferralRequestWrapper)arg).getAdaptee());
			this.adaptee.addBasedOn(reference);
		}
	}

	public Party getRecorder() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRecorder(Party arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Date getRecorded() {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-recorded");
		if(extensions != null && extensions.size() > 0) {
			org.hl7.fhir.dstu3.model.Extension extension = extensions.get(0);
			return ((org.hl7.fhir.dstu3.model.DateType)extension.getValue()).getValue();
		} else {
			return null;
		}
	}

	public void setRecorded(Date arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-recorded");
		org.hl7.fhir.dstu3.model.Extension extension = null;
		if(extensions == null || extensions.size() <= 0) {
			extension = this.adaptee.addExtension();
			extension.setUrl("http://example.com/extensions/my-recorded");
		} else {
			extension = extensions.get(0);
		}
		extension.setValue(new org.hl7.fhir.dstu3.model.DateType(arg));
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getOutcome() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getOutcome());
	}

	public void setOutcome(CodeableConcept arg) {
	this.adaptee.setOutcome(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getBodySite() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getBodySite());
	}

	public void setBodySite(java.util.List<CodeableConcept> arg) {
		this.adaptee.setBodySite(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addBodySite(CodeableConcept arg) {
		this.adaptee.addBodySite(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<Event> getPartOf() {
		java.util.List<Event> returnValue = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Reference> references = this.adaptee.getPartOf();
		for(org.hl7.fhir.dstu3.model.Reference reference : references) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
			if(resource == null) {
				throw new RuntimeException("Reference cannot have a null resource. Please first fetch resource");
			} else 
				if(resource instanceof org.hl7.fhir.dstu3.model.Procedure) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.event.ProcedureWrapper((org.hl7.fhir.dstu3.model.Procedure) resource));
				}
				else if(resource instanceof org.hl7.fhir.dstu3.model.MedicationAdministration) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.event.MedicationAdministrationWrapper((org.hl7.fhir.dstu3.model.MedicationAdministration) resource));
				}
				else if(resource instanceof org.hl7.fhir.dstu3.model.Observation) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper((org.hl7.fhir.dstu3.model.Observation) resource));
				}
			}
			return returnValue;
	}

	public void setPartOf(java.util.List<Event> arg) {
	for(Event item : arg) {
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(item instanceof org.hl7.fhir.dstu3.model.Procedure) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.event.ProcedureWrapper)item).getAdaptee());
			this.adaptee.addPartOf(reference);
		} else if(item instanceof org.hl7.fhir.dstu3.model.MedicationAdministration) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.event.MedicationAdministrationWrapper)item).getAdaptee());
			this.adaptee.addPartOf(reference);
		} else if(item instanceof org.hl7.fhir.dstu3.model.Observation) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper)item).getAdaptee());
			this.adaptee.addPartOf(reference);
		}
	}
	}

	public void addPartOf(Event arg) {
	
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if(arg instanceof org.hl7.fhir.dstu3.model.Procedure) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.event.ProcedureWrapper)arg).getAdaptee());
			this.adaptee.addPartOf(reference);
		} else if(arg instanceof org.hl7.fhir.dstu3.model.MedicationAdministration) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.event.MedicationAdministrationWrapper)arg).getAdaptee());
			this.adaptee.addPartOf(reference);
		} else if(arg instanceof org.hl7.fhir.dstu3.model.Observation) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.finding.ObservationWrapper)arg).getAdaptee());
			this.adaptee.addPartOf(reference);
		}
	}

}