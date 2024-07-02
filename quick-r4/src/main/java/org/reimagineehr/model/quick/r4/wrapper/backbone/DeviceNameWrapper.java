package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DeviceName;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceNameWrapper implements DeviceName {

	private org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent adaptee;

	public DeviceNameWrapper() {
	
	}

	public DeviceNameWrapper(org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent arg) {
		this.adaptee=arg;
	}

	public String getName() {
	return this.adaptee.getNameElement().getValue();
	}

	public void setName(String arg) {
	this.adaptee.setName(arg);
	}

	public String getType() {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Device.DeviceNameType>  item = this.adaptee.getTypeElement();
		return item.getValueAsString();
	}

	public void setType(String arg) {
		this.adaptee.setTypeElement((new org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory()).fromType(new org.hl7.fhir.r4.model.CodeType(arg)));
	}

}