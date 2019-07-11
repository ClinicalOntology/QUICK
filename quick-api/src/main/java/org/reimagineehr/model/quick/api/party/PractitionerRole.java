package org.reimagineehr.model.quick.api.party;

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
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface PractitionerRole extends IndividualCareGiver {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Practitioner getPractitioner();

		 void setPractitioner(Practitioner arg);

		 Organization getOrganization();

		 void setOrganization(Organization arg);

		 List<CodeableConcept> getCode();

		 void setCode(List<CodeableConcept> arg);

		public void addCode(CodeableConcept arg);

		 List<CodeableConcept> getSpecialty();

		 void setSpecialty(List<CodeableConcept> arg);

		public void addSpecialty(CodeableConcept arg);

		 List<Location> getLocation();

		 void setLocation(List<Location> arg);

		public void addLocation(Location arg);

		 List<HealthcareService> getHealthcareService();

		 void setHealthcareService(List<HealthcareService> arg);

		public void addHealthcareService(HealthcareService arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 List<AvailableTime> getAvailableTime();

		 void setAvailableTime(List<AvailableTime> arg);

		public void addAvailableTime(AvailableTime arg);

		 List<NonAvailability> getNotAvailable();

		 void setNotAvailable(List<NonAvailability> arg);

		public void addNotAvailable(NonAvailability arg);

		 String getAvailabilityExceptions();

		 void setAvailabilityExceptions(String arg);

}