package org.reimagineehr.model.quick.api.event;

import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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