package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.impl.choice.N4Choice;
import org.reimagineehr.model.quick.api.choice.OccurrenceChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OccurrenceChoiceImpl extends N4Choice<Date,Period,Timing,Date> implements OccurrenceChoice {


	public OccurrenceChoiceImpl(Object choice) {
		super(choice);
	}

	public N4Choice<Date,Period,Timing,Date> buildChoice(Object choice) {
		if(choice != null && (Date.class.isInstance(choice) || Period.class.isInstance(choice) || Timing.class.isInstance(choice) || Date.class.isInstance(choice))) {
			N4Choice<Date,Period,Timing,Date> myChoice = new N4Choice<>(choice);
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

}