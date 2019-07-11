package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.datatype.Quantity;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RatioImpl extends DatatypeImpl implements Ratio {

	private Quantity numerator;
	private Quantity denominator;

	public Quantity getNumerator() {
		return this.numerator;
	}

	public void setNumerator(Quantity arg) {
		this.numerator=arg;
	}

	public Quantity getDenominator() {
		return this.denominator;
	}

	public void setDenominator(Quantity arg) {
		this.denominator=arg;
	}

}