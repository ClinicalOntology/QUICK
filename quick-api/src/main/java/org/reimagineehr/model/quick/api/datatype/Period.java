package org.reimagineehr.model.quick.api.datatype;

import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Period extends Datatype {


		 Date getStart();

		 void setStart(Date arg);

		 Date getEnd();

		 void setEnd(Date arg);

}