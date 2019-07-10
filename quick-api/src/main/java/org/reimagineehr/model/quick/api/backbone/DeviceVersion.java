package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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