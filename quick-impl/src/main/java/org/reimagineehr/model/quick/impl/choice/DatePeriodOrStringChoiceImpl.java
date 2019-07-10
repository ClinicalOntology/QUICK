package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.DatePeriodOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DatePeriodOrStringChoiceImpl extends N3Choice<Date,Period,String> implements DatePeriodOrStringChoice {

	private Date date;
	private Period period;
	private String string;

	public DatePeriodOrStringChoiceImpl(Object choice) {
	super(choice);
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date arg) {
		this.date=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public N3Choice<Date,Period,String> buildChoice(Object choice) {
		if(choice != null && (Date.class.isInstance(choice) || Period.class.isInstance(choice) || String.class.isInstance(choice))) {
			N3Choice<Date,Period,String> myChoice = new N3Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}