package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureOrObservationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ConditionOrProcedureOrObservationChoiceImpl extends N3Choice<Condition,Procedure,Observation> implements ConditionOrProcedureOrObservationChoice {

	private Condition condition;
	private Procedure procedure;
	private Observation observation;

	public ConditionOrProcedureOrObservationChoiceImpl(Object choice) {
	super(choice);
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition arg) {
		this.condition=arg;
	}

	public Procedure getProcedure() {
		return this.procedure;
	}

	public void setProcedure(Procedure arg) {
		this.procedure=arg;
	}

	public Observation getObservation() {
		return this.observation;
	}

	public void setObservation(Observation arg) {
		this.observation=arg;
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

}