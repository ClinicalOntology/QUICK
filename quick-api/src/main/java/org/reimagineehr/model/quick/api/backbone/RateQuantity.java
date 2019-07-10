package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.backbone.MedicationDosePointRate;

public interface RateQuantity extends MedicationDosePointRate {


		 Quantity getValue();

		 void setValue(Quantity arg);

}