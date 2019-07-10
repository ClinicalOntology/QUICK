package org.reimagineehr.model.quick.impl.choice;

import java.lang.Boolean;
import java.util.Date;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.BooleanDateTimeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class BooleanDateTimeChoiceImpl extends N2Choice<Boolean,Date> implements BooleanDateTimeChoice {

	private Boolean booleanValue;
	private Date dateTime;

	public BooleanDateTimeChoiceImpl(Object choice) {
	super(choice);
	}

	public Boolean getBoolean() {
		return this.booleanValue;
	}

	public void setBoolean(Boolean arg) {
		this.booleanValue=arg;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date arg) {
		this.dateTime=arg;
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

}