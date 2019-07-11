package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.lang.Byte;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DeviceUdiCarrier extends BackboneElement {


		 String getDeviceIdentifier();

		 void setDeviceIdentifier(String arg);

		 String getIssuer();

		 void setIssuer(String arg);

		 String getJurisdiction();

		 void setJurisdiction(String arg);

		 Byte[] getCarrierAIDC();

		 void setCarrierAIDC(Byte[] arg);

		 String getCarrierHRF();

		 void setCarrierHRF(String arg);

		 String getEntryType();

		 void setEntryType(String arg);

}