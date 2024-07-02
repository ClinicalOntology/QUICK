package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.Participation;
import java.util.List;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.CommunicationPayload;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Communication extends Event {


		 CodeableConcept getCategory();

		 void setCategory(CodeableConcept arg);

		 Participation getSender();

		 void setSender(Participation arg);

		 List<Party> getRecipient();

		 void setRecipient(List<Party> arg);

		public void addRecipient(Party arg);

		 Date getSent();

		 void setSent(Date arg);

		 Date getReceived();

		 void setReceived(Date arg);

		 List<CodeableConcept> getMedium();

		 void setMedium(List<CodeableConcept> arg);

		public void addMedium(CodeableConcept arg);

		 List<CommunicationPayload> getPayload();

		 void setPayload(List<CommunicationPayload> arg);

		public void addPayload(CommunicationPayload arg);

}