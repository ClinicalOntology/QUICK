package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.TimeIntervalChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class TimeIntervalChoiceImpl extends N3Choice<Duration,Range,Period> implements TimeIntervalChoice {


	public TimeIntervalChoiceImpl(Object choice) {
		super(choice);
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

}