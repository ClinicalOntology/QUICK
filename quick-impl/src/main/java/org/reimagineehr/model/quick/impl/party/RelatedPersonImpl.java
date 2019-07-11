package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.IndividualCareRecipientImpl;
import org.reimagineehr.model.quick.api.party.RelatedPerson;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.party.Patient;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RelatedPersonImpl extends IndividualCareRecipientImpl implements RelatedPerson {

	private Boolean active;
	private Patient patient;
	private List<CodeableConcept> relationship;
	private List<HumanName> name;
	private List<ContactPoint> telecom;
	private String gender;
	private Date birthDate;
	private List<Address> address;
	private List<Attachment> photo;
	private Period period;
	private List<LanguageCompetency> communication;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient arg) {
		this.patient=arg;
	}

	public List<CodeableConcept> getRelationship() {
		return this.relationship;
	}

	public void setRelationship(List<CodeableConcept> arg) {
		this.relationship=arg;
	}

	public void addRelationship(CodeableConcept arg) {
		this.relationship.add(arg);
	}

	public List<HumanName> getName() {
		return this.name;
	}

	public void setName(List<HumanName> arg) {
		this.name=arg;
	}

	public void addName(HumanName arg) {
		this.name.add(arg);
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String arg) {
		this.gender=arg;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date arg) {
		this.birthDate=arg;
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

	public List<Attachment> getPhoto() {
		return this.photo;
	}

	public void setPhoto(List<Attachment> arg) {
		this.photo=arg;
	}

	public void addPhoto(Attachment arg) {
		this.photo.add(arg);
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public List<LanguageCompetency> getCommunication() {
		return this.communication;
	}

	public void setCommunication(List<LanguageCompetency> arg) {
		this.communication=arg;
	}

	public void addCommunication(LanguageCompetency arg) {
		this.communication.add(arg);
	}

}