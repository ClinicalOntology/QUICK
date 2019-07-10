package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.backbone.MedicationDoseQuantity;

public interface DoseQuantity extends MedicationDoseQuantity {


		 Quantity getValue();

		 void setValue(Quantity arg);

}