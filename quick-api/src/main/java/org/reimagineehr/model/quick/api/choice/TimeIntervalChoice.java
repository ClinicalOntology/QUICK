package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface TimeIntervalChoice extends ChoiceElement {


		 Duration getDuration();

		 void setDuration(Duration arg);

		 Range getRange();

		 void setRange(Range arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}