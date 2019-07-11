package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.resource.DomainResource;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ResourceOrStringChoice extends ChoiceElement {


		 DomainResource getResource();

		 void setResource(DomainResource arg);

		 String getString();

		 void setString(String arg);

}