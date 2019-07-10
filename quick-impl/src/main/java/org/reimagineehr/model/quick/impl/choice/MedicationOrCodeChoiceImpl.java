package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.MedicationOrCodeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class MedicationOrCodeChoiceImpl extends N2Choice<Medication,CodeableConcept> implements MedicationOrCodeChoice {

	private Medication medication;
	private CodeableConcept code;

	public MedicationOrCodeChoiceImpl(Object choice) {
	super(choice);
	}

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication arg) {
		this.medication=arg;
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
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

}