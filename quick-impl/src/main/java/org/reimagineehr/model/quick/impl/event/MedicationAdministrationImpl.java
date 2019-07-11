package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.MedicationAdministration;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.backbone.DosageTaken;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationAdministrationImpl extends EventImpl implements MedicationAdministration {

	private Medication medication;
	private DosageTaken dosage;

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication arg) {
		this.medication=arg;
	}

	public DosageTaken getDosage() {
		return this.dosage;
	}

	public void setDosage(DosageTaken arg) {
		this.dosage=arg;
	}

}