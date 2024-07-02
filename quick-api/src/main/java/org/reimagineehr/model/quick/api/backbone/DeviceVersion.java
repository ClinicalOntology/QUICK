package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DeviceVersion extends BackboneElement {


		 CodeableConcept getType();

		 void setType(CodeableConcept arg);

		 Identifier getComponent();

		 void setComponent(Identifier arg);

		 String getValue();

		 void setValue(String arg);

}