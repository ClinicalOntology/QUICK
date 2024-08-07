package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface MedicationBatch extends BackboneElement {


		 String getLotNumber();

		 void setLotNumber(String arg);

		 Date getExpirationDate();

		 void setExpirationDate(Date arg);

}