package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import org.reimagineehr.model.quick.api.request.ServiceRequest;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface GoalChoice extends ChoiceElement {


		 Condition getCondition();

		 void setCondition(Condition arg);

		 Observation getObservation();

		 void setObservation(Observation arg);

		 MedicationStatement getMedicationStatement();

		 void setMedicationStatement(MedicationStatement arg);

		 ServiceRequest getServiceRequest();

		 void setServiceRequest(ServiceRequest arg);

}