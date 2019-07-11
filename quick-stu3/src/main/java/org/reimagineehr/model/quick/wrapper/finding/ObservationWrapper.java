package org.reimagineehr.model.quick.wrapper.finding;

import org.reimagineehr.model.quick.api.finding.Observation;
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
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import org.reimagineehr.model.quick.api.backbone.ObservationComponent;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.other.Specimen;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ObservationWrapper implements Observation {

	private org.hl7.fhir.dstu3.model.Observation adaptee;

	public ObservationWrapper() {
	
	}

	public ObservationWrapper(org.hl7.fhir.dstu3.model.Observation adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Observation getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Observation arg) {
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
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.Observation.ObservationStatus.fromCode(arg));
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
		java.util.List<org.reimagineehr.model.quick.api.backbone.Participation> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Reference> items = this.adaptee.getPerformer();
		for(org.hl7.fhir.dstu3.model.Reference item : items) {
			org.reimagineehr.model.quick.api.backbone.Participation source = new org.reimagineehr.model.quick.impl.backbone.ParticipationImpl();
			org.hl7.fhir.dstu3.model.DomainResource resource = (org.hl7.fhir.dstu3.model.DomainResource)item.getResource();
			if  (resource instanceof org.hl7.fhir.dstu3.model.Practitioner) {
				source.setActor(new org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper((org.hl7.fhir.dstu3.model.Practitioner) resource));
			} else if (resource instanceof org.hl7.fhir.dstu3.model.Organization) {
				source.setActor(new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization) resource));
			} else if (resource instanceof org.hl7.fhir.dstu3.model.Patient) {
				source.setActor(new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient) resource));
			} else if (resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) {
				source.setActor(new org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson) resource));
			} else { throw new RuntimeException("Unsupported resource type");}
			returnList.add(source);
		}
		return returnList;
	}

	public void setPerformer(java.util.List<Participation> arg) {
		List<org.hl7.fhir.dstu3.model.Reference> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.Participation item : arg) {
			org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
			if  (item.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) item.getActor()).getAdaptee());
				targetList.add(reference);
			} else if (item.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) item.getActor()).getAdaptee());
				targetList.add(reference);
			} else if (item.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.PatientWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper) item.getActor()).getAdaptee());
				targetList.add(reference);
			} else if (item.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) {
				reference.setResource(((org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) item.getActor()).getAdaptee());
				targetList.add(reference);
			} else {
				throw new RuntimeException("Invalid resource");
			}
		}
		this.adaptee.setPerformer(targetList);
	}

	public void addPerformer(Participation arg) {
		org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference();
		if  (arg != null && arg.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper)arg.getActor()).getAdaptee());
		} else if (arg != null && arg.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg.getActor()).getAdaptee());
		} else if (arg != null && arg.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.PatientWrapper) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper)arg.getActor()).getAdaptee());
		} else if (arg != null && arg.getActor() instanceof org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper)arg.getActor()).getAdaptee());
		} else {
			throw new RuntimeException("Invalid resource");
		}
		this.adaptee.addPerformer(reference);
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
		java.util.List<Request> returnValue = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.dstu3.model.Reference> references = this.adaptee.getBasedOn();
		for(org.hl7.fhir.dstu3.model.Reference reference : references) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
			if(resource == null) {
				throw new RuntimeException("Reference cannot have a null resource. Please first fetch resource");
			} else 
				if(resource instanceof org.hl7.fhir.dstu3.model.MedicationRequest) {
					returnValue.add(new org.reimagineehr.model.quick.wrapper.request.MedicationRequestWrapper((org.hl7.fhir.dstu3.model.MedicationRequest) resource));
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
		if(item instanceof org.hl7.fhir.dstu3.model.MedicationRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.MedicationRequestWrapper)item).getAdaptee());
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
		if(arg instanceof org.hl7.fhir.dstu3.model.MedicationRequest) {
			reference.setResource(((org.reimagineehr.model.quick.wrapper.request.MedicationRequestWrapper)arg).getAdaptee());
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
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRecorded(Date arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public Date getIssued() {
	return this.adaptee.getIssuedElement().getValue();
	}

	public void setIssued(Date arg) {
	this.adaptee.setIssued(arg);
	}

	public ObservationValueChoice getValue() {
	
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getValue();
		if(type instanceof org.hl7.fhir.dstu3.model.Quantity) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper((org.hl7.fhir.dstu3.model.Quantity)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.CodeableConcept) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper((org.hl7.fhir.dstu3.model.CodeableConcept)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.StringType) {
			choice = ((org.hl7.fhir.dstu3.model.StringType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.BooleanType) {
			choice = ((org.hl7.fhir.dstu3.model.BooleanType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Range) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.Ratio) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.RatioWrapper((org.hl7.fhir.dstu3.model.Ratio)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.DateTimeType) {
			choice = ((org.hl7.fhir.dstu3.model.DateTimeType)type).getValue();
		} else if(type instanceof org.hl7.fhir.dstu3.model.Period) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper((org.hl7.fhir.dstu3.model.Period)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.ObservationValueChoiceImpl(choice);
	}

	public void setValue(ObservationValueChoice arg) {
	
		ObservationValueChoice choice = arg;
		if(choice.getQuantity() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.QuantityWrapper)choice.getQuantity()).getAdaptee());
		}else if(choice.getCodeableConcept() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper)choice.getCodeableConcept()).getAdaptee());
		}else if(choice.getString() != null) {
			this.adaptee.setValue(new org.hl7.fhir.dstu3.model.StringType(choice.getString()));
		}else if(choice.getBoolean() != null) {
			this.adaptee.setValue(new org.hl7.fhir.dstu3.model.BooleanType(choice.getBoolean()));
		}else if(choice.getRange() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getRatio() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.RatioWrapper)choice.getRatio()).getAdaptee());
		}else if(choice.getDateTime() != null) {
			this.adaptee.setValue(new org.hl7.fhir.dstu3.model.DateTimeType(choice.getDateTime()));
		}else if(choice.getPeriod() != null) {
			this.adaptee.setValue(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}
	}

	public CodeableConcept getMethod() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getMethod());
	}

	public void setMethod(CodeableConcept arg) {
	this.adaptee.setMethod(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<ObservationComponent> getComponent() {
		List<org.reimagineehr.model.quick.api.backbone.ObservationComponent> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent> items = this.adaptee.getComponent();
		for(org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.ObservationComponentWrapper(item));
		}
		return returnList;
	}

	public void setComponent(java.util.List<ObservationComponent> arg) {
		List<org.hl7.fhir.dstu3.model.Observation.ObservationComponentComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ObservationComponent item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.ObservationComponentWrapper)item).getAdaptee());
		}
		this.adaptee.setComponent(targetList);
	}

	public void addComponent(ObservationComponent arg) {
		this.adaptee.addComponent(((org.reimagineehr.model.quick.wrapper.backbone.ObservationComponentWrapper)arg).getAdaptee());
	}

	public CodeableConcept getBodySite() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getBodySite());
	}

	public void setBodySite(CodeableConcept arg) {
	this.adaptee.setBodySite(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getDataAbsentReason() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getDataAbsentReason());
	}

	public void setDataAbsentReason(CodeableConcept arg) {
	this.adaptee.setDataAbsentReason(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public CodeableConcept getInterpretation() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getInterpretation());
	}

	public void setInterpretation(CodeableConcept arg) {
	this.adaptee.setInterpretation(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<DomainResource> getFocus() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setFocus(java.util.List<DomainResource> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addFocus(DomainResource arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Specimen getSpecimen() {
		return new org.reimagineehr.model.quick.wrapper.other.SpecimenWrapper((org.hl7.fhir.dstu3.model.Specimen)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getSpecimen()).getResource());
	}

	public void setSpecimen(Specimen arg) {
		this.adaptee.setSpecimen(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.other.SpecimenWrapper)arg).getAdaptee()));
	}

}