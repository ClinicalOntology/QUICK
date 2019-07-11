package org.reimagineehr.model.quick.api.request;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.CommunicationPayload;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.request.Request;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CommunicationRequest extends Request {


		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 Boolean getDoNotPerform();

		 void setDoNotPerform(Boolean arg);

		 List<CodeableConcept> getMedium();

		 void setMedium(List<CodeableConcept> arg);

		public void addMedium(CodeableConcept arg);

		 List<CommunicationPayload> getPayload();

		 void setPayload(List<CommunicationPayload> arg);

		public void addPayload(CommunicationPayload arg);

		 Party getSender();

		 void setSender(Party arg);

		 Party getRecipient();

		 void setRecipient(Party arg);

}