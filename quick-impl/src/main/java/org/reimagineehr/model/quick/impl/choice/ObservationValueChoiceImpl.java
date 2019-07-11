package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import java.time.LocalTime;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.impl.choice.N10Choice;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ObservationValueChoiceImpl extends N10Choice<Quantity,CodeableConcept,String,Boolean,Integer,Range,Ratio,LocalTime,Date,Period> implements ObservationValueChoice {


	public ObservationValueChoiceImpl(Object choice) {
		super(choice);
	}

	public N10Choice<Quantity,CodeableConcept,String,Boolean,Integer,Range,Ratio,LocalTime,Date,Period> buildChoice(Object choice) {
		if(choice != null && (Quantity.class.isInstance(choice) || CodeableConcept.class.isInstance(choice) || String.class.isInstance(choice) || Boolean.class.isInstance(choice) || Integer.class.isInstance(choice) || Range.class.isInstance(choice) || Ratio.class.isInstance(choice) || LocalTime.class.isInstance(choice) || Date.class.isInstance(choice) || Period.class.isInstance(choice))) {
			N10Choice<Quantity,CodeableConcept,String,Boolean,Integer,Range,Ratio,LocalTime,Date,Period> myChoice = new N10Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

	public Quantity getQuantity() {
		if(getChoice() instanceof Quantity) {
			return (Quantity) getChoice();
		} else {
			return null;
		}
	}

	public void setQuantity(Quantity quantityArg) {
		setChoice(quantityArg);
	}

	public CodeableConcept getCodeableConcept() {
		if(getChoice() instanceof CodeableConcept) {
			return (CodeableConcept) getChoice();
		} else {
			return null;
		}
	}

	public void setCodeableConcept(CodeableConcept codeableConceptArg) {
		setChoice(codeableConceptArg);
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

	public Integer getInteger() {
		if(getChoice() instanceof Integer) {
			return (Integer) getChoice();
		} else {
			return null;
		}
	}

	public void setInteger(Integer integerArg) {
		setChoice(integerArg);
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

	public Ratio getRatio() {
		if(getChoice() instanceof Ratio) {
			return (Ratio) getChoice();
		} else {
			return null;
		}
	}

	public void setRatio(Ratio ratioArg) {
		setChoice(ratioArg);
	}

	public LocalTime getTime() {
		if(getChoice() instanceof LocalTime) {
			return (LocalTime) getChoice();
		} else {
			return null;
		}
	}

	public void setTime(LocalTime timeArg) {
		setChoice(timeArg);
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

}