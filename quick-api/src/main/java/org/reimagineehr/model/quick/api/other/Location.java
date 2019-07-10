package org.reimagineehr.model.quick.api.other;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Coding;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.GpsLocation;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Location extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 String getStatus();

		 void setStatus(String arg);

		 Coding getOperationalStatus();

		 void setOperationalStatus(Coding arg);

		 String getName();

		 void setName(String arg);

		 List<String> getAlias();

		 void setAlias(List<String> arg);

		public void addAlias(String arg);

		 List<String> getDescription();

		 void setDescription(List<String> arg);

		public void addDescription(String arg);

		 String getMode();

		 void setMode(String arg);

		 List<CodeableConcept> getType();

		 void setType(List<CodeableConcept> arg);

		public void addType(CodeableConcept arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 Address getAddress();

		 void setAddress(Address arg);

		 CodeableConcept getPhysicalType();

		 void setPhysicalType(CodeableConcept arg);

		 List<GpsLocation> getPosition();

		 void setPosition(List<GpsLocation> arg);

		public void addPosition(GpsLocation arg);

		 Organization getManagingOrganization();

		 void setManagingOrganization(Organization arg);

		 Location getPartOf();

		 void setPartOf(Location arg);

		 List<AvailableTime> getHoursOfOperation();

		 void setHoursOfOperation(List<AvailableTime> arg);

		public void addHoursOfOperation(AvailableTime arg);

		 String getAvailabilityExceptions();

		 void setAvailabilityExceptions(String arg);

}