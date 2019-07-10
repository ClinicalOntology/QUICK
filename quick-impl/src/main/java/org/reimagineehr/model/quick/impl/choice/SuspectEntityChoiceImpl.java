package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.event.Immunization;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.event.MedicationAdministration;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import org.reimagineehr.model.quick.api.party.Device;
import org.reimagineehr.model.quick.api.other.Substance;
import org.reimagineehr.model.quick.impl.choice.N7Choice;
import org.reimagineehr.model.quick.api.choice.SuspectEntityChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class SuspectEntityChoiceImpl extends N7Choice<Immunization,Procedure,Medication,MedicationAdministration,MedicationStatement,Device,Substance> implements SuspectEntityChoice {

	private Immunization immunization;
	private Procedure procedure;
	private Medication medication;
	private MedicationAdministration medicationAdministration;
	private MedicationStatement medicationStatement;
	private Device device;
	private Substance substance;

	public SuspectEntityChoiceImpl(Object choice) {
	super(choice);
	}

	public Immunization getImmunization() {
		return this.immunization;
	}

	public void setImmunization(Immunization arg) {
		this.immunization=arg;
	}

	public Procedure getProcedure() {
		return this.procedure;
	}

	public void setProcedure(Procedure arg) {
		this.procedure=arg;
	}

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication arg) {
		this.medication=arg;
	}

	public MedicationAdministration getMedicationAdministration() {
		return this.medicationAdministration;
	}

	public void setMedicationAdministration(MedicationAdministration arg) {
		this.medicationAdministration=arg;
	}

	public MedicationStatement getMedicationStatement() {
		return this.medicationStatement;
	}

	public void setMedicationStatement(MedicationStatement arg) {
		this.medicationStatement=arg;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device arg) {
		this.device=arg;
	}

	public Substance getSubstance() {
		return this.substance;
	}

	public void setSubstance(Substance arg) {
		this.substance=arg;
	}

	public N7Choice<Immunization,Procedure,Medication,MedicationAdministration,MedicationStatement,Device,Substance> buildChoice(Object choice) {
		if(choice != null && (Immunization.class.isInstance(choice) || Procedure.class.isInstance(choice) || Medication.class.isInstance(choice) || MedicationAdministration.class.isInstance(choice) || MedicationStatement.class.isInstance(choice) || Device.class.isInstance(choice) || Substance.class.isInstance(choice))) {
			N7Choice<Immunization,Procedure,Medication,MedicationAdministration,MedicationStatement,Device,Substance> myChoice = new N7Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}