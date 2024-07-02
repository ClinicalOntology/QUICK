package org.reimagineehr.model.quick.api.backbone;

import java.math.BigDecimal;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface GpsLocation extends BackboneElement {


		 BigDecimal getLongitude();

		 void setLongitude(BigDecimal arg);

		 BigDecimal getLatitude();

		 void setLatitude(BigDecimal arg);

		 BigDecimal getAltitude();

		 void setAltitude(BigDecimal arg);

}