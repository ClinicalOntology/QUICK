package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.DateCodeableConceptChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DateCodeableConceptChoiceImpl extends N2Choice<Date,CodeableConcept> implements DateCodeableConceptChoice {

	private Date date;
	private CodeableConcept codeableConcept;

	public DateCodeableConceptChoiceImpl(Object choice) {
	super(choice);
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date arg) {
		this.date=arg;
	}

	public CodeableConcept getCodeableConcept() {
		return this.codeableConcept;
	}

	public void setCodeableConcept(CodeableConcept arg) {
		this.codeableConcept=arg;
	}

	public N2Choice<Date,CodeableConcept> buildChoice(Object choice) {
		if(choice != null && (Date.class.isInstance(choice) || CodeableConcept.class.isInstance(choice))) {
			N2Choice<Date,CodeableConcept> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}