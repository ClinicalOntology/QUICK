package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface MedicationBatch extends BackboneElement {


		 String getLotNumber();

		 void setLotNumber(String arg);

		 Date getExpirationDate();

		 void setExpirationDate(Date arg);

}