package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.CommunicationPayloadContentChoice;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CommunicationPayload extends BackboneElement {


		 CommunicationPayloadContentChoice getContent();

		 void setContent(CommunicationPayloadContentChoice arg);

}