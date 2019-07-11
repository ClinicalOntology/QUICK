package org.reimagineehr.model.quick.api.datatype;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
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