package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.impl.choice.N4Choice;
import org.reimagineehr.model.quick.api.choice.OccurrenceChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class OccurrenceChoiceImpl extends N4Choice<Date,Period,Timing,Date> implements OccurrenceChoice {

	private Date dateTime;
	private Period period;
	private Timing timing;
	private Date instant;

	public OccurrenceChoiceImpl(Object choice) {
	super(choice);
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date arg) {
		this.dateTime=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Timing getTiming() {
		return this.timing;
	}

	public void setTiming(Timing arg) {
		this.timing=arg;
	}

	public Date getInstant() {
		return this.instant;
	}

	public void setInstant(Date arg) {
		this.instant=arg;
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

}