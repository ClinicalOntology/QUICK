package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ContactPoint extends BackboneElement {


		 String getSystem();

		 void setSystem(String arg);

		 String getValue();

		 void setValue(String arg);

		 String getUse();

		 void setUse(String arg);

		 Integer getRank();

		 void setRank(Integer arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}