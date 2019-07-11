package org.reimagineehr.model.quick.api.choice;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DateDurationChoice extends ChoiceElement {


		 Date getDate();

		 void setDate(Date arg);

		 Duration getDuration();

		 void setDuration(Duration arg);

}