package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.datatype.Range;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import java.lang.String;
import org.reimagineehr.model.quick.impl.choice.N4Choice;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class QuantityRangeRatioOrStringChoiceImpl extends N4Choice<SimpleQuantity,Range,Ratio,String> implements QuantityRangeRatioOrStringChoice {

	private SimpleQuantity simpleQuantity;
	private Range range;
	private Ratio ratio;
	private String string;

	public QuantityRangeRatioOrStringChoiceImpl(Object choice) {
	super(choice);
	}

	public SimpleQuantity getSimpleQuantity() {
		return this.simpleQuantity;
	}

	public void setSimpleQuantity(SimpleQuantity arg) {
		this.simpleQuantity=arg;
	}

	public Range getRange() {
		return this.range;
	}

	public void setRange(Range arg) {
		this.range=arg;
	}

	public Ratio getRatio() {
		return this.ratio;
	}

	public void setRatio(Ratio arg) {
		this.ratio=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public N4Choice<SimpleQuantity,Range,Ratio,String> buildChoice(Object choice) {
		if(choice != null && (SimpleQuantity.class.isInstance(choice) || Range.class.isInstance(choice) || Ratio.class.isInstance(choice) || String.class.isInstance(choice))) {
			N4Choice<SimpleQuantity,Range,Ratio,String> myChoice = new N4Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}