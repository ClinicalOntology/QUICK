package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface OnsetAbatementChoice extends ChoiceElement {


		 Age getAge();

		 void setAge(Age arg);

		 Range getRange();

		 void setRange(Range arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 String getString();

		 void setString(String arg);

		 Date getDateTime();

		 void setDateTime(Date arg);

}