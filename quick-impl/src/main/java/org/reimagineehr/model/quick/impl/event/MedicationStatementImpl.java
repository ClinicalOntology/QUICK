package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.party.Party;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationStatementImpl extends EventImpl implements MedicationStatement {

	private List<DosageInstruction> dosage;
	private Medication medication;
	private Party informationSource;

	public List<DosageInstruction> getDosage() {
		return this.dosage;
	}

	public void setDosage(List<DosageInstruction> arg) {
		this.dosage=arg;
	}

	public void addDosage(DosageInstruction arg) {
		this.dosage.add(arg);
	}

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication arg) {
		this.medication=arg;
	}

	public Party getInformationSource() {
		return this.informationSource;
	}

	public void setInformationSource(Party arg) {
		this.informationSource=arg;
	}

}