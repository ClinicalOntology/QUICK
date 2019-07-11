package org.reimagineehr.model.quick.api.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface OccurrenceChoice extends ChoiceElement {


		 Date getDateTime();

		 void setDateTime(Date arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Timing getTiming();

		 void setTiming(Timing arg);

		 Date getInstant();

		 void setInstant(Date arg);

}