package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.time.LocalTime;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface AvailableTime extends BackboneElement {


		 List<String> getDaysOfWeek();

		 void setDaysOfWeek(List<String> arg);

		public void addDaysOfWeek(String arg);

		 Boolean getAllDay();

		 void setAllDay(Boolean arg);

		 LocalTime getAvailableStartTime();

		 void setAvailableStartTime(LocalTime arg);

		 LocalTime getAvailableEndTime();

		 void setAvailableEndTime(LocalTime arg);

}