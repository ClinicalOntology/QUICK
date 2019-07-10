package org.reimagineehr.model.quick.api.datatype;

import java.math.BigDecimal;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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