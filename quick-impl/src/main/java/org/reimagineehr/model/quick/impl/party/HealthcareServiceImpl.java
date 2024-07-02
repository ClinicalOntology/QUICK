package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.CareGiverImpl;
import org.reimagineehr.model.quick.api.party.HealthcareService;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.party.Organization;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.other.Location;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Eligibility;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;
import org.reimagineehr.model.quick.api.backbone.NonAvailability;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class HealthcareServiceImpl extends CareGiverImpl implements HealthcareService {

	private Boolean active;
	private Organization providedBy;
	private List<CodeableConcept> category;
	private List<CodeableConcept> type;
	private List<CodeableConcept> specialty;
	private List<Location> location;
	private String name;
	private String comment;
	private String extraDetails;
	private Attachment photo;
	private List<ContactPoint> telecom;
	private List<Location> coverageArea;
	private List<CodeableConcept> serviceProvisionCode;
	private List<Eligibility> eligibility;
	private List<CodeableConcept> program;
	private List<CodeableConcept> characteristic;
	private List<CodeableConcept> communication;
	private List<CodeableConcept> referralMethod;
	private Boolean appointmentRequired;
	private List<AvailableTime> availableTime;
	private List<NonAvailability> notAvailable;
	private String availabilityException;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
	}

	public Organization getProvidedBy() {
		return this.providedBy;
	}

	public void setProvidedBy(Organization arg) {
		this.providedBy=arg;
	}

	public List<CodeableConcept> getCategory() {
		return this.category;
	}

	public void setCategory(List<CodeableConcept> arg) {
		this.category=arg;
	}

	public void addCategory(CodeableConcept arg) {
		this.category.add(arg);
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

	public List<CodeableConcept> getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(List<CodeableConcept> arg) {
		this.specialty=arg;
	}

	public void addSpecialty(CodeableConcept arg) {
		this.specialty.add(arg);
	}

	public List<Location> getLocation() {
		return this.location;
	}

	public void setLocation(List<Location> arg) {
		this.location=arg;
	}

	public void addLocation(Location arg) {
		this.location.add(arg);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name=arg;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String arg) {
		this.comment=arg;
	}

	public String getExtraDetails() {
		return this.extraDetails;
	}

	public void setExtraDetails(String arg) {
		this.extraDetails=arg;
	}

	public Attachment getPhoto() {
		return this.photo;
	}

	public void setPhoto(Attachment arg) {
		this.photo=arg;
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

	public List<Location> getCoverageArea() {
		return this.coverageArea;
	}

	public void setCoverageArea(List<Location> arg) {
		this.coverageArea=arg;
	}

	public void addCoverageArea(Location arg) {
		this.coverageArea.add(arg);
	}

	public List<CodeableConcept> getServiceProvisionCode() {
		return this.serviceProvisionCode;
	}

	public void setServiceProvisionCode(List<CodeableConcept> arg) {
		this.serviceProvisionCode=arg;
	}

	public void addServiceProvisionCode(CodeableConcept arg) {
		this.serviceProvisionCode.add(arg);
	}

	public List<Eligibility> getEligibility() {
		return this.eligibility;
	}

	public void setEligibility(List<Eligibility> arg) {
		this.eligibility=arg;
	}

	public void addEligibility(Eligibility arg) {
		this.eligibility.add(arg);
	}

	public List<CodeableConcept> getProgram() {
		return this.program;
	}

	public void setProgram(List<CodeableConcept> arg) {
		this.program=arg;
	}

	public void addProgram(CodeableConcept arg) {
		this.program.add(arg);
	}

	public List<CodeableConcept> getCharacteristic() {
		return this.characteristic;
	}

	public void setCharacteristic(List<CodeableConcept> arg) {
		this.characteristic=arg;
	}

	public void addCharacteristic(CodeableConcept arg) {
		this.characteristic.add(arg);
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

	public List<CodeableConcept> getReferralMethod() {
		return this.referralMethod;
	}

	public void setReferralMethod(List<CodeableConcept> arg) {
		this.referralMethod=arg;
	}

	public void addReferralMethod(CodeableConcept arg) {
		this.referralMethod.add(arg);
	}

	public Boolean getAppointmentRequired() {
		return this.appointmentRequired;
	}

	public void setAppointmentRequired(Boolean arg) {
		this.appointmentRequired=arg;
	}

	public List<AvailableTime> getAvailableTime() {
		return this.availableTime;
	}

	public void setAvailableTime(List<AvailableTime> arg) {
		this.availableTime=arg;
	}

	public void addAvailableTime(AvailableTime arg) {
		this.availableTime.add(arg);
	}

	public List<NonAvailability> getNotAvailable() {
		return this.notAvailable;
	}

	public void setNotAvailable(List<NonAvailability> arg) {
		this.notAvailable=arg;
	}

	public void addNotAvailable(NonAvailability arg) {
		this.notAvailable.add(arg);
	}

	public String getAvailabilityException() {
		return this.availabilityException;
	}

	public void setAvailabilityException(String arg) {
		this.availabilityException=arg;
	}

}