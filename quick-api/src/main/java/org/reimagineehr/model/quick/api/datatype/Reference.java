package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Reference extends Datatype {


		 String getReference();

		 void setReference(String arg);

		 String getType();

		 void setType(String arg);

		 Identifier getIdentifier();

		 void setIdentifier(Identifier arg);

		 String getDisplay();

		 void setDisplay(String arg);

}