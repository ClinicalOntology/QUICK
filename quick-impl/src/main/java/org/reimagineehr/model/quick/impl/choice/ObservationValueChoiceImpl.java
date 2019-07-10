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
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ObservationValueChoiceImpl extends N10Choice<Quantity,CodeableConcept,String,Boolean,Integer,Range,Ratio,LocalTime,Date,Period> implements ObservationValueChoice {

	private Quantity quantity;
	private CodeableConcept codeableConcept;
	private String string;
	private Boolean booleanValue;
	private Integer integer;
	private Range range;
	private Ratio ratio;
	private LocalTime time;
	private Date dateTime;
	private Period period;

	public ObservationValueChoiceImpl(Object choice) {
	super(choice);
	}

	public Quantity getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Quantity arg) {
		this.quantity=arg;
	}

	public CodeableConcept getCodeableConcept() {
		return this.codeableConcept;
	}

	public void setCodeableConcept(CodeableConcept arg) {
		this.codeableConcept=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public Boolean getBoolean() {
		return this.booleanValue;
	}

	public void setBoolean(Boolean arg) {
		this.booleanValue=arg;
	}

	public Integer getInteger() {
		return this.integer;
	}

	public void setInteger(Integer arg) {
		this.integer=arg;
	}

	public Range getRange() {
		return this.range;
	}

	public void setRange(Range arg) {
		this.range=arg;
	}

	public Ratio getRatio() {
		return this.ratio;
	}

	public void setRatio(Ratio arg) {
		this.ratio=arg;
	}

	public LocalTime getTime() {
		return this.time;
	}

	public void setTime(LocalTime arg) {
		this.time=arg;
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

}