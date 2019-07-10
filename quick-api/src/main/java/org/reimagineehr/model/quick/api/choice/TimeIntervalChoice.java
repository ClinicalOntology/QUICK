package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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