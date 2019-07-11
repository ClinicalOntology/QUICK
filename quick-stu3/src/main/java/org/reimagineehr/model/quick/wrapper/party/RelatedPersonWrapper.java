package org.reimagineehr.model.quick.wrapper.party;

import org.reimagineehr.model.quick.api.party.RelatedPerson;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.party.Patient;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RelatedPersonWrapper implements RelatedPerson {

	private org.hl7.fhir.dstu3.model.RelatedPerson adaptee;

	public RelatedPersonWrapper() {
	
	}

	public RelatedPersonWrapper(org.hl7.fhir.dstu3.model.RelatedPerson adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.RelatedPerson getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.RelatedPerson arg) {
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

	public Boolean getActive() {
	return this.adaptee.getActiveElement().getValue();
	}

	public void setActive(Boolean arg) {
	this.adaptee.setActive(arg);
	}

	public Patient getPatient() {
		return new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getPatient()).getResource());
	}

	public void setPatient(Patient arg) {
		this.adaptee.setPatient(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper)arg).getAdaptee()));
	}

	public List<CodeableConcept> getRelationship() {
		java.util.List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> retVal = new java.util.ArrayList<>();
		org.reimagineehr.model.quick.api.datatype.CodeableConcept codeableConcept = org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getRelationship());
		retVal.add(codeableConcept);
		return retVal;
	}

	public void setRelationship(java.util.List<CodeableConcept> arg) {
		if(arg != null && arg.size() > 0) {
			if(arg.size() == 1) {
				this.adaptee.setRelationship(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg.get(0)));
			} else {
				throw new RuntimeException("STU3 only supports list of one item for category");
			}
		}
	}

	public void addRelationship(CodeableConcept arg) {
		throw new RuntimeException("Unsupported operation");
	}

	public List<HumanName> getName() {
		List<org.reimagineehr.model.quick.api.backbone.HumanName> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.HumanName> items = this.adaptee.getName();
		for(org.hl7.fhir.dstu3.model.HumanName item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.HumanNameWrapper(item));
		}
		return returnList;
	}

	public void setName(java.util.List<HumanName> arg) {
		List<org.hl7.fhir.dstu3.model.HumanName> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.HumanName item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.HumanNameWrapper)item).getAdaptee());
		}
		this.adaptee.setName(targetList);
	}

	public void addName(HumanName arg) {
		this.adaptee.addName(((org.reimagineehr.model.quick.wrapper.backbone.HumanNameWrapper)arg).getAdaptee());
	}

	public List<ContactPoint> getTelecom() {
		List<org.reimagineehr.model.quick.api.backbone.ContactPoint> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.ContactPoint> items = this.adaptee.getTelecom();
		for(org.hl7.fhir.dstu3.model.ContactPoint item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper(item));
		}
		return returnList;
	}

	public void setTelecom(java.util.List<ContactPoint> arg) {
		List<org.hl7.fhir.dstu3.model.ContactPoint> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ContactPoint item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper)item).getAdaptee());
		}
		this.adaptee.setTelecom(targetList);
	}

	public void addTelecom(ContactPoint arg) {
		this.adaptee.addTelecom(((org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper)arg).getAdaptee());
	}

	public String getGender() {
		org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender>  item = this.adaptee.getGenderElement();
		return item.getValueAsString();
	}

	public void setGender(String arg) {
		this.adaptee.setGenderElement((new org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGenderEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(arg)));
	}

	public Date getBirthDate() {
	return this.adaptee.getBirthDateElement().getValue();
	}

	public void setBirthDate(Date arg) {
	this.adaptee.setBirthDate(arg);
	}

	public List<Address> getAddress() {
		List<org.reimagineehr.model.quick.api.backbone.Address> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Address> items = this.adaptee.getAddress();
		for(org.hl7.fhir.dstu3.model.Address item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.AddressWrapper(item));
		}
		return returnList;
	}

	public void setAddress(java.util.List<Address> arg) {
		List<org.hl7.fhir.dstu3.model.Address> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.Address item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.AddressWrapper)item).getAdaptee());
		}
		this.adaptee.setAddress(targetList);
	}

	public void addAddress(Address arg) {
		this.adaptee.addAddress(((org.reimagineehr.model.quick.wrapper.backbone.AddressWrapper)arg).getAdaptee());
	}

	public List<Attachment> getPhoto() {
		List<org.reimagineehr.model.quick.api.datatype.Attachment> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Attachment> items = this.adaptee.getPhoto();
		for(org.hl7.fhir.dstu3.model.Attachment item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.datatype.AttachmentWrapper(item));
		}
		return returnList;
	}

	public void setPhoto(java.util.List<Attachment> arg) {
		List<org.hl7.fhir.dstu3.model.Attachment> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Attachment item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.datatype.AttachmentWrapper)item).getAdaptee());
		}
		this.adaptee.setPhoto(targetList);
	}

	public void addPhoto(Attachment arg) {
		this.adaptee.addPhoto(((org.reimagineehr.model.quick.wrapper.datatype.AttachmentWrapper)arg).getAdaptee());
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public List<LanguageCompetency> getCommunication() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setCommunication(java.util.List<LanguageCompetency> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addCommunication(LanguageCompetency arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}