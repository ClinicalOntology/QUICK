package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.InitialFill;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.datatype.Duration;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class InitialFillImpl extends BackboneElementImpl implements InitialFill {

	private Quantity quantity;
	private Duration duration;

	public Quantity getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Quantity arg) {
		this.quantity=arg;
	}

	public Duration getDuration() {
		return this.duration;
	}

	public void setDuration(Duration arg) {
		this.duration=arg;
	}

}