package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import org.reimagineehr.model.quick.api.request.ServiceRequest;
import org.reimagineehr.model.quick.impl.choice.N4Choice;
import org.reimagineehr.model.quick.api.choice.GoalChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GoalChoiceImpl extends N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> implements GoalChoice {


	public GoalChoiceImpl(Object choice) {
		super(choice);
	}

	public N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> buildChoice(Object choice) {
		if(choice != null && (Condition.class.isInstance(choice) || Observation.class.isInstance(choice) || MedicationStatement.class.isInstance(choice) || ServiceRequest.class.isInstance(choice))) {
			N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> myChoice = new N4Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

	public Condition getCondition() {
		if(getChoice() instanceof Condition) {
			return (Condition) getChoice();
		} else {
			return null;
		}
	}

	public void setCondition(Condition conditionArg) {
		setChoice(conditionArg);
	}

	public Observation getObservation() {
		if(getChoice() instanceof Observation) {
			return (Observation) getChoice();
		} else {
			return null;
		}
	}

	public void setObservation(Observation observationArg) {
		setChoice(observationArg);
	}

	public MedicationStatement getMedicationStatement() {
		if(getChoice() instanceof MedicationStatement) {
			return (MedicationStatement) getChoice();
		} else {
			return null;
		}
	}

	public void setMedicationStatement(MedicationStatement medicationStatementArg) {
		setChoice(medicationStatementArg);
	}

	public ServiceRequest getServiceRequest() {
		if(getChoice() instanceof ServiceRequest) {
			return (ServiceRequest) getChoice();
		} else {
			return null;
		}
	}

	public void setServiceRequest(ServiceRequest serviceRequestArg) {
		setChoice(serviceRequestArg);
	}

}