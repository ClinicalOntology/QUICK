package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.DateDurationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DateDurationChoiceImpl extends N2Choice<Date,Duration> implements DateDurationChoice {

	private Date date;
	private Duration duration;

	public DateDurationChoiceImpl(Object choice) {
	super(choice);
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date arg) {
		this.date=arg;
	}

	public Duration getDuration() {
		return this.duration;
	}

	public void setDuration(Duration arg) {
		this.duration=arg;
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

}