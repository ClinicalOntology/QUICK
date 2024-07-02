package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DosageTaken extends BackboneElement {


		 String getText();

		 void setText(String arg);

		 CodeableConcept getSite();

		 void setSite(CodeableConcept arg);

		 CodeableConcept getRoute();

		 void setRoute(CodeableConcept arg);

		 CodeableConcept getMethod();

		 void setMethod(CodeableConcept arg);

		 SimpleQuantity getDose();

		 void setDose(SimpleQuantity arg);

		 QuantityRangeRatioOrStringChoice getRate();

		 void setRate(QuantityRangeRatioOrStringChoice arg);

}