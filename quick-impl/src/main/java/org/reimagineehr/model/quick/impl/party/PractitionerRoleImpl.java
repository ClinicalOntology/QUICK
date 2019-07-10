package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.IndividualCareGiverImpl;
import org.reimagineehr.model.quick.api.party.PractitionerRole;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Practitioner;
import org.reimagineehr.model.quick.api.party.Organization;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.party.HealthcareService;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;
import org.reimagineehr.model.quick.api.backbone.NonAvailability;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class PractitionerRoleImpl extends IndividualCareGiverImpl implements PractitionerRole {

	private Boolean active;
	private Period period;
	private Practitioner practitioner;
	private Organization organization;
	private List<CodeableConcept> code;
	private List<CodeableConcept> specialty;
	private List<Location> location;
	private List<HealthcareService> healthcareService;
	private List<ContactPoint> telecom;
	private List<AvailableTime> availableTime;
	private List<NonAvailability> notAvailable;
	private String availabilityExceptions;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Practitioner getPractitioner() {
		return this.practitioner;
	}

	public void setPractitioner(Practitioner arg) {
		this.practitioner=arg;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization arg) {
		this.organization=arg;
	}

	public List<CodeableConcept> getCode() {
		return this.code;
	}

	public void setCode(List<CodeableConcept> arg) {
		this.code=arg;
	}

	public void addCode(CodeableConcept arg) {
		this.code.add(arg);
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

	public List<HealthcareService> getHealthcareService() {
		return this.healthcareService;
	}

	public void setHealthcareService(List<HealthcareService> arg) {
		this.healthcareService=arg;
	}

	public void addHealthcareService(HealthcareService arg) {
		this.healthcareService.add(arg);
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

	public String getAvailabilityExceptions() {
		return this.availabilityExceptions;
	}

	public void setAvailabilityExceptions(String arg) {
		this.availabilityExceptions=arg;
	}

}