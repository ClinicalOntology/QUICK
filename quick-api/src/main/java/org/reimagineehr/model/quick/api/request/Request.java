package org.reimagineehr.model.quick.api.request;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Request extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 String getIntent();

		 void setIntent(String arg);

		 List<CodeableConcept> getReasonCode();

		 void setReasonCode(List<CodeableConcept> arg);

		public void addReasonCode(CodeableConcept arg);

		 Date getAuthoredOn();

		 void setAuthoredOn(Date arg);

		 Party getRequester();

		 void setRequester(Party arg);

		 CareRecipient getSubject();

		 void setSubject(CareRecipient arg);

		 String getStatus();

		 void setStatus(String arg);

		 CodeableConcept getStatusReason();

		 void setStatusReason(CodeableConcept arg);

}