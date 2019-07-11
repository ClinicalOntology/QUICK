package org.reimagineehr.model.quick.api.other;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.DateCodeableConceptChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.choice.GoalChoice;
import org.reimagineehr.model.quick.api.choice.DateDurationChoice;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Goal extends DomainResource {


		 String getLifecycleStatus();

		 void setLifecycleStatus(String arg);

		 CodeableConcept getDescription();

		 void setDescription(CodeableConcept arg);

		 DateCodeableConceptChoice getStart();

		 void setStart(DateCodeableConceptChoice arg);

		 List<GoalChoice> getAddresses();

		 void setAddresses(List<GoalChoice> arg);

		public void addAddresses(GoalChoice arg);

		 List<DateDurationChoice> getTarget();

		 void setTarget(List<DateDurationChoice> arg);

		public void addTarget(DateDurationChoice arg);

		 Party getExpressedBy();

		 void setExpressedBy(Party arg);

}