package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.backbone.MedicationDoseQuantity;

public interface DoseRange extends MedicationDoseQuantity {


		 Range getValue();

		 void setValue(Range arg);

}