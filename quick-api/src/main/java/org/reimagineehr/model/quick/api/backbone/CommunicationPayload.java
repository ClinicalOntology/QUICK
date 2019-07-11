package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.CommunicationPayloadContentChoice;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CommunicationPayload extends BackboneElement {


		 CommunicationPayloadContentChoice getContent();

		 void setContent(CommunicationPayloadContentChoice arg);

}