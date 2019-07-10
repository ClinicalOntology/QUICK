package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ConditionOrProcedureChoiceImpl extends N2Choice<Condition,Procedure> implements ConditionOrProcedureChoice {

	private Condition condition;
	private Procedure procedure;

	public ConditionOrProcedureChoiceImpl(Object choice) {
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

	public N2Choice<Condition,Procedure> buildChoice(Object choice) {
		if(choice != null && (Condition.class.isInstance(choice) || Procedure.class.isInstance(choice))) {
			N2Choice<Condition,Procedure> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}