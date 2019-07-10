package org.reimagineehr.model.quick.impl.choice;

import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import java.util.Date;
import java.lang.String;
import org.reimagineehr.model.quick.impl.choice.N5Choice;
import org.reimagineehr.model.quick.api.choice.DeceasedChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DeceasedChoiceImpl extends N5Choice<Boolean,Age,Range,Date,String> implements DeceasedChoice {

	private Boolean booleanValue;
	private Age age;
	private Range range;
	private Date date;
	private String string;

	public DeceasedChoiceImpl(Object choice) {
	super(choice);
	}

	public Boolean getBoolean() {
		return this.booleanValue;
	}

	public void setBoolean(Boolean arg) {
		this.booleanValue=arg;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date arg) {
		this.date=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public N5Choice<Boolean,Age,Range,Date,String> buildChoice(Object choice) {
		if(choice != null && (Boolean.class.isInstance(choice) || Age.class.isInstance(choice) || Range.class.isInstance(choice) || Date.class.isInstance(choice) || String.class.isInstance(choice))) {
			N5Choice<Boolean,Age,Range,Date,String> myChoice = new N5Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}