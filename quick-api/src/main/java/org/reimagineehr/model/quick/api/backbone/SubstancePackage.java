package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface SubstancePackage extends BackboneElement {


		 Identifier getIdentifier();

		 void setIdentifier(Identifier arg);

		 Date getExpiry();

		 void setExpiry(Date arg);

		 SimpleQuantity getQuantity();

		 void setQuantity(SimpleQuantity arg);

}