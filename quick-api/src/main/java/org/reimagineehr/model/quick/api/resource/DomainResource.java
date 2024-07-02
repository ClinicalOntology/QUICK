package org.reimagineehr.model.quick.api.resource;

import org.reimagineehr.model.quick.api.datatype.Narrative;
import org.reimagineehr.model.quick.api.resource.Resource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DomainResource extends Resource {


		 Narrative getText();

		 void setText(Narrative arg);

}