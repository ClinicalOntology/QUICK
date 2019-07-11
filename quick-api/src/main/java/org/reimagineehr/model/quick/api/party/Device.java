package org.reimagineehr.model.quick.api.party;

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
import org.reimagineehr.model.quick.api.party.Device;
import org.reimagineehr.model.quick.api.party.Party;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Device extends Party {


		 List<DeviceUdiCarrier> getUdiCarrier();

		 void setUdiCarrier(List<DeviceUdiCarrier> arg);

		public void addUdiCarrier(DeviceUdiCarrier arg);

		 CodeableConcept getType();

		 void setType(CodeableConcept arg);

		 List<DeviceName> getDeviceName();

		 void setDeviceName(List<DeviceName> arg);

		public void addDeviceName(DeviceName arg);

		 String getStatus();

		 void setStatus(String arg);

		 List<CodeableConcept> getStatusReason();

		 void setStatusReason(List<CodeableConcept> arg);

		public void addStatusReason(CodeableConcept arg);

		 Patient getPatient();

		 void setPatient(Patient arg);

		 Organization getOwner();

		 void setOwner(Organization arg);

		 String getDistinctIdentifier();

		 void setDistinctIdentifier(String arg);

		 String getManufacturer();

		 void setManufacturer(String arg);

		 Date getManufactureDate();

		 void setManufactureDate(Date arg);

		 Date getExpirationDate();

		 void setExpirationDate(Date arg);

		 String getLotNumber();

		 void setLotNumber(String arg);

		 String getSerialNumber();

		 void setSerialNumber(String arg);

		 String getModelNumber();

		 void setModelNumber(String arg);

		 String getPartNumber();

		 void setPartNumber(String arg);

		 List<DeviceVersion> getVersion();

		 void setVersion(List<DeviceVersion> arg);

		public void addVersion(DeviceVersion arg);

		 List<ContactPoint> getContact();

		 void setContact(List<ContactPoint> arg);

		public void addContact(ContactPoint arg);

		 Location getLocation();

		 void setLocation(Location arg);

		 String getUrl();

		 void setUrl(String arg);

		 List<Annotation> getNote();

		 void setNote(List<Annotation> arg);

		public void addNote(Annotation arg);

		 List<CodeableConcept> getSafety();

		 void setSafety(List<CodeableConcept> arg);

		public void addSafety(CodeableConcept arg);

		 Device getParent();

		 void setParent(Device arg);

}