package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.MedicationOrCodeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationOrCodeChoiceImpl extends N2Choice<Medication,CodeableConcept> implements MedicationOrCodeChoice {


	public MedicationOrCodeChoiceImpl(Object choice) {
		super(choice);
	}

	public N2Choice<Medication,CodeableConcept> buildChoice(Object choice) {
		if(choice != null && (Medication.class.isInstance(choice) || CodeableConcept.class.isInstance(choice))) {
			N2Choice<Medication,CodeableConcept> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

	public Medication getMedication() {
		if(getChoice() instanceof Medication) {
			return (Medication) getChoice();
		} else {
			return null;
		}
	}

	public void setMedication(Medication medicationArg) {
		setChoice(medicationArg);
	}

	public CodeableConcept getCode() {
		if(getChoice() instanceof CodeableConcept) {
			return (CodeableConcept) getChoice();
		} else {
			return null;
		}
	}

	public void setCode(CodeableConcept codeArg) {
		setChoice(codeArg);
	}

}