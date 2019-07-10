package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface ResourceOrCodeChoice extends ChoiceElement {


		 DomainResource getResource();

		 void setResource(DomainResource arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

}