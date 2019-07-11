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
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeceasedChoiceImpl extends N5Choice<Boolean,Age,Range,Date,String> implements DeceasedChoice {


	public DeceasedChoiceImpl(Object choice) {
		super(choice);
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

	public Boolean getBoolean() {
		if(getChoice() instanceof Boolean) {
			return (Boolean) getChoice();
		} else {
			return null;
		}
	}

	public void setBoolean(Boolean booleanArg) {
		setChoice(booleanArg);
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

}