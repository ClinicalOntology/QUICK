package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface GroupCharacteristic extends BackboneElement {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 ObservationValueChoice getValue();

		 void setValue(ObservationValueChoice arg);

		 Boolean getExclude();

		 void setExclude(Boolean arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}