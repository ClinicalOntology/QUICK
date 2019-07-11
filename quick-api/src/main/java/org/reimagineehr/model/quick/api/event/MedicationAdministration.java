package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.backbone.DosageTaken;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface MedicationAdministration extends Event {


		 Medication getMedication();

		 void setMedication(Medication arg);

		 DosageTaken getDosage();

		 void setDosage(DosageTaken arg);

}