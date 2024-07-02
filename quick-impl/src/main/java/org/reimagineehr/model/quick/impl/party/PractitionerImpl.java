package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.IndividualCareGiverImpl;
import org.reimagineehr.model.quick.api.party.Practitioner;
import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.ProfessionalQualification;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PractitionerImpl extends IndividualCareGiverImpl implements Practitioner {

	private Boolean active;
	private List<HumanName> name;
	private List<ContactPoint> telecom;
	private List<Address> address;
	private String gender;
	private Date birthDate;
	private List<Attachment> photo;
	private List<ProfessionalQualification> qualification;
	private List<CodeableConcept> communication;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
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

	public List<Address> getAddress() {
		return this.address;
	}

	public void setAddress(List<Address> arg) {
		this.address=arg;
	}

	public void addAddress(Address arg) {
		this.address.add(arg);
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

	public List<Attachment> getPhoto() {
		return this.photo;
	}

	public void setPhoto(List<Attachment> arg) {
		this.photo=arg;
	}

	public void addPhoto(Attachment arg) {
		this.photo.add(arg);
	}

	public List<ProfessionalQualification> getQualification() {
		return this.qualification;
	}

	public void setQualification(List<ProfessionalQualification> arg) {
		this.qualification=arg;
	}

	public void addQualification(ProfessionalQualification arg) {
		this.qualification.add(arg);
	}

	public List<CodeableConcept> getCommunication() {
		return this.communication;
	}

	public void setCommunication(List<CodeableConcept> arg) {
		this.communication=arg;
	}

	public void addCommunication(CodeableConcept arg) {
		this.communication.add(arg);
	}

}