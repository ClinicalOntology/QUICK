package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface QuantityRangeRatioOrStringChoice extends ChoiceElement {


		 SimpleQuantity getSimpleQuantity();

		 void setSimpleQuantity(SimpleQuantity arg);

		 Range getRange();

		 void setRange(Range arg);

		 Ratio getRatio();

		 void setRatio(Ratio arg);

		 String getString();

		 void setString(String arg);

}