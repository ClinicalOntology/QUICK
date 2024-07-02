package org.reimagineehr.model.quick.impl.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.DateCodeableConceptChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DateCodeableConceptChoiceImpl extends N2Choice<Date,CodeableConcept> implements DateCodeableConceptChoice {


	public DateCodeableConceptChoiceImpl(Object choice) {
		super(choice);
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

}