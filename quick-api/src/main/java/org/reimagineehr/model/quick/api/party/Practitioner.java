package org.reimagineehr.model.quick.api.party;

import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.ProfessionalQualification;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Practitioner extends IndividualCareGiver {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 List<HumanName> getName();

		 void setName(List<HumanName> arg);

		public void addName(HumanName arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 List<Address> getAddress();

		 void setAddress(List<Address> arg);

		public void addAddress(Address arg);

		 String getGender();

		 void setGender(String arg);

		 Date getBirthDate();

		 void setBirthDate(Date arg);

		 List<Attachment> getPhoto();

		 void setPhoto(List<Attachment> arg);

		public void addPhoto(Attachment arg);

		 List<ProfessionalQualification> getQualification();

		 void setQualification(List<ProfessionalQualification> arg);

		public void addQualification(ProfessionalQualification arg);

		 List<CodeableConcept> getCommunication();

		 void setCommunication(List<CodeableConcept> arg);

		public void addCommunication(CodeableConcept arg);

}