package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DoseAndRateImpl extends BackboneElementImpl implements DoseAndRate {

	private CodeableConcept type;
	private QuantityRangeRatioOrStringChoice dose;
	private QuantityRangeRatioOrStringChoice rate;

	public CodeableConcept getType() {
		return this.type;
	}

	public void setType(CodeableConcept arg) {
		this.type=arg;
	}

	public QuantityRangeRatioOrStringChoice getDose() {
		return this.dose;
	}

	public void setDose(QuantityRangeRatioOrStringChoice arg) {
		this.dose=arg;
	}

	public QuantityRangeRatioOrStringChoice getRate() {
		return this.rate;
	}

	public void setRate(QuantityRangeRatioOrStringChoice arg) {
		this.rate=arg;
	}

}