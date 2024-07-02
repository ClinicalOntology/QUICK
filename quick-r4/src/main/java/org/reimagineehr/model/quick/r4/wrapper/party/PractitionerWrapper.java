package org.reimagineehr.model.quick.r4.wrapper.party;

import org.reimagineehr.model.quick.api.party.Practitioner;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.ProfessionalQualification;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PractitionerWrapper implements Practitioner {

	private org.hl7.fhir.r4.model.Practitioner adaptee;

	public PractitionerWrapper() {
	
	}

	public PractitionerWrapper(org.hl7.fhir.r4.model.Practitioner adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Practitioner getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Practitioner arg) {
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

	public List<ProfessionalQualification> getQualification() {
		List<org.reimagineehr.model.quick.api.backbone.ProfessionalQualification> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent> items = this.adaptee.getQualification();
		for(org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.ProfessionalQualificationWrapper(item));
		}
		return returnList;
	}

	public void setQualification(java.util.List<ProfessionalQualification> arg) {
		List<org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ProfessionalQualification item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.ProfessionalQualificationWrapper)item).getAdaptee());
		}
		this.adaptee.setQualification(targetList);
	}

	public void addQualification(ProfessionalQualification arg) {
		this.adaptee.addQualification(((org.reimagineehr.model.quick.r4.wrapper.backbone.ProfessionalQualificationWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getCommunication() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCodeableConcept(this.adaptee.getCommunication());
	}

	public void setCommunication(java.util.List<CodeableConcept> arg) {
		this.adaptee.setCommunication(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public void addCommunication(CodeableConcept arg) {
		this.adaptee.addCommunication(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

}