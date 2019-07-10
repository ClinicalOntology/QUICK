package org.reimagineehr.model.quick.impl.choice;

import java.lang.Boolean;
import java.lang.Integer;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.BooleanOrIntegerChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class BooleanOrIntegerChoiceImpl extends N2Choice<Boolean,Integer> implements BooleanOrIntegerChoice {

	private Boolean booleanValue;
	private Integer integer;

	public BooleanOrIntegerChoiceImpl(Object choice) {
	super(choice);
	}

	public Boolean getBoolean() {
		return this.booleanValue;
	}

	public void setBoolean(Boolean arg) {
		this.booleanValue=arg;
	}

	public Integer getInteger() {
		return this.integer;
	}

	public void setInteger(Integer arg) {
		this.integer=arg;
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

}