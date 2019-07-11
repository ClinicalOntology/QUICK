package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.MedicationDispense;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.datatype.Quantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationDispenseImpl extends EventImpl implements MedicationDispense {

	private SimpleQuantity quantity;
	private SimpleQuantity daysSupply;
	private List<DosageInstruction> dosageInstruction;
	private Medication medication;
	private Quantity fillNumber;

	public SimpleQuantity getQuantity() {
		return this.quantity;
	}

	public void setQuantity(SimpleQuantity arg) {
		this.quantity=arg;
	}

	public SimpleQuantity getDaysSupply() {
		return this.daysSupply;
	}

	public void setDaysSupply(SimpleQuantity arg) {
		this.daysSupply=arg;
	}

	public List<DosageInstruction> getDosageInstruction() {
		return this.dosageInstruction;
	}

	public void setDosageInstruction(List<DosageInstruction> arg) {
		this.dosageInstruction=arg;
	}

	public void addDosageInstruction(DosageInstruction arg) {
		this.dosageInstruction.add(arg);
	}

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication arg) {
		this.medication=arg;
	}

	public Quantity getFillNumber() {
		return this.fillNumber;
	}

	public void setFillNumber(Quantity arg) {
		this.fillNumber=arg;
	}

}