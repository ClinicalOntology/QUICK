package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface NonAvailability extends BackboneElement {


		 String getDescription();

		 void setDescription(String arg);

		 Period getDuring();

		 void setDuring(Period arg);

}