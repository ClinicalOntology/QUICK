package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.IndividualCareRecipientImpl;
import org.reimagineehr.model.quick.api.party.Patient;
import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
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
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class PatientImpl extends IndividualCareRecipientImpl implements Patient {

	private Boolean active;
	private List<HumanName> name;
	private List<ContactPoint> telecom;
	private String gender;
	private Date birthDate;
	private BooleanDateTimeChoice deceased;
	private List<Address> address;
	private CodeableConcept maritalStatus;
	private BooleanOrIntegerChoice multipleBirth;
	private List<Attachment> photo;
	private List<IndividualContact> contact;
	private List<LanguageCompetency> communication;
	private List<CareGiver> generalPractitioner;
	private Organization managingOrganization;
	private List<RecordLink> link;

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

	public BooleanDateTimeChoice getDeceased() {
		return this.deceased;
	}

	public void setDeceased(BooleanDateTimeChoice arg) {
		this.deceased=arg;
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

	public CodeableConcept getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(CodeableConcept arg) {
		this.maritalStatus=arg;
	}

	public BooleanOrIntegerChoice getMultipleBirth() {
		return this.multipleBirth;
	}

	public void setMultipleBirth(BooleanOrIntegerChoice arg) {
		this.multipleBirth=arg;
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

	public List<IndividualContact> getContact() {
		return this.contact;
	}

	public void setContact(List<IndividualContact> arg) {
		this.contact=arg;
	}

	public void addContact(IndividualContact arg) {
		this.contact.add(arg);
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

	public List<CareGiver> getGeneralPractitioner() {
		return this.generalPractitioner;
	}

	public void setGeneralPractitioner(List<CareGiver> arg) {
		this.generalPractitioner=arg;
	}

	public void addGeneralPractitioner(CareGiver arg) {
		this.generalPractitioner.add(arg);
	}

	public Organization getManagingOrganization() {
		return this.managingOrganization;
	}

	public void setManagingOrganization(Organization arg) {
		this.managingOrganization=arg;
	}

	public List<RecordLink> getLink() {
		return this.link;
	}

	public void setLink(List<RecordLink> arg) {
		this.link=arg;
	}

	public void addLink(RecordLink arg) {
		this.link.add(arg);
	}

}