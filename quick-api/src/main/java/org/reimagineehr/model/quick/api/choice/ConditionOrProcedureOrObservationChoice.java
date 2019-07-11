package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ConditionOrProcedureOrObservationChoice extends ChoiceElement {


		 Condition getCondition();

		 void setCondition(Condition arg);

		 Procedure getProcedure();

		 void setProcedure(Procedure arg);

		 Observation getObservation();

		 void setObservation(Observation arg);

}