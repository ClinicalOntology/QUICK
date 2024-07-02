package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DosageTaken;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DosageTakenImpl extends BackboneElementImpl implements DosageTaken {

	private String text;
	private CodeableConcept site;
	private CodeableConcept route;
	private CodeableConcept method;
	private SimpleQuantity dose;
	private QuantityRangeRatioOrStringChoice rate;

	public String getText() {
		return this.text;
	}

	public void setText(String arg) {
		this.text=arg;
	}

	public CodeableConcept getSite() {
		return this.site;
	}

	public void setSite(CodeableConcept arg) {
		this.site=arg;
	}

	public CodeableConcept getRoute() {
		return this.route;
	}

	public void setRoute(CodeableConcept arg) {
		this.route=arg;
	}

	public CodeableConcept getMethod() {
		return this.method;
	}

	public void setMethod(CodeableConcept arg) {
		this.method=arg;
	}

	public SimpleQuantity getDose() {
		return this.dose;
	}

	public void setDose(SimpleQuantity arg) {
		this.dose=arg;
	}

	public QuantityRangeRatioOrStringChoice getRate() {
		return this.rate;
	}

	public void setRate(QuantityRangeRatioOrStringChoice arg) {
		this.rate=arg;
	}

}