package org.reimagineehr.model.quick.api.event;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.finding.Finding;
import org.reimagineehr.model.quick.api.choice.OccurrenceAllChoice;
import org.reimagineehr.model.quick.api.request.Request;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Event extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 String getStatus();

		 void setStatus(String arg);

		 CodeableConcept getStatusReason();

		 void setStatusReason(CodeableConcept arg);

		 CareRecipient getSubject();

		 void setSubject(CareRecipient arg);

		 List<Participation> getPerformer();

		 void setPerformer(List<Participation> arg);

		public void addPerformer(Participation arg);

		 List<CodeableConcept> getReasonCode();

		 void setReasonCode(List<CodeableConcept> arg);

		public void addReasonCode(CodeableConcept arg);

		 List<Finding> getReasonReference();

		 void setReasonReference(List<Finding> arg);

		public void addReasonReference(Finding arg);

		 OccurrenceAllChoice getOccurrence();

		 void setOccurrence(OccurrenceAllChoice arg);

		 List<Request> getBasedOn();

		 void setBasedOn(List<Request> arg);

		public void addBasedOn(Request arg);

		 Party getRecorder();

		 void setRecorder(Party arg);

		 Date getRecorded();

		 void setRecorded(Date arg);

}