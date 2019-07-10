package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.backbone.MedicationDosePointRate;

public interface RateRatio extends MedicationDosePointRate {


		 Ratio getValue();

		 void setValue(Ratio arg);

}