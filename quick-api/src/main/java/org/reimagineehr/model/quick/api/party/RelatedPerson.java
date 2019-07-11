package org.reimagineehr.model.quick.api.party;

import java.lang.Boolean;
import org.reimagineehr.model.quick.api.party.Patient;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface RelatedPerson extends IndividualCareRecipient {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 Patient getPatient();

		 void setPatient(Patient arg);

		 List<CodeableConcept> getRelationship();

		 void setRelationship(List<CodeableConcept> arg);

		public void addRelationship(CodeableConcept arg);

		 List<HumanName> getName();

		 void setName(List<HumanName> arg);

		public void addName(HumanName arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 String getGender();

		 void setGender(String arg);

		 Date getBirthDate();

		 void setBirthDate(Date arg);

		 List<Address> getAddress();

		 void setAddress(List<Address> arg);

		public void addAddress(Address arg);

		 List<Attachment> getPhoto();

		 void setPhoto(List<Attachment> arg);

		public void addPhoto(Attachment arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 List<LanguageCompetency> getCommunication();

		 void setCommunication(List<LanguageCompetency> arg);

		public void addCommunication(LanguageCompetency arg);

}