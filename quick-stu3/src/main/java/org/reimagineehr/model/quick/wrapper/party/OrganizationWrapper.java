package org.reimagineehr.model.quick.wrapper.party;

import org.reimagineehr.model.quick.api.party.Organization;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class OrganizationWrapper implements Organization {

	private org.hl7.fhir.dstu3.model.Organization adaptee;

	public OrganizationWrapper() {
	
	}

	public OrganizationWrapper(org.hl7.fhir.dstu3.model.Organization adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Organization getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Organization arg) {
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

	public List<CodeableConcept> getType() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getType());
	}

	public void setType(java.util.List<CodeableConcept> arg) {
		this.adaptee.setType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addType(CodeableConcept arg) {
		this.adaptee.addType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public String getName() {
	return this.adaptee.getNameElement().getValue();
	}

	public void setName(String arg) {
	this.adaptee.setName(arg);
	}

	public List<String> getAlias() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getAlias() != null) {
			for(org.hl7.fhir.dstu3.model.StringType type: this.adaptee.getAlias()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setAlias(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.dstu3.model.StringType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.dstu3.model.StringType(type));
			}
		}
		this.adaptee.setAlias(values);
	}

	public void addAlias(String arg) {
	
		this.adaptee.addAlias(arg);
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

	public Organization getPartOf() {
		return new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getPartOf()).getResource());
	}

	public void setPartOf(Organization arg) {
		this.adaptee.setPartOf(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public List<OrganizationalContact> getContact() {
		List<org.reimagineehr.model.quick.api.backbone.OrganizationalContact> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent> items = this.adaptee.getContact();
		for(org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.OrganizationalContactWrapper(item));
		}
		return returnList;
	}

	public void setContact(java.util.List<OrganizationalContact> arg) {
		List<org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.OrganizationalContact item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.OrganizationalContactWrapper)item).getAdaptee());
		}
		this.adaptee.setContact(targetList);
	}

	public void addContact(OrganizationalContact arg) {
		this.adaptee.addContact(((org.reimagineehr.model.quick.wrapper.backbone.OrganizationalContactWrapper)arg).getAdaptee());
	}

}