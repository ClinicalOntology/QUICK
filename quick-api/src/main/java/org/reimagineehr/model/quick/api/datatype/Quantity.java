package org.reimagineehr.model.quick.api.datatype;

import java.math.BigDecimal;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
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