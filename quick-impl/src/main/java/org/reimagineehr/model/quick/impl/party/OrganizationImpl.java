package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.CareGiverImpl;
import org.reimagineehr.model.quick.api.party.Organization;
import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OrganizationImpl extends CareGiverImpl implements Organization {

	private Boolean active;
	private List<CodeableConcept> type;
	private String name;
	private List<String> alias;
	private List<ContactPoint> telecom;
	private List<Address> address;
	private Organization partOf;
	private List<OrganizationalContact> contact;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
	}

	public List<CodeableConcept> getType() {
		return this.type;
	}

	public void setType(List<CodeableConcept> arg) {
		this.type=arg;
	}

	public void addType(CodeableConcept arg) {
		this.type.add(arg);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name=arg;
	}

	public List<String> getAlias() {
		return this.alias;
	}

	public void setAlias(List<String> arg) {
		this.alias=arg;
	}

	public void addAlias(String arg) {
		this.alias.add(arg);
	}

	public List<ContactPoint> getTelecom() {
		return this.telecom;
	}

	public void setTelecom(List<ContactPoint> arg) {
		this.telecom=arg;
	}

	public void addTelecom(ContactPoint arg) {
		this.telecom.add(arg);
	}

	public List<Address> getAddress() {
		return this.address;
	}

	public void setAddress(List<Address> arg) {
		this.address=arg;
	}

	public void addAddress(Address arg) {
		this.address.add(arg);
	}

	public Organization getPartOf() {
		return this.partOf;
	}

	public void setPartOf(Organization arg) {
		this.partOf=arg;
	}

	public List<OrganizationalContact> getContact() {
		return this.contact;
	}

	public void setContact(List<OrganizationalContact> arg) {
		this.contact=arg;
	}

	public void addContact(OrganizationalContact arg) {
		this.contact.add(arg);
	}

}