package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OrganizationalContactWrapper implements OrganizationalContact {

	private org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent adaptee;

	public OrganizationalContactWrapper() {
	
	}

	public OrganizationalContactWrapper(org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Organization.OrganizationContactComponent arg) {
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

	public CodeableConcept getPurpose() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getPurpose());
	}

	public void setPurpose(CodeableConcept arg) {
	this.adaptee.setPurpose(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

}