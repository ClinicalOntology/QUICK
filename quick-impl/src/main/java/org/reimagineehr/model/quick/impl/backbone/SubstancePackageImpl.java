package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.SubstancePackage;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SubstancePackageImpl extends BackboneElementImpl implements SubstancePackage {

	private Identifier identifier;
	private Date expiry;
	private SimpleQuantity quantity;

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Identifier arg) {
		this.identifier=arg;
	}

	public Date getExpiry() {
		return this.expiry;
	}

	public void setExpiry(Date arg) {
		this.expiry=arg;
	}

	public SimpleQuantity getQuantity() {
		return this.quantity;
	}

	public void setQuantity(SimpleQuantity arg) {
		this.quantity=arg;
	}

}