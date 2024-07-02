package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.backbone.InitialFill;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DispenseRequest extends BackboneElement {


		 InitialFill getInitialFill();

		 void setInitialFill(InitialFill arg);

		 Duration getDispenseInterval();

		 void setDispenseInterval(Duration arg);

		 Period getValidityPeriod();

		 void setValidityPeriod(Period arg);

		 Integer getNumberOfRepeatsAllowed();

		 void setNumberOfRepeatsAllowed(Integer arg);

		 SimpleQuantity getQuantity();

		 void setQuantity(SimpleQuantity arg);

		 Duration getExpectedSupplyDuration();

		 void setExpectedSupplyDuration(Duration arg);

		 Organization getPerformer();

		 void setPerformer(Organization arg);

}