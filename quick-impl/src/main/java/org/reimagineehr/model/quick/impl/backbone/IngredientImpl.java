package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Ratio;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IngredientImpl extends BackboneElementImpl implements Ingredient {

	private ResourceOrCodeChoice item;
	private Boolean isActive;
	private Ratio strength;

	public ResourceOrCodeChoice getItem() {
		return this.item;
	}

	public void setItem(ResourceOrCodeChoice arg) {
		this.item=arg;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean arg) {
		this.isActive=arg;
	}

	public Ratio getStrength() {
		return this.strength;
	}

	public void setStrength(Ratio arg) {
		this.strength=arg;
	}

}