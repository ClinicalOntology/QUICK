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
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class OccurrenceAllChoiceImpl extends N7Choice<Date,Period,Timing,Date,String,Age,Range> implements OccurrenceAllChoice {

	private Date dateTime;
	private Period period;
	private Timing timing;
	private Date instant;
	private String string;
	private Age age;
	private Range range;

	public OccurrenceAllChoiceImpl(Object choice) {
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

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public Age getAge() {
		return this.age;
	}

	public void setAge(Age arg) {
		this.age=arg;
	}

	public Range getRange() {
		return this.range;
	}

	public void setRange(Range arg) {
		this.range=arg;
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

}