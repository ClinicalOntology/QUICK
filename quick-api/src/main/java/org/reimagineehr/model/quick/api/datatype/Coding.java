package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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