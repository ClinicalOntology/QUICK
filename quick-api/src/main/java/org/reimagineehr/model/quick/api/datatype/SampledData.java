package org.reimagineehr.model.quick.api.datatype;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import java.math.BigDecimal;
import java.lang.Integer;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface SampledData extends Datatype {


		 SimpleQuantity getOrigin();

		 void setOrigin(SimpleQuantity arg);

		 BigDecimal getPeriod();

		 void setPeriod(BigDecimal arg);

		 BigDecimal getFactor();

		 void setFactor(BigDecimal arg);

		 BigDecimal getLowerLimit();

		 void setLowerLimit(BigDecimal arg);

		 BigDecimal getUpperLimit();

		 void setUpperLimit(BigDecimal arg);

		 Integer getDimensions();

		 void setDimensions(Integer arg);

		 String getData();

		 void setData(String arg);

}