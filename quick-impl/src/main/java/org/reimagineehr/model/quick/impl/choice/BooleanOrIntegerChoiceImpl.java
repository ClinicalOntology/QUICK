package org.reimagineehr.model.quick.impl.choice;

import java.lang.Boolean;
import java.lang.Integer;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.BooleanOrIntegerChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class BooleanOrIntegerChoiceImpl extends N2Choice<Boolean,Integer> implements BooleanOrIntegerChoice {


	public BooleanOrIntegerChoiceImpl(Object choice) {
		super(choice);
	}

	public N2Choice<Boolean,Integer> buildChoice(Object choice) {
		if(choice != null && (Boolean.class.isInstance(choice) || Integer.class.isInstance(choice))) {
			N2Choice<Boolean,Integer> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

	public Boolean getBoolean() {
		if(getChoice() instanceof Boolean) {
			return (Boolean) getChoice();
		} else {
			return null;
		}
	}

	public void setBoolean(Boolean booleanArg) {
		setChoice(booleanArg);
	}

	public Integer getInteger() {
		if(getChoice() instanceof Integer) {
			return (Integer) getChoice();
		} else {
			return null;
		}
	}

	public void setInteger(Integer integerArg) {
		setChoice(integerArg);
	}

}