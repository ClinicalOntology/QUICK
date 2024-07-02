package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface RecordLink extends BackboneElement {


		 IndividualCareRecipient getOther();

		 void setOther(IndividualCareRecipient arg);

		 String getType();

		 void setType(String arg);

}