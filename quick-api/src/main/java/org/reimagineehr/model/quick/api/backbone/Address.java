package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Address extends BackboneElement {


		 String getUse();

		 void setUse(String arg);

		 String getType();

		 void setType(String arg);

		 String getText();

		 void setText(String arg);

		 List<String> getLine();

		 void setLine(List<String> arg);

		public void addLine(String arg);

		 String getCity();

		 void setCity(String arg);

		 String getDistrict();

		 void setDistrict(String arg);

		 String getState();

		 void setState(String arg);

		 String getPostalCode();

		 void setPostalCode(String arg);

		 String getCountry();

		 void setCountry(String arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}