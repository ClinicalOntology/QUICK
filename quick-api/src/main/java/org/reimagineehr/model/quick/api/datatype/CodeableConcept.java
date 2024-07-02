package org.reimagineehr.model.quick.api.datatype;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CodeableConcept extends Datatype {


		 List<Coding> getCoding();

		 void setCoding(List<Coding> arg);

		public void addCoding(Coding arg);

		 String getText();

		 void setText(String arg);

}