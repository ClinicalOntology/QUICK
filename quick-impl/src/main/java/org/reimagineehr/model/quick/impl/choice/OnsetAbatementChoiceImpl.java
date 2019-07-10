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
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class OnsetAbatementChoiceImpl extends N5Choice<Age,Range,Period,String,Date> implements OnsetAbatementChoice {

	private Age age;
	private Range range;
	private Period period;
	private String string;
	private Date dateTime;

	public OnsetAbatementChoiceImpl(Object choice) {
	super(choice);
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

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date arg) {
		this.dateTime=arg;
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

}