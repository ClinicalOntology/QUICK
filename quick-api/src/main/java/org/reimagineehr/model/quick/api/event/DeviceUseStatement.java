package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Device;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DeviceUseStatement extends Event {


		 CodeableConcept getBodySite();

		 void setBodySite(CodeableConcept arg);

		 Device getDevice();

		 void setDevice(Device arg);

}