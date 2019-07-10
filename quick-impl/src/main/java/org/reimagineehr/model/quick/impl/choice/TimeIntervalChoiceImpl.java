package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.TimeIntervalChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class TimeIntervalChoiceImpl extends N3Choice<Duration,Range,Period> implements TimeIntervalChoice {

	private Duration duration;
	private Range range;
	private Period period;

	public TimeIntervalChoiceImpl(Object choice) {
	super(choice);
	}

	public Duration getDuration() {
		return this.duration;
	}

	public void setDuration(Duration arg) {
		this.duration=arg;
	}

	public Range getRange() {
		return this.range;
	}

	public void setRange(Range arg) {
		this.range=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public N3Choice<Duration,Range,Period> buildChoice(Object choice) {
		if(choice != null && (Duration.class.isInstance(choice) || Range.class.isInstance(choice) || Period.class.isInstance(choice))) {
			N3Choice<Duration,Range,Period> myChoice = new N3Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}