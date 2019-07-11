package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import java.util.List;
import java.lang.String;
import org.reimagineehr.model.quick.api.finding.AssertionalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Condition extends AssertionalFinding {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 OnsetAbatementChoice getOnset();

		 void setOnset(OnsetAbatementChoice arg);

		 OnsetAbatementChoice getAbatement();

		 void setAbatement(OnsetAbatementChoice arg);

		 List<CodeableConcept> getBodySite();

		 void setBodySite(List<CodeableConcept> arg);

		public void addBodySite(CodeableConcept arg);

		 CodeableConcept getSeverity();

		 void setSeverity(CodeableConcept arg);

		 String getClinicalStatus();

		 void setClinicalStatus(String arg);

}