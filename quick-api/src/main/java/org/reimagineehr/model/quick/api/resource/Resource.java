package org.reimagineehr.model.quick.api.resource;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.primitive.Element;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Resource extends Element {


		 String getId();

		 void setId(String arg);

		 Meta getMeta();

		 void setMeta(Meta arg);

		 String getImplicitRules();

		 void setImplicitRules(String arg);

		 String getLanguage();

		 void setLanguage(String arg);

}