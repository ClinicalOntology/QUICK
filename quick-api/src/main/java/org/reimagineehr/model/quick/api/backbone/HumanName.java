package org.reimagineehr.model.quick.api.backbone;

import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface HumanName extends BackboneElement {


		 String getUse();

		 void setUse(String arg);

		 String getText();

		 void setText(String arg);

		 String getFamily();

		 void setFamily(String arg);

		 List<String> getGiven();

		 void setGiven(List<String> arg);

		public void addGiven(String arg);

		 List<String> getPrefix();

		 void setPrefix(List<String> arg);

		public void addPrefix(String arg);

		 List<String> getSuffix();

		 void setSuffix(List<String> arg);

		public void addSuffix(String arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}