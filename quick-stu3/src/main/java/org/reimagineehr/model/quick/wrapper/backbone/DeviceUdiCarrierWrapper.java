package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DeviceUdiCarrier;
import java.lang.String;
import java.lang.Byte;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceUdiCarrierWrapper implements DeviceUdiCarrier {

	private org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent adaptee;

	public DeviceUdiCarrierWrapper() {
	
	}

	public DeviceUdiCarrierWrapper(org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Device.DeviceUdiComponent arg) {
		this.adaptee=arg;
	}

	public String getDeviceIdentifier() {
	return this.adaptee.getDeviceIdentifierElement().getValue();
	}

	public void setDeviceIdentifier(String arg) {
	this.adaptee.setDeviceIdentifier(arg);
	}

	public String getIssuer() {
	return this.adaptee.getIssuerElement().getValue();
	}

	public void setIssuer(String arg) {
	this.adaptee.setIssuer(arg);
	}

	public String getJurisdiction() {
	return this.adaptee.getJurisdictionElement().getValue();
	}

	public void setJurisdiction(String arg) {
	this.adaptee.setJurisdiction(arg);
	}

	public Byte[] getCarrierAIDC() {
		byte[] bytes = this.adaptee.getCarrierAIDC();
		return org.apache.commons.lang3.ArrayUtils.toObject(bytes);
	}

	public void setCarrierAIDC(Byte[] arg) {
		this.adaptee.setCarrierAIDC(org.apache.commons.lang3.ArrayUtils.toPrimitive(arg));
	}

	public String getCarrierHRF() {
	return this.adaptee.getCarrierHRFElement().getValue();
	}

	public void setCarrierHRF(String arg) {
	this.adaptee.setCarrierHRF(arg);
	}

	public String getEntryType() {
		if (this.adaptee.getEntryType() != null) {
			return this.adaptee.getEntryType().toCode();
		} else {
			return null;
		}
	}

	public void setEntryType(String arg) {
		if (arg != null) {
			this.adaptee.setEntryType(org.hl7.fhir.dstu3.model.Device.UDIEntryType.fromCode(arg));
		}
	}

}