package org.reimagineehr.model.quick.r4.wrapper.party;

import org.reimagineehr.model.quick.api.party.Patient;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.util.Date;
import org.reimagineehr.model.quick.api.choice.BooleanDateTimeChoice;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.BooleanOrIntegerChoice;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.IndividualContact;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;
import org.reimagineehr.model.quick.api.party.CareGiver;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.RecordLink;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PatientWrapper implements Patient {

	private org.hl7.fhir.r4.model.Patient adaptee;

	public PatientWrapper() {
	
	}

	public PatientWrapper(org.hl7.fhir.r4.model.Patient adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Patient getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Patient arg) {
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

	public Boolean getActive() {
	return this.adaptee.getActiveElement().getValue();
	}

	public void setActive(Boolean arg) {
	this.adaptee.setActive(arg);
	}

	public List<HumanName> getName() {
		List<org.reimagineehr.model.quick.api.backbone.HumanName> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.HumanName> items = this.adaptee.getName();
		for(org.hl7.fhir.r4.model.HumanName item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.HumanNameWrapper(item));
		}
		return returnList;
	}

	public void setName(java.util.List<HumanName> arg) {
		List<org.hl7.fhir.r4.model.HumanName> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.HumanName item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.HumanNameWrapper)item).getAdaptee());
		}
		this.adaptee.setName(targetList);
	}

	public void addName(HumanName arg) {
		this.adaptee.addName(((org.reimagineehr.model.quick.r4.wrapper.backbone.HumanNameWrapper)arg).getAdaptee());
	}

	public List<ContactPoint> getTelecom() {
		List<org.reimagineehr.model.quick.api.backbone.ContactPoint> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.ContactPoint> items = this.adaptee.getTelecom();
		for(org.hl7.fhir.r4.model.ContactPoint item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper(item));
		}
		return returnList;
	}

	public void setTelecom(java.util.List<ContactPoint> arg) {
		List<org.hl7.fhir.r4.model.ContactPoint> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ContactPoint item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper)item).getAdaptee());
		}
		this.adaptee.setTelecom(targetList);
	}

	public void addTelecom(ContactPoint arg) {
		this.adaptee.addTelecom(((org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper)arg).getAdaptee());
	}

	public String getGender() {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Enumerations.AdministrativeGender>  item = this.adaptee.getGenderElement();
		return item.getValueAsString();
	}

	public void setGender(String arg) {
		this.adaptee.setGenderElement((new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory()).fromType(new org.hl7.fhir.r4.model.CodeType(arg)));
	}

	public Date getBirthDate() {
	return this.adaptee.getBirthDateElement().getValue();
	}

	public void setBirthDate(Date arg) {
	this.adaptee.setBirthDate(arg);
	}

	public BooleanDateTimeChoice getDeceased() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getDeceased();
		if(type instanceof org.hl7.fhir.r4.model.BooleanType) {
			choice = ((org.hl7.fhir.r4.model.BooleanType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.DateTimeType) {
			choice = ((org.hl7.fhir.r4.model.DateTimeType)type).getValue();
		}
		return new org.reimagineehr.model.quick.impl.choice.BooleanDateTimeChoiceImpl(choice);
	}

	public void setDeceased(BooleanDateTimeChoice arg) {
	
		BooleanDateTimeChoice choice = arg;
		if(choice.getBoolean() != null) {
			this.adaptee.setDeceased(new org.hl7.fhir.r4.model.BooleanType(choice.getBoolean()));
		}else if(choice.getDateTime() != null) {
			this.adaptee.setDeceased(new org.hl7.fhir.r4.model.DateTimeType(choice.getDateTime()));
		}
	}

	public List<Address> getAddress() {
		List<org.reimagineehr.model.quick.api.backbone.Address> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Address> items = this.adaptee.getAddress();
		for(org.hl7.fhir.r4.model.Address item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.AddressWrapper(item));
		}
		return returnList;
	}

	public void setAddress(java.util.List<Address> arg) {
		List<org.hl7.fhir.r4.model.Address> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.Address item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.AddressWrapper)item).getAdaptee());
		}
		this.adaptee.setAddress(targetList);
	}

	public void addAddress(Address arg) {
		this.adaptee.addAddress(((org.reimagineehr.model.quick.r4.wrapper.backbone.AddressWrapper)arg).getAdaptee());
	}

	public CodeableConcept getMaritalStatus() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getMaritalStatus());
	}

	public void setMaritalStatus(CodeableConcept arg) {
	this.adaptee.setMaritalStatus(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public BooleanOrIntegerChoice getMultipleBirth() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getMultipleBirth();
		if(type instanceof org.hl7.fhir.r4.model.BooleanType) {
			choice = ((org.hl7.fhir.r4.model.BooleanType)type).getValue();
		} else if(type instanceof org.hl7.fhir.r4.model.IntegerType) {
			choice = ((org.hl7.fhir.r4.model.IntegerType)type).getValue();
		}
		return new org.reimagineehr.model.quick.impl.choice.BooleanOrIntegerChoiceImpl(choice);
	}

	public void setMultipleBirth(BooleanOrIntegerChoice arg) {
	
		BooleanOrIntegerChoice choice = arg;
		if(choice.getBoolean() != null) {
			this.adaptee.setMultipleBirth(new org.hl7.fhir.r4.model.BooleanType(choice.getBoolean()));
		}else if(choice.getInteger() != null) {
			this.adaptee.setMultipleBirth(new org.hl7.fhir.r4.model.IntegerType(choice.getInteger()));
		}
	}

	public List<Attachment> getPhoto() {
		List<org.reimagineehr.model.quick.api.datatype.Attachment> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Attachment> items = this.adaptee.getPhoto();
		for(org.hl7.fhir.r4.model.Attachment item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.datatype.AttachmentWrapper(item));
		}
		return returnList;
	}

	public void setPhoto(java.util.List<Attachment> arg) {
		List<org.hl7.fhir.r4.model.Attachment> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Attachment item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.datatype.AttachmentWrapper)item).getAdaptee());
		}
		this.adaptee.setPhoto(targetList);
	}

	public void addPhoto(Attachment arg) {
		this.adaptee.addPhoto(((org.reimagineehr.model.quick.r4.wrapper.datatype.AttachmentWrapper)arg).getAdaptee());
	}

	public List<IndividualContact> getContact() {
		List<org.reimagineehr.model.quick.api.backbone.IndividualContact> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Patient.ContactComponent> items = this.adaptee.getContact();
		for(org.hl7.fhir.r4.model.Patient.ContactComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.IndividualContactWrapper(item));
		}
		return returnList;
	}

	public void setContact(java.util.List<IndividualContact> arg) {
		List<org.hl7.fhir.r4.model.Patient.ContactComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.IndividualContact item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.IndividualContactWrapper)item).getAdaptee());
		}
		this.adaptee.setContact(targetList);
	}

	public void addContact(IndividualContact arg) {
		this.adaptee.addContact(((org.reimagineehr.model.quick.r4.wrapper.backbone.IndividualContactWrapper)arg).getAdaptee());
	}

	public List<LanguageCompetency> getCommunication() {
		List<org.reimagineehr.model.quick.api.backbone.LanguageCompetency> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent> items = this.adaptee.getCommunication();
		for(org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.LanguageCompetencyWrapper(item));
		}
		return returnList;
	}

	public void setCommunication(java.util.List<LanguageCompetency> arg) {
		List<org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.LanguageCompetency item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.LanguageCompetencyWrapper)item).getAdaptee());
		}
		this.adaptee.setCommunication(targetList);
	}

	public void addCommunication(LanguageCompetency arg) {
		this.adaptee.addCommunication(((org.reimagineehr.model.quick.r4.wrapper.backbone.LanguageCompetencyWrapper)arg).getAdaptee());
	}

	public List<CareGiver> getGeneralPractitioner() {
		java.util.List<CareGiver> returnValue = new java.util.ArrayList<>();
		java.util.List<org.hl7.fhir.r4.model.Reference> references = this.adaptee.getGeneralPractitioner();
		for(org.hl7.fhir.r4.model.Reference reference : references) {
			org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)reference.getResource();
			if(resource == null) {
				throw new RuntimeException("Reference cannot have a null resource. Please first fetch resource");
			} else 
				if(resource instanceof org.hl7.fhir.r4.model.Organization) {
					returnValue.add(new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization) resource));
				}
				else if(resource instanceof org.hl7.fhir.r4.model.Practitioner) {
					returnValue.add(new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner) resource));
				}
			}
			return returnValue;
	}

	public void setGeneralPractitioner(java.util.List<CareGiver> arg) {
	for(CareGiver item : arg) {
		org.hl7.fhir.r4.model.Reference reference = new org.hl7.fhir.r4.model.Reference();
		if(item instanceof org.hl7.fhir.r4.model.Organization) {
			reference.setResource(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper)item).getAdaptee());
			this.adaptee.addGeneralPractitioner(reference);
		} else if(item instanceof org.hl7.fhir.r4.model.Practitioner) {
			reference.setResource(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper)item).getAdaptee());
			this.adaptee.addGeneralPractitioner(reference);
		}
	}
	}

	public void addGeneralPractitioner(CareGiver arg) {
	
		org.hl7.fhir.r4.model.Reference reference = new org.hl7.fhir.r4.model.Reference();
		if(arg instanceof org.hl7.fhir.r4.model.Organization) {
			reference.setResource(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper)arg).getAdaptee());
			this.adaptee.addGeneralPractitioner(reference);
		} else if(arg instanceof org.hl7.fhir.r4.model.Practitioner) {
			reference.setResource(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper)arg).getAdaptee());
			this.adaptee.addGeneralPractitioner(reference);
		}
	}

	public Organization getManagingOrganization() {
		return new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization)((org.hl7.fhir.r4.model.Reference)this.adaptee.getManagingOrganization()).getResource());
	}

	public void setManagingOrganization(Organization arg) {
		this.adaptee.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public List<RecordLink> getLink() {
		List<org.reimagineehr.model.quick.api.backbone.RecordLink> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Patient.PatientLinkComponent> items = this.adaptee.getLink();
		for(org.hl7.fhir.r4.model.Patient.PatientLinkComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.RecordLinkWrapper(item));
		}
		return returnList;
	}

	public void setLink(java.util.List<RecordLink> arg) {
		List<org.hl7.fhir.r4.model.Patient.PatientLinkComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.RecordLink item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.RecordLinkWrapper)item).getAdaptee());
		}
		this.adaptee.setLink(targetList);
	}

	public void addLink(RecordLink arg) {
		this.adaptee.addLink(((org.reimagineehr.model.quick.r4.wrapper.backbone.RecordLinkWrapper)arg).getAdaptee());
	}

}