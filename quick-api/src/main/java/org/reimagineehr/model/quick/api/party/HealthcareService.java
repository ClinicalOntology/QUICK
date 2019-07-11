package org.reimagineehr.model.quick.api.party;

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
import org.reimagineehr.model.quick.api.party.CareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface HealthcareService extends CareGiver {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 Organization getProvidedBy();

		 void setProvidedBy(Organization arg);

		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 List<CodeableConcept> getType();

		 void setType(List<CodeableConcept> arg);

		public void addType(CodeableConcept arg);

		 List<CodeableConcept> getSpecialty();

		 void setSpecialty(List<CodeableConcept> arg);

		public void addSpecialty(CodeableConcept arg);

		 List<Location> getLocation();

		 void setLocation(List<Location> arg);

		public void addLocation(Location arg);

		 String getName();

		 void setName(String arg);

		 String getComment();

		 void setComment(String arg);

		 String getExtraDetails();

		 void setExtraDetails(String arg);

		 Attachment getPhoto();

		 void setPhoto(Attachment arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 List<Location> getCoverageArea();

		 void setCoverageArea(List<Location> arg);

		public void addCoverageArea(Location arg);

		 List<CodeableConcept> getServiceProvisionCode();

		 void setServiceProvisionCode(List<CodeableConcept> arg);

		public void addServiceProvisionCode(CodeableConcept arg);

		 List<Eligibility> getEligibility();

		 void setEligibility(List<Eligibility> arg);

		public void addEligibility(Eligibility arg);

		 List<CodeableConcept> getProgram();

		 void setProgram(List<CodeableConcept> arg);

		public void addProgram(CodeableConcept arg);

		 List<CodeableConcept> getCharacteristic();

		 void setCharacteristic(List<CodeableConcept> arg);

		public void addCharacteristic(CodeableConcept arg);

		 List<CodeableConcept> getCommunication();

		 void setCommunication(List<CodeableConcept> arg);

		public void addCommunication(CodeableConcept arg);

		 List<CodeableConcept> getReferralMethod();

		 void setReferralMethod(List<CodeableConcept> arg);

		public void addReferralMethod(CodeableConcept arg);

		 Boolean getAppointmentRequired();

		 void setAppointmentRequired(Boolean arg);

		 List<AvailableTime> getAvailableTime();

		 void setAvailableTime(List<AvailableTime> arg);

		public void addAvailableTime(AvailableTime arg);

		 List<NonAvailability> getNotAvailable();

		 void setNotAvailable(List<NonAvailability> arg);

		public void addNotAvailable(NonAvailability arg);

		 String getAvailabilityException();

		 void setAvailabilityException(String arg);

}