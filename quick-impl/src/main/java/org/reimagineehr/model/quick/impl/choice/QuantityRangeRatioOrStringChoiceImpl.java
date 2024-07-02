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
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class QuantityRangeRatioOrStringChoiceImpl extends N4Choice<SimpleQuantity,Range,Ratio,String> implements QuantityRangeRatioOrStringChoice {


	public QuantityRangeRatioOrStringChoiceImpl(Object choice) {
		super(choice);
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

	public SimpleQuantity getSimpleQuantity() {
		if(getChoice() instanceof SimpleQuantity) {
			return (SimpleQuantity) getChoice();
		} else {
			return null;
		}
	}

	public void setSimpleQuantity(SimpleQuantity simpleQuantityArg) {
		setChoice(simpleQuantityArg);
	}

	public Range getRange() {
		if(getChoice() instanceof Range) {
			return (Range) getChoice();
		} else {
			return null;
		}
	}

	public void setRange(Range rangeArg) {
		setChoice(rangeArg);
	}

	public Ratio getRatio() {
		if(getChoice() instanceof Ratio) {
			return (Ratio) getChoice();
		} else {
			return null;
		}
	}

	public void setRatio(Ratio ratioArg) {
		setChoice(ratioArg);
	}

	public String getString() {
		if(getChoice() instanceof String) {
			return (String) getChoice();
		} else {
			return null;
		}
	}

	public void setString(String stringArg) {
		setChoice(stringArg);
	}

}