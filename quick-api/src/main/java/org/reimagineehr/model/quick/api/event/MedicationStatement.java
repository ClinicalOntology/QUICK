package org.reimagineehr.model.quick.api.event;

import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface MedicationStatement extends Event {


		 List<DosageInstruction> getDosage();

		 void setDosage(List<DosageInstruction> arg);

		public void addDosage(DosageInstruction arg);

		 Medication getMedication();

		 void setMedication(Medication arg);

		 Party getInformationSource();

		 void setInformationSource(Party arg);

}