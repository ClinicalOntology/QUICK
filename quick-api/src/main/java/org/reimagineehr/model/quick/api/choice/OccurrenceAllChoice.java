package org.reimagineehr.model.quick.api.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Timing;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Age;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface OccurrenceAllChoice extends ChoiceElement {


		 Date getDateTime();

		 void setDateTime(Date arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Timing getTiming();

		 void setTiming(Timing arg);

		 Date getInstant();

		 void setInstant(Date arg);

		 String getString();

		 void setString(String arg);

		 Age getAge();

		 void setAge(Age arg);

		 Range getRange();

		 void setRange(Range arg);

}