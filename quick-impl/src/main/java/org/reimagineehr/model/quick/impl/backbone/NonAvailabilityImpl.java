package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.NonAvailability;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
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