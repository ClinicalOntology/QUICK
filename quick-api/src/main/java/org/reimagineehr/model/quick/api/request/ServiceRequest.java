package org.reimagineehr.model.quick.api.request;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.request.Request;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ServiceRequest extends Request {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 List<CodeableConcept> getBodySite();

		 void setBodySite(List<CodeableConcept> arg);

		public void addBodySite(CodeableConcept arg);

		 Boolean getDoNotPerform();

		 void setDoNotPerform(Boolean arg);

}