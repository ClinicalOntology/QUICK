package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface RecordLink extends BackboneElement {


		 IndividualCareRecipient getOther();

		 void setOther(IndividualCareRecipient arg);

		 String getType();

		 void setType(String arg);

}