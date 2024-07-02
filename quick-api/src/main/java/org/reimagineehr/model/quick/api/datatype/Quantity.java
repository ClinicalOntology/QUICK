package org.reimagineehr.model.quick.api.datatype;

import java.math.BigDecimal;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Quantity extends Datatype {


		 BigDecimal getValue();

		 void setValue(BigDecimal arg);

		 String getComparator();

		 void setComparator(String arg);

		 String getUnit();

		 void setUnit(String arg);

		 String getSystem();

		 void setSystem(String arg);

		 String getCode();

		 void setCode(String arg);

}