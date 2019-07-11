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
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SuspectEntityChoiceImpl extends N7Choice<Immunization,Procedure,Medication,MedicationAdministration,MedicationStatement,Device,Substance> implements SuspectEntityChoice {


	public SuspectEntityChoiceImpl(Object choice) {
		super(choice);
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

	public Immunization getImmunization() {
		if(getChoice() instanceof Immunization) {
			return (Immunization) getChoice();
		} else {
			return null;
		}
	}

	public void setImmunization(Immunization immunizationArg) {
		setChoice(immunizationArg);
	}

	public Procedure getProcedure() {
		if(getChoice() instanceof Procedure) {
			return (Procedure) getChoice();
		} else {
			return null;
		}
	}

	public void setProcedure(Procedure procedureArg) {
		setChoice(procedureArg);
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

	public MedicationAdministration getMedicationAdministration() {
		if(getChoice() instanceof MedicationAdministration) {
			return (MedicationAdministration) getChoice();
		} else {
			return null;
		}
	}

	public void setMedicationAdministration(MedicationAdministration medicationAdministrationArg) {
		setChoice(medicationAdministrationArg);
	}

	public MedicationStatement getMedicationStatement() {
		if(getChoice() instanceof MedicationStatement) {
			return (MedicationStatement) getChoice();
		} else {
			return null;
		}
	}

	public void setMedicationStatement(MedicationStatement medicationStatementArg) {
		setChoice(medicationStatementArg);
	}

	public Device getDevice() {
		if(getChoice() instanceof Device) {
			return (Device) getChoice();
		} else {
			return null;
		}
	}

	public void setDevice(Device deviceArg) {
		setChoice(deviceArg);
	}

	public Substance getSubstance() {
		if(getChoice() instanceof Substance) {
			return (Substance) getChoice();
		} else {
			return null;
		}
	}

	public void setSubstance(Substance substanceArg) {
		setChoice(substanceArg);
	}

}