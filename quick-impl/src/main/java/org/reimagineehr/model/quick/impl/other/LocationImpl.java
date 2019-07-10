package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Location;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Coding;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.GpsLocation;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class LocationImpl extends DomainResourceImpl implements Location {

	private List<Identifier> identifier;
	private String status;
	private Coding operationalStatus;
	private String name;
	private List<String> alias;
	private List<String> description;
	private String mode;
	private List<CodeableConcept> type;
	private List<ContactPoint> telecom;
	private Address address;
	private CodeableConcept physicalType;
	private List<GpsLocation> position;
	private Organization managingOrganization;
	private Location partOf;
	private List<AvailableTime> hoursOfOperation;
	private String availabilityExceptions;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public Coding getOperationalStatus() {
		return this.operationalStatus;
	}

	public void setOperationalStatus(Coding arg) {
		this.operationalStatus=arg;
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

	public List<String> getDescription() {
		return this.description;
	}

	public void setDescription(List<String> arg) {
		this.description=arg;
	}

	public void addDescription(String arg) {
		this.description.add(arg);
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String arg) {
		this.mode=arg;
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

	public List<ContactPoint> getTelecom() {
		return this.telecom;
	}

	public void setTelecom(List<ContactPoint> arg) {
		this.telecom=arg;
	}

	public void addTelecom(ContactPoint arg) {
		this.telecom.add(arg);
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address arg) {
		this.address=arg;
	}

	public CodeableConcept getPhysicalType() {
		return this.physicalType;
	}

	public void setPhysicalType(CodeableConcept arg) {
		this.physicalType=arg;
	}

	public List<GpsLocation> getPosition() {
		return this.position;
	}

	public void setPosition(List<GpsLocation> arg) {
		this.position=arg;
	}

	public void addPosition(GpsLocation arg) {
		this.position.add(arg);
	}

	public Organization getManagingOrganization() {
		return this.managingOrganization;
	}

	public void setManagingOrganization(Organization arg) {
		this.managingOrganization=arg;
	}

	public Location getPartOf() {
		return this.partOf;
	}

	public void setPartOf(Location arg) {
		this.partOf=arg;
	}

	public List<AvailableTime> getHoursOfOperation() {
		return this.hoursOfOperation;
	}

	public void setHoursOfOperation(List<AvailableTime> arg) {
		this.hoursOfOperation=arg;
	}

	public void addHoursOfOperation(AvailableTime arg) {
		this.hoursOfOperation.add(arg);
	}

	public String getAvailabilityExceptions() {
		return this.availabilityExceptions;
	}

	public void setAvailabilityExceptions(String arg) {
		this.availabilityExceptions=arg;
	}

}