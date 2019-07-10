package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.NonAvailability;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class NonAvailabilityImpl extends BackboneElementImpl implements NonAvailability {

	private String description;
	private Period during;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String arg) {
		this.description=arg;
	}

	public Period getDuring() {
		return this.during;
	}

	public void setDuring(Period arg) {
		this.during=arg;
	}

}