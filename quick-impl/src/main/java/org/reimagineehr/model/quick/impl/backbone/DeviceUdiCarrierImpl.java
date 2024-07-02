package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DeviceUdiCarrier;
import java.lang.String;
import java.lang.Byte;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceUdiCarrierImpl extends BackboneElementImpl implements DeviceUdiCarrier {

	private String deviceIdentifier;
	private String issuer;
	private String jurisdiction;
	private Byte[] carrierAIDC;
	private String carrierHRF;
	private String entryType;

	public String getDeviceIdentifier() {
		return this.deviceIdentifier;
	}

	public void setDeviceIdentifier(String arg) {
		this.deviceIdentifier=arg;
	}

	public String getIssuer() {
		return this.issuer;
	}

	public void setIssuer(String arg) {
		this.issuer=arg;
	}

	public String getJurisdiction() {
		return this.jurisdiction;
	}

	public void setJurisdiction(String arg) {
		this.jurisdiction=arg;
	}

	public Byte[] getCarrierAIDC() {
		return this.carrierAIDC;
	}

	public void setCarrierAIDC(Byte[] arg) {
		this.carrierAIDC=arg;
	}

	public String getCarrierHRF() {
		return this.carrierHRF;
	}

	public void setCarrierHRF(String arg) {
		this.carrierHRF=arg;
	}

	public String getEntryType() {
		return this.entryType;
	}

	public void setEntryType(String arg) {
		this.entryType=arg;
	}

}