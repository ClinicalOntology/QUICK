package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
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