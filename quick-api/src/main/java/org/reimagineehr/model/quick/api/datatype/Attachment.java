package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import java.lang.Byte;
import java.lang.Integer;
import java.util.Date;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Attachment extends Datatype {


		 String getContentType();

		 void setContentType(String arg);

		 String getLanguage();

		 void setLanguage(String arg);

		 Byte[] getData();

		 void setData(Byte[] arg);

		 String getUrl();

		 void setUrl(String arg);

		 Integer getSize();

		 void setSize(Integer arg);

		 Byte[] getHash();

		 void setHash(Byte[] arg);

		 String getTitle();

		 void setTitle(String arg);

		 Date getCreation();

		 void setCreation(Date arg);

}