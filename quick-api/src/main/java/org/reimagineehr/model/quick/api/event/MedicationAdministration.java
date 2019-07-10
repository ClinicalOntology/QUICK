package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.backbone.DosageTaken;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface MedicationAdministration extends Event {


		 Medication getMedication();

		 void setMedication(Medication arg);

		 DosageTaken getDosage();

		 void setDosage(DosageTaken arg);

}