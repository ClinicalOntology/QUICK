package org.reimagineehr.model.quick.r4.wrapper.finding;

import org.reimagineehr.model.quick.api.finding.Condition;
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
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ConditionWrapper implements Condition {

	private org.hl7.fhir.r4.model.Condition adaptee;

	public ConditionWrapper() {
	
	}

	public ConditionWrapper(org.hl7.fhir.r4.model.Condition adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Condition getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Condition arg) {
		this.adaptee=arg;
	}

	public String getId() {
	return this.adaptee.getIdElement().getValue();
	}

	public void setId(String arg) {
	this.adaptee.setId(arg);
	}

	public Meta getMeta() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.MetaWrapper(this.adaptee.getMeta());
	}

	public void setMeta(Meta arg) {
	
		this.adaptee.setMeta(((org.reimagineehr.model.quick.r4.wrapper.datatype.MetaWrapper)arg).getAdaptee());
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
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.NarrativeWrapper(this.adaptee.getText());
	}

	public void setText(Narrative arg) {
	
		this.adaptee.setText(((org.reimagineehr.model.quick.r4.wrapper.datatype.NarrativeWrapper)arg).getAdaptee());
	}

	public List<Identifier> getIdentifier() {
		List<org.reimagineehr.model.quick.api.datatype.Identifier> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Identifier> items = this.adaptee.getIdentifier();
		for(org.hl7.fhir.r4.model.Identifier item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper(item));
		}
		return returnList;
	}

	public void setIdentifier(java.util.List<Identifier> arg) {
		List<org.hl7.fhir.r4.model.Identifier> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Identifier item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper)item).getAdaptee());
		}
		this.adaptee.setIdentifier(targetList);
	}

	public void addIdentifier(Identifier arg) {
		this.adaptee.addIdentifier(((org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public String getStatus() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setStatus(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public CodeableConcept getStatusReason() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setStatusReason(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public CareRecipient getSubject() {
		CareRecipient returnValue = null;
		org.hl7.fhir.r4.model.Reference reference = this.adaptee.getSubject();
		org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.r4.model.Patient) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.r4.model.Group) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.GroupWrapper((org.hl7.fhir.r4.model.Group)resource);}
		return returnValue;
	}

	public void setSubject(CareRecipient arg) {
		org.hl7.fhir.r4.model.Resource resource = ((org.reimagineehr.model.quick.r4.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.r4.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.r4.model.Patient||resource instanceof org.hl7.fhir.r4.model.Group) {
		reference = new org.hl7.fhir.r4.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"subject", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setSubject(reference);
	}

	public List<Participation> getPerformer() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setPerformer(java.util.List<Participation> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addPerformer(Participation arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<CodeableConcept> getReasonCode() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setReasonCode(java.util.List<CodeableConcept> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addReasonCode(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<Finding> getReasonReference() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setReasonReference(java.util.List<Finding> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addReasonReference(Finding arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public OccurrenceAllChoice getOccurrence() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setOccurrence(OccurrenceAllChoice arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<Request> getBasedOn() {
	throw new RuntimeException("Not implemented yet");
	}

	public void setBasedOn(java.util.List<Request> arg) {
	throw new RuntimeException("Not implemented yet");
	}

	public void addBasedOn(Request arg) {
	throw new RuntimeException("Not implemented yet");
	}

	public Party getRecorder() {
		java.util.List<org.hl7.fhir.r4.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-recorder");
		if(extensions != null && extensions.size() > 0) {
			org.hl7.fhir.r4.model.Extension extension = extensions.get(0);org.hl7.fhir.r4.model.Reference reference = (org.hl7.fhir.r4.model.Reference)extension.getValue();org.hl7.fhir.r4.model.DomainResource domainResource = (org.hl7.fhir.r4.model.DomainResource)reference.getResource();
			if  (domainResource != null && domainResource instanceof org.hl7.fhir.r4.model.Practitioner) {
				 return new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner)domainResource);
			} else if (domainResource != null && domainResource instanceof org.hl7.fhir.r4.model.PractitionerRole) {
				 return new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerRoleWrapper((org.hl7.fhir.r4.model.PractitionerRole)domainResource);
			} else if (domainResource != null && domainResource instanceof org.hl7.fhir.r4.model.Patient) {
				 return new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient)domainResource);
			} else if (domainResource != null && domainResource instanceof org.hl7.fhir.r4.model.RelatedPerson) {
				 return new org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.r4.model.RelatedPerson)domainResource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else {
			return null;
		}
	}

	public void setRecorder(Party arg) {
		java.util.List<org.hl7.fhir.r4.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-recorder");
		org.hl7.fhir.r4.model.Extension extension = null;
		if(extensions == null || extensions.size() <= 0) {
			extension = this.adaptee.addExtension();
			extension.setUrl("http://hl7.org/fhir/StructureDefinition/condition-recorder");
		} else {
			extension = extensions.get(0);
		}
		if  (arg != null && arg instanceof org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) {
			extension.setValue(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) arg).getAdaptee()));
		} else if (arg != null && arg instanceof org.reimagineehr.model.quick.r4.wrapper.party.PractitionerRoleWrapper) {
			extension.setValue(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerRoleWrapper) arg).getAdaptee()));
		} else if (arg != null && arg instanceof org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) {
			extension.setValue(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) arg).getAdaptee()));
		} else if (arg != null && arg instanceof org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) {
			extension.setValue(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) arg).getAdaptee()));
		} else { throw new RuntimeException("Unsupported resource type");}
	}

	public Date getRecorded() {
		java.util.List<org.hl7.fhir.r4.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-recorded");
		if(extensions != null && extensions.size() > 0) {
			org.hl7.fhir.r4.model.Extension extension = extensions.get(0);
			return ((org.hl7.fhir.r4.model.DateTimeType)extension.getValue()).getValue();
		} else {
			return null;
		}
	}

	public void setRecorded(Date arg) {
		java.util.List<org.hl7.fhir.r4.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-recorded");
		org.hl7.fhir.r4.model.Extension extension = null;
		if(extensions == null || extensions.size() <= 0) {
			extension = this.adaptee.addExtension();
			extension.setUrl("http://hl7.org/fhir/StructureDefinition/condition-recorded");
		} else {
			extension = extensions.get(0);
		}
		extension.setValue(new org.hl7.fhir.r4.model.DateTimeType(arg));
	}

	public Party getAsserter() {
		Party returnValue = null;
		org.hl7.fhir.r4.model.Reference reference = this.adaptee.getAsserter();
		org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.r4.model.Practitioner) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner)resource);}
		else if(resource instanceof org.hl7.fhir.r4.model.Patient) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.r4.model.RelatedPerson) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.r4.model.RelatedPerson)resource);}
		return returnValue;
	}

	public void setAsserter(Party arg) {
		org.hl7.fhir.r4.model.Resource resource = ((org.reimagineehr.model.quick.r4.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.r4.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.r4.model.Practitioner||resource instanceof org.hl7.fhir.r4.model.Patient||resource instanceof org.hl7.fhir.r4.model.RelatedPerson) {
		reference = new org.hl7.fhir.r4.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"asserter", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setAsserter(reference);
	}

	public Date getAssertedDate() {
	return this.adaptee.getAssertedDateElement().getValue();
	}

	public void setAssertedDate(Date arg) {
	this.adaptee.setAssertedDate(arg);
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public OnsetAbatementChoice getOnset() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getOnset();
		if(type instanceof org.hl7.fhir.r4.model.DateTimeType) {
			choice = ((org.hl7.fhir.r4.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.Age) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.AgeWrapper((org.hl7.fhir.r4.model.Age)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Period) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper((org.hl7.fhir.r4.model.Period)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Range) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper((org.hl7.fhir.r4.model.Range)type);
		} else if(type instanceof org.hl7.fhir.r4.model.StringType) {
			choice = ((org.hl7.fhir.r4.model.StringType)type).getValue();
		}
		return new org.reimagineehr.model.quick.impl.choice.OnsetAbatementChoiceImpl(choice);
	}

	public void setOnset(OnsetAbatementChoice arg) {
	
		OnsetAbatementChoice choice = arg;
		if(choice.getDateTime() != null) {
			this.adaptee.setOnset(new org.hl7.fhir.r4.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getAge() != null) {
			this.adaptee.setOnset(((org.reimagineehr.model.quick.r4.wrapper.datatype.AgeWrapper)choice.getAge()).getAdaptee());
		}else if(choice.getPeriod() != null) {
			this.adaptee.setOnset(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setOnset(((org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getString() != null) {
			this.adaptee.setOnset(new org.hl7.fhir.r4.model.StringType(choice.getString()));
		}
	}

	public OnsetAbatementChoice getAbatement() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getAbatement();
		if(type instanceof org.hl7.fhir.r4.model.DateTimeType) {
			choice = ((org.hl7.fhir.r4.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.Age) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.AgeWrapper((org.hl7.fhir.r4.model.Age)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Period) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper((org.hl7.fhir.r4.model.Period)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Range) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper((org.hl7.fhir.r4.model.Range)type);
		} else if(type instanceof org.hl7.fhir.r4.model.StringType) {
			choice = ((org.hl7.fhir.r4.model.StringType)type).getValue();
		}
		return new org.reimagineehr.model.quick.impl.choice.OnsetAbatementChoiceImpl(choice);
	}

	public void setAbatement(OnsetAbatementChoice arg) {
	
		OnsetAbatementChoice choice = arg;
		if(choice.getDateTime() != null) {
			this.adaptee.setAbatement(new org.hl7.fhir.r4.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getAge() != null) {
			this.adaptee.setAbatement(((org.reimagineehr.model.quick.r4.wrapper.datatype.AgeWrapper)choice.getAge()).getAdaptee());
		}else if(choice.getPeriod() != null) {
			this.adaptee.setAbatement(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setAbatement(((org.reimagineehr.model.quick.r4.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getString() != null) {
			this.adaptee.setAbatement(new org.hl7.fhir.r4.model.StringType(choice.getString()));
		}
	}

	public List<CodeableConcept> getBodySite() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCodeableConcept(this.adaptee.getBodySite());
	}

	public void setBodySite(java.util.List<CodeableConcept> arg) {
		this.adaptee.setBodySite(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public void addBodySite(CodeableConcept arg) {
		this.adaptee.addBodySite(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getSeverity() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getSeverity());
	}

	public void setSeverity(CodeableConcept arg) {
	this.adaptee.setSeverity(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public String getClinicalStatus() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setClinicalStatus(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

}