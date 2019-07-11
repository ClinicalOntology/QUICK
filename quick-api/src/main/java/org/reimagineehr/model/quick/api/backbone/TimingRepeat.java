package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.TimeIntervalChoice;
import java.lang.Integer;
import java.math.BigDecimal;
import java.lang.String;
import java.util.List;
import java.time.LocalTime;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface TimingRepeat extends BackboneElement {


		 TimeIntervalChoice getBounds();

		 void setBounds(TimeIntervalChoice arg);

		 Integer getCount();

		 void setCount(Integer arg);

		 Integer getCountMax();

		 void setCountMax(Integer arg);

		 BigDecimal getDuration();

		 void setDuration(BigDecimal arg);

		 BigDecimal getDurationMax();

		 void setDurationMax(BigDecimal arg);

		 String getDurationUnit();

		 void setDurationUnit(String arg);

		 Integer getFrequency();

		 void setFrequency(Integer arg);

		 Integer getFrequencyMax();

		 void setFrequencyMax(Integer arg);

		 BigDecimal getPeriod();

		 void setPeriod(BigDecimal arg);

		 BigDecimal getPeriodMax();

		 void setPeriodMax(BigDecimal arg);

		 String getPeriodUnit();

		 void setPeriodUnit(String arg);

		 List<String> getDayOfWeek();

		 void setDayOfWeek(List<String> arg);

		public void addDayOfWeek(String arg);

		 List<LocalTime> getTimeOfDay();

		 void setTimeOfDay(List<LocalTime> arg);

		public void addTimeOfDay(LocalTime arg);

		 List<String> getWhen();

		 void setWhen(List<String> arg);

		public void addWhen(String arg);

		 Integer getOffset();

		 void setOffset(Integer arg);

}