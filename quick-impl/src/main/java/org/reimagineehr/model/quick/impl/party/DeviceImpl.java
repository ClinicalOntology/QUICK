package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.PartyImpl;
import org.reimagineehr.model.quick.api.party.Device;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DeviceUdiCarrier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.DeviceName;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Patient;
import org.reimagineehr.model.quick.api.party.Organization;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.DeviceVersion;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.backbone.Annotation;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceImpl extends PartyImpl implements Device {

	private List<DeviceUdiCarrier> udiCarrier;
	private CodeableConcept type;
	private List<DeviceName> deviceName;
	private String status;
	private List<CodeableConcept> statusReason;
	private Patient patient;
	private Organization owner;
	private String distinctIdentifier;
	private String manufacturer;
	private Date manufactureDate;
	private Date expirationDate;
	private String lotNumber;
	private String serialNumber;
	private String modelNumber;
	private String partNumber;
	private List<DeviceVersion> version;
	private List<ContactPoint> contact;
	private Location location;
	private String url;
	private List<Annotation> note;
	private List<CodeableConcept> safety;
	private Device parent;

	public List<DeviceUdiCarrier> getUdiCarrier() {
		return this.udiCarrier;
	}

	public void setUdiCarrier(List<DeviceUdiCarrier> arg) {
		this.udiCarrier=arg;
	}

	public void addUdiCarrier(DeviceUdiCarrier arg) {
		this.udiCarrier.add(arg);
	}

	public CodeableConcept getType() {
		return this.type;
	}

	public void setType(CodeableConcept arg) {
		this.type=arg;
	}

	public List<DeviceName> getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(List<DeviceName> arg) {
		this.deviceName=arg;
	}

	public void addDeviceName(DeviceName arg) {
		this.deviceName.add(arg);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public List<CodeableConcept> getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(List<CodeableConcept> arg) {
		this.statusReason=arg;
	}

	public void addStatusReason(CodeableConcept arg) {
		this.statusReason.add(arg);
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient arg) {
		this.patient=arg;
	}

	public Organization getOwner() {
		return this.owner;
	}

	public void setOwner(Organization arg) {
		this.owner=arg;
	}

	public String getDistinctIdentifier() {
		return this.distinctIdentifier;
	}

	public void setDistinctIdentifier(String arg) {
		this.distinctIdentifier=arg;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String arg) {
		this.manufacturer=arg;
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date arg) {
		this.manufactureDate=arg;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date arg) {
		this.expirationDate=arg;
	}

	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String arg) {
		this.lotNumber=arg;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String arg) {
		this.serialNumber=arg;
	}

	public String getModelNumber() {
		return this.modelNumber;
	}

	public void setModelNumber(String arg) {
		this.modelNumber=arg;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String arg) {
		this.partNumber=arg;
	}

	public List<DeviceVersion> getVersion() {
		return this.version;
	}

	public void setVersion(List<DeviceVersion> arg) {
		this.version=arg;
	}

	public void addVersion(DeviceVersion arg) {
		this.version.add(arg);
	}

	public List<ContactPoint> getContact() {
		return this.contact;
	}

	public void setContact(List<ContactPoint> arg) {
		this.contact=arg;
	}

	public void addContact(ContactPoint arg) {
		this.contact.add(arg);
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location arg) {
		this.location=arg;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String arg) {
		this.url=arg;
	}

	public List<Annotation> getNote() {
		return this.note;
	}

	public void setNote(List<Annotation> arg) {
		this.note=arg;
	}

	public void addNote(Annotation arg) {
		this.note.add(arg);
	}

	public List<CodeableConcept> getSafety() {
		return this.safety;
	}

	public void setSafety(List<CodeableConcept> arg) {
		this.safety=arg;
	}

	public void addSafety(CodeableConcept arg) {
		this.safety.add(arg);
	}

	public Device getParent() {
		return this.parent;
	}

	public void setParent(Device arg) {
		this.parent=arg;
	}

}