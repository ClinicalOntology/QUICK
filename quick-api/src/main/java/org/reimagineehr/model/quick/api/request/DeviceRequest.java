package org.reimagineehr.model.quick.api.request;

import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;
import org.reimagineehr.model.quick.api.request.Request;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DeviceRequest extends Request {


		 ResourceOrCodeChoice getCode();

		 void setCode(ResourceOrCodeChoice arg);

}