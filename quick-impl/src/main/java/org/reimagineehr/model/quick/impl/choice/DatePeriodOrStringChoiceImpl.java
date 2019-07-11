package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.DatePeriodOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DatePeriodOrStringChoiceImpl extends N3Choice<Date,Period,String> implements DatePeriodOrStringChoice {


	public DatePeriodOrStringChoiceImpl(Object choice) {
		super(choice);
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

	public Date getDate() {
		if(getChoice() instanceof Date) {
			return (Date) getChoice();
		} else {
			return null;
		}
	}

	public void setDate(Date dateArg) {
		setChoice(dateArg);
	}

	public Period getPeriod() {
		if(getChoice() instanceof Period) {
			return (Period) getChoice();
		} else {
			return null;
		}
	}

	public void setPeriod(Period periodArg) {
		setChoice(periodArg);
	}

	public String getString() {
		if(getChoice() instanceof String) {
			return (String) getChoice();
		} else {
			return null;
		}
	}

	public void setString(String stringArg) {
		setChoice(stringArg);
	}

}