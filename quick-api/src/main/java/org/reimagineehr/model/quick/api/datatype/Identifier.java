package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Identifier extends BackboneElement {


		 String getUse();

		 void setUse(String arg);

		 CodeableConcept getType();

		 void setType(CodeableConcept arg);

		 String getSystem();

		 void setSystem(String arg);

		 String getValue();

		 void setValue(String arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Organization getAssigner();

		 void setAssigner(Organization arg);

}