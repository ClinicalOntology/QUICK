package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.DateDurationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DateDurationChoiceImpl extends N2Choice<Date,Duration> implements DateDurationChoice {


	public DateDurationChoiceImpl(Object choice) {
		super(choice);
	}

	public N2Choice<Date,Duration> buildChoice(Object choice) {
		if(choice != null && (Date.class.isInstance(choice) || Duration.class.isInstance(choice))) {
			N2Choice<Date,Duration> myChoice = new N2Choice<>(choice);
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

	public Duration getDuration() {
		if(getChoice() instanceof Duration) {
			return (Duration) getChoice();
		} else {
			return null;
		}
	}

	public void setDuration(Duration durationArg) {
		setChoice(durationArg);
	}

}