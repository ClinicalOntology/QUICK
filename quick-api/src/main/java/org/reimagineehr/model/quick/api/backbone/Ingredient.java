package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Ingredient extends BackboneElement {


		 ResourceOrCodeChoice getItem();

		 void setItem(ResourceOrCodeChoice arg);

		 Boolean getIsActive();

		 void setIsActive(Boolean arg);

		 Ratio getStrength();

		 void setStrength(Ratio arg);

}