package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.DeviceUseStatement;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Device;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceUseStatementImpl extends EventImpl implements DeviceUseStatement {

	private CodeableConcept bodySite;
	private Device device;

	public CodeableConcept getBodySite() {
		return this.bodySite;
	}

	public void setBodySite(CodeableConcept arg) {
		this.bodySite=arg;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device arg) {
		this.device=arg;
	}

}