package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import java.time.LocalTime;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface ObservationValueChoice extends ChoiceElement {


		 Quantity getQuantity();

		 void setQuantity(Quantity arg);

		 CodeableConcept getCodeableConcept();

		 void setCodeableConcept(CodeableConcept arg);

		 String getString();

		 void setString(String arg);

		 Boolean getBoolean();

		 void setBoolean(Boolean arg);

		 Integer getInteger();

		 void setInteger(Integer arg);

		 Range getRange();

		 void setRange(Range arg);

		 Ratio getRatio();

		 void setRatio(Ratio arg);

		 LocalTime getTime();

		 void setTime(LocalTime arg);

		 Date getDateTime();

		 void setDateTime(Date arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}