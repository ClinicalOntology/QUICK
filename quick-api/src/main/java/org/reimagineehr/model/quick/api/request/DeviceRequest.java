package org.reimagineehr.model.quick.api.request;

import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;
import org.reimagineehr.model.quick.api.request.Request;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DeviceRequest extends Request {


		 ResourceOrCodeChoice getCode();

		 void setCode(ResourceOrCodeChoice arg);

}