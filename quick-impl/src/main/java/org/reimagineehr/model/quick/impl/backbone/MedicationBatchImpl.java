package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.MedicationBatch;
import java.lang.String;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationBatchImpl extends BackboneElementImpl implements MedicationBatch {

	private String lotNumber;
	private Date expirationDate;

	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String arg) {
		this.lotNumber=arg;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date arg) {
		this.expirationDate=arg;
	}

}