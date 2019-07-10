package org.reimagineehr.model.quick.api.party;

import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.choice.BooleanDateTimeChoice;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.BooleanOrIntegerChoice;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.backbone.IndividualContact;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;
import org.reimagineehr.model.quick.api.party.CareGiver;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.RecordLink;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Patient extends IndividualCareRecipient {


		 Boolean getActive();

		 void setActive(Boolean arg);

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

		 BooleanDateTimeChoice getDeceased();

		 void setDeceased(BooleanDateTimeChoice arg);

		 List<Address> getAddress();

		 void setAddress(List<Address> arg);

		public void addAddress(Address arg);

		 CodeableConcept getMaritalStatus();

		 void setMaritalStatus(CodeableConcept arg);

		 BooleanOrIntegerChoice getMultipleBirth();

		 void setMultipleBirth(BooleanOrIntegerChoice arg);

		 List<Attachment> getPhoto();

		 void setPhoto(List<Attachment> arg);

		public void addPhoto(Attachment arg);

		 List<IndividualContact> getContact();

		 void setContact(List<IndividualContact> arg);

		public void addContact(IndividualContact arg);

		 List<LanguageCompetency> getCommunication();

		 void setCommunication(List<LanguageCompetency> arg);

		public void addCommunication(LanguageCompetency arg);

		 List<CareGiver> getGeneralPractitioner();

		 void setGeneralPractitioner(List<CareGiver> arg);

		public void addGeneralPractitioner(CareGiver arg);

		 Organization getManagingOrganization();

		 void setManagingOrganization(Organization arg);

		 List<RecordLink> getLink();

		 void setLink(List<RecordLink> arg);

		public void addLink(RecordLink arg);

}