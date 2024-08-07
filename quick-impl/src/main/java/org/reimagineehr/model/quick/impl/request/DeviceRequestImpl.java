package org.reimagineehr.model.quick.impl.request;

import org.reimagineehr.model.quick.impl.request.RequestImpl;
import org.reimagineehr.model.quick.api.request.DeviceRequest;
import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceRequestImpl extends RequestImpl implements DeviceRequest {

	private ResourceOrCodeChoice code;

	public ResourceOrCodeChoice getCode() {
		return this.code;
	}

	public void setCode(ResourceOrCodeChoice arg) {
		this.code=arg;
	}

}