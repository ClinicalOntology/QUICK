package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Coding extends Datatype {


		 String getSystem();

		 void setSystem(String arg);

		 String getVersion();

		 void setVersion(String arg);

		 String getCode();

		 void setCode(String arg);

		 String getDisplay();

		 void setDisplay(String arg);

		 Boolean getUserSelected();

		 void setUserSelected(Boolean arg);

}