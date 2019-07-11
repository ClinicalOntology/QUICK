package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.impl.choice.N5Choice;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OnsetAbatementChoiceImpl extends N5Choice<Age,Range,Period,String,Date> implements OnsetAbatementChoice {


	public OnsetAbatementChoiceImpl(Object choice) {
		super(choice);
	}

	public N5Choice<Age,Range,Period,String,Date> buildChoice(Object choice) {
		if(choice != null && (Age.class.isInstance(choice) || Range.class.isInstance(choice) || Period.class.isInstance(choice) || String.class.isInstance(choice) || Date.class.isInstance(choice))) {
			N5Choice<Age,Range,Period,String,Date> myChoice = new N5Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

	public Age getAge() {
		if(getChoice() instanceof Age) {
			return (Age) getChoice();
		} else {
			return null;
		}
	}

	public void setAge(Age ageArg) {
		setChoice(ageArg);
	}

	public Range getRange() {
		if(getChoice() instanceof Range) {
			return (Range) getChoice();
		} else {
			return null;
		}
	}

	public void setRange(Range rangeArg) {
		setChoice(rangeArg);
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