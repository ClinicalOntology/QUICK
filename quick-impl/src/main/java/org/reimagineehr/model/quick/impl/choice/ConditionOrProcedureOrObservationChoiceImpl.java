package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureOrObservationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ConditionOrProcedureOrObservationChoiceImpl extends N3Choice<Condition,Procedure,Observation> implements ConditionOrProcedureOrObservationChoice {


	public ConditionOrProcedureOrObservationChoiceImpl(Object choice) {
		super(choice);
	}

	public N3Choice<Condition,Procedure,Observation> buildChoice(Object choice) {
		if(choice != null && (Condition.class.isInstance(choice) || Procedure.class.isInstance(choice) || Observation.class.isInstance(choice))) {
			N3Choice<Condition,Procedure,Observation> myChoice = new N3Choice<>(choice);
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

	public Procedure getProcedure() {
		if(getChoice() instanceof Procedure) {
			return (Procedure) getChoice();
		} else {
			return null;
		}
	}

	public void setProcedure(Procedure procedureArg) {
		setChoice(procedureArg);
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

}