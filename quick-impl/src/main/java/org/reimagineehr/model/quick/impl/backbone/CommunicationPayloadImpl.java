package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.CommunicationPayload;
import org.reimagineehr.model.quick.api.choice.CommunicationPayloadContentChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CommunicationPayloadImpl extends BackboneElementImpl implements CommunicationPayload {

	private CommunicationPayloadContentChoice content;

	public CommunicationPayloadContentChoice getContent() {
		return this.content;
	}

	public void setContent(CommunicationPayloadContentChoice arg) {
		this.content=arg;
	}

}