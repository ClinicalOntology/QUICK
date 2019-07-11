package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.IndividualContact;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IndividualContactWrapper implements IndividualContact {

	private org.hl7.fhir.dstu3.model.Patient.ContactComponent adaptee;

	public IndividualContactWrapper() {
	
	}

	public IndividualContactWrapper(org.hl7.fhir.dstu3.model.Patient.ContactComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Patient.ContactComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Patient.ContactComponent arg) {
		this.adaptee=arg;
	}

	public HumanName getName() {
	
		return new org.reimagineehr.model.quick.wrapper.backbone.HumanNameWrapper(this.adaptee.getName());
	}

	public void setName(HumanName arg) {
	
		this.adaptee.setName(((org.reimagineehr.model.quick.wrapper.backbone.HumanNameWrapper)arg).getAdaptee());
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

	public Address getAddress() {
	
		return new org.reimagineehr.model.quick.wrapper.backbone.AddressWrapper(this.adaptee.getAddress());
	}

	public void setAddress(Address arg) {
	
		this.adaptee.setAddress(((org.reimagineehr.model.quick.wrapper.backbone.AddressWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getRelationship() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getRelationship());
	}

	public void setRelationship(java.util.List<CodeableConcept> arg) {
		this.adaptee.setRelationship(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addRelationship(CodeableConcept arg) {
		this.adaptee.addRelationship(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public String getGender() {
		org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender>  item = this.adaptee.getGenderElement();
		return item.getValueAsString();
	}

	public void setGender(String arg) {
		this.adaptee.setGenderElement((new org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGenderEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(arg)));
	}

	public Organization getOrganization() {
		return new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getOrganization()).getResource());
	}

	public void setOrganization(Organization arg) {
		this.adaptee.setOrganization(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

}