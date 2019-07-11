package org.reimagineehr.model.quick.api.datatype;

import java.lang.String;
import java.util.Date;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import org.reimagineehr.model.quick.api.datatype.Datatype;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Meta extends Datatype {


		 String getVersionId();

		 void setVersionId(String arg);

		 Date getLastUpdated();

		 void setLastUpdated(Date arg);

		 String getSource();

		 void setSource(String arg);

		 List<String> getProfile();

		 void setProfile(List<String> arg);

		public void addProfile(String arg);

		 List<Coding> getSecurity();

		 void setSecurity(List<Coding> arg);

		public void addSecurity(Coding arg);

		 List<Coding> getTag();

		 void setTag(List<Coding> arg);

		public void addTag(Coding arg);

}