package org.reimagineehr.model.quick.api.party;

import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Annotation;
import org.reimagineehr.model.quick.api.party.CareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CareTeam extends CareGiver {


		 String getStatus();

		 void setStatus(String arg);

		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 List<String> getName();

		 void setName(List<String> arg);

		public void addName(String arg);

		 CareRecipient getSubject();

		 void setSubject(CareRecipient arg);

		 Encounter getEncounter();

		 void setEncounter(Encounter arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 List<Participation> getParticipant();

		 void setParticipant(List<Participation> arg);

		public void addParticipant(Participation arg);

		 List<CodeableConcept> getReasonCode();

		 void setReasonCode(List<CodeableConcept> arg);

		public void addReasonCode(CodeableConcept arg);

		 List<Condition> getReasonReference();

		 void setReasonReference(List<Condition> arg);

		public void addReasonReference(Condition arg);

		 List<Organization> getManagingOrganization();

		 void setManagingOrganization(List<Organization> arg);

		public void addManagingOrganization(Organization arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 List<Annotation> getNote();

		 void setNote(List<Annotation> arg);

		public void addNote(Annotation arg);

}