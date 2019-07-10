package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DoseAndRate extends BackboneElement {


		 CodeableConcept getType();

		 void setType(CodeableConcept arg);

		 QuantityRangeRatioOrStringChoice getDose();

		 void setDose(QuantityRangeRatioOrStringChoice arg);

		 QuantityRangeRatioOrStringChoice getRate();

		 void setRate(QuantityRangeRatioOrStringChoice arg);

}