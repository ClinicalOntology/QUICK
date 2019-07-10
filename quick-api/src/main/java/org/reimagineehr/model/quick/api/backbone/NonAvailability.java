package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface NonAvailability extends BackboneElement {


		 String getDescription();

		 void setDescription(String arg);

		 Period getDuring();

		 void setDuring(Period arg);

}