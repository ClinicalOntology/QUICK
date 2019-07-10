package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.datatype.Quantity;
import org.reimagineehr.model.quick.api.datatype.Range;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;

public interface QuantityRangeOrStringChoice extends ChoiceElement {


		 Quantity getQuantity();

		 void setQuantity(Quantity arg);

		 Range getRange();

		 void setRange(Range arg);

		 String getString();

		 void setString(String arg);

}