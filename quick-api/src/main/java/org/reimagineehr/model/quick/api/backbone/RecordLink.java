package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface RecordLink extends BackboneElement {


		 IndividualCareRecipient getOther();

		 void setOther(IndividualCareRecipient arg);

		 String getType();

		 void setType(String arg);

}