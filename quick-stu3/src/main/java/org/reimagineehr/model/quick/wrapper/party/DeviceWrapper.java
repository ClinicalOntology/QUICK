package org.reimagineehr.model.quick.wrapper.party;

import org.reimagineehr.model.quick.api.party.Device;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.backbone.DeviceUdiCarrier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.DeviceName;
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
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DeviceWrapper implements Device {

	private org.hl7.fhir.dstu3.model.Device adaptee;

	public DeviceWrapper() {
	
	}

	public DeviceWrapper(org.hl7.fhir.dstu3.model.Device adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Device getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Device arg) {
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

	public List<DeviceUdiCarrier> getUdiCarrier() {
		List<org.reimagineehr.model.quick.api.backbone.DeviceUdiCarrier> returnList = new java.util.ArrayList<>();
		org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent item = this.adaptee.getUdi();
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.DeviceUdiCarrierWrapper(item));
		return returnList;
	}

	public void setUdiCarrier(java.util.List<DeviceUdiCarrier> arg) {
		org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent value = null;
		if(arg != null && arg.size() > 0) {
			if(arg.size() == 1) {
				value = ((org.reimagineehr.model.quick.wrapper.backbone.DeviceUdiCarrierWrapper)arg.get(0)).getAdaptee();
			} else {
				throw new RuntimeException("Invalid argument - only a single value allowed for type in STU3");
			}
		}
		this.adaptee.setUdi(value);
	}

	public void addUdiCarrier(DeviceUdiCarrier arg) {
		throw new RuntimeException("Invalid operation");
	}

	public CodeableConcept getType() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getType());
	}

	public void setType(CodeableConcept arg) {
	this.adaptee.setType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public List<DeviceName> getDeviceName() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setDeviceName(java.util.List<DeviceName> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addDeviceName(DeviceName arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getStatus() {
		org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Device.FHIRDeviceStatus>  item = this.adaptee.getStatusElement();
		return item.getValueAsString();
	}

	public void setStatus(String arg) {
		this.adaptee.setStatusElement((new org.hl7.fhir.dstu3.model.Device.FHIRDeviceStatusEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(arg)));
	}

	public List<CodeableConcept> getStatusReason() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setStatusReason(java.util.List<CodeableConcept> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addStatusReason(CodeableConcept arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Patient getPatient() {
		return new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getPatient()).getResource());
	}

	public void setPatient(Patient arg) {
		this.adaptee.setPatient(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper)arg).getAdaptee()));
	}

	public Organization getOwner() {
		return new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getOwner()).getResource());
	}

	public void setOwner(Organization arg) {
		this.adaptee.setOwner(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public String getDistinctIdentifier() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setDistinctIdentifier(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getManufacturer() {
	return this.adaptee.getManufacturerElement().getValue();
	}

	public void setManufacturer(String arg) {
	this.adaptee.setManufacturer(arg);
	}

	public Date getManufactureDate() {
	return this.adaptee.getManufactureDateElement().getValue();
	}

	public void setManufactureDate(Date arg) {
	this.adaptee.setManufactureDate(arg);
	}

	public Date getExpirationDate() {
	return this.adaptee.getExpirationDateElement().getValue();
	}

	public void setExpirationDate(Date arg) {
	this.adaptee.setExpirationDate(arg);
	}

	public String getLotNumber() {
	return this.adaptee.getLotNumberElement().getValue();
	}

	public void setLotNumber(String arg) {
	this.adaptee.setLotNumber(arg);
	}

	public String getSerialNumber() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setSerialNumber(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getModelNumber() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setModelNumber(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getPartNumber() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setPartNumber(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public List<DeviceVersion> getVersion() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setVersion(java.util.List<DeviceVersion> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void addVersion(DeviceVersion arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public List<ContactPoint> getContact() {
		List<org.reimagineehr.model.quick.api.backbone.ContactPoint> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.ContactPoint> items = this.adaptee.getContact();
		for(org.hl7.fhir.dstu3.model.ContactPoint item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper(item));
		}
		return returnList;
	}

	public void setContact(java.util.List<ContactPoint> arg) {
		List<org.hl7.fhir.dstu3.model.ContactPoint> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ContactPoint item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper)item).getAdaptee());
		}
		this.adaptee.setContact(targetList);
	}

	public void addContact(ContactPoint arg) {
		this.adaptee.addContact(((org.reimagineehr.model.quick.wrapper.backbone.ContactPointWrapper)arg).getAdaptee());
	}

	public Location getLocation() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setLocation(Location arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getUrl() {
	return this.adaptee.getUrlElement().getValue();
	}

	public void setUrl(String arg) {
	this.adaptee.setUrl(arg);
	}

	public List<Annotation> getNote() {
		List<org.reimagineehr.model.quick.api.backbone.Annotation> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Annotation> items = this.adaptee.getNote();
		for(org.hl7.fhir.dstu3.model.Annotation item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.AnnotationWrapper(item));
		}
		return returnList;
	}

	public void setNote(java.util.List<Annotation> arg) {
		List<org.hl7.fhir.dstu3.model.Annotation> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.Annotation item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.AnnotationWrapper)item).getAdaptee());
		}
		this.adaptee.setNote(targetList);
	}

	public void addNote(Annotation arg) {
		this.adaptee.addNote(((org.reimagineehr.model.quick.wrapper.backbone.AnnotationWrapper)arg).getAdaptee());
	}

	public List<CodeableConcept> getSafety() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept(this.adaptee.getSafety());
	}

	public void setSafety(java.util.List<CodeableConcept> arg) {
		this.adaptee.setSafety(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public void addSafety(CodeableConcept arg) {
		this.adaptee.addSafety(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public Device getParent() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setParent(Device arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}