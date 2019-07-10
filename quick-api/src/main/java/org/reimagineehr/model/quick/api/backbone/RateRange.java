package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.backbone.MedicationDoseRate;

public interface RateRange extends MedicationDoseRate {


		 Range getValue();

		 void setValue(Range arg);

}