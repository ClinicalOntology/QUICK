package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Timing;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.impl.choice.N7Choice;
import org.reimagineehr.model.quick.api.choice.OccurrenceAllChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:03 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OccurrenceAllChoiceImpl extends N7Choice<Date,Period,Timing,Date,String,Age,Range> implements OccurrenceAllChoice {


	public OccurrenceAllChoiceImpl(Object choice) {
		super(choice);
	}

	public N7Choice<Date,Period,Timing,Date,String,Age,Range> buildChoice(Object choice) {
		if(choice != null && (Date.class.isInstance(choice) || Period.class.isInstance(choice) || Timing.class.isInstance(choice) || Date.class.isInstance(choice) || String.class.isInstance(choice) || Age.class.isInstance(choice) || Range.class.isInstance(choice))) {
			N7Choice<Date,Period,Timing,Date,String,Age,Range> myChoice = new N7Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
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

	public Timing getTiming() {
		if(getChoice() instanceof Timing) {
			return (Timing) getChoice();
		} else {
			return null;
		}
	}

	public void setTiming(Timing timingArg) {
		setChoice(timingArg);
	}

	public Date getInstant() {
		if(getChoice() instanceof Date) {
			return (Date) getChoice();
		} else {
			return null;
		}
	}

	public void setInstant(Date instantArg) {
		setChoice(instantArg);
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

}