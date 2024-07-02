package org.reimagineehr.model.quick.api.datatype;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Range extends Datatype {


		 SimpleQuantity getLow();

		 void setLow(SimpleQuantity arg);

		 SimpleQuantity getHigh();

		 void setHigh(SimpleQuantity arg);

}