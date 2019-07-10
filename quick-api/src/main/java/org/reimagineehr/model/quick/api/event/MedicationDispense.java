package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface MedicationDispense extends Event {


		 SimpleQuantity getQuantity();

		 void setQuantity(SimpleQuantity arg);

		 SimpleQuantity getDaysSupply();

		 void setDaysSupply(SimpleQuantity arg);

		 List<DosageInstruction> getDosageInstruction();

		 void setDosageInstruction(List<DosageInstruction> arg);

		public void addDosageInstruction(DosageInstruction arg);

		 Medication getMedication();

		 void setMedication(Medication arg);

		 Quantity getFillNumber();

		 void setFillNumber(Quantity arg);

}