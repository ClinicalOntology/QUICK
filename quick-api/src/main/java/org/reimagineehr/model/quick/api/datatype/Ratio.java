package org.reimagineehr.model.quick.api.datatype;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Ratio extends Datatype {


		 Quantity getNumerator();

		 void setNumerator(Quantity arg);

		 Quantity getDenominator();

		 void setDenominator(Quantity arg);

}