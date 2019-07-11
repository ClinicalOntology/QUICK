package org.reimagineehr.model.quick.impl.choice;

import java.lang.Boolean;
import java.util.Date;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.BooleanDateTimeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class BooleanDateTimeChoiceImpl extends N2Choice<Boolean,Date> implements BooleanDateTimeChoice {


	public BooleanDateTimeChoiceImpl(Object choice) {
		super(choice);
	}

	public N2Choice<Boolean,Date> buildChoice(Object choice) {
		if(choice != null && (Boolean.class.isInstance(choice) || Date.class.isInstance(choice))) {
			N2Choice<Boolean,Date> myChoice = new N2Choice<>(choice);
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

	public Date getDateTime() {
		if(getChoice() instanceof Date) {
			return (Date) getChoice();
		} else {
			return null;
		}
	}

	public void setDateTime(Date dateTimeArg) {
		setChoice(dateTimeArg);
	}

}