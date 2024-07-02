package org.reimagineehr.model.quick.api.choice;

import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import java.util.Date;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DeceasedChoice extends ChoiceElement {


		 Boolean getBoolean();

		 void setBoolean(Boolean arg);

		 Age getAge();

		 void setAge(Age arg);

		 Range getRange();

		 void setRange(Range arg);

		 Date getDate();

		 void setDate(Date arg);

		 String getString();

		 void setString(String arg);

}