package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.FamilyMemberHistoryCondition;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.DatePeriodOrStringChoice;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.choice.DeceasedChoice;
import org.reimagineehr.model.quick.api.finding.AssertionalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface FamilyMemberHistory extends AssertionalFinding {


		 CodeableConcept getRelationship();

		 void setRelationship(CodeableConcept arg);

		 List<FamilyMemberHistoryCondition> getCondition();

		 void setCondition(List<FamilyMemberHistoryCondition> arg);

		public void addCondition(FamilyMemberHistoryCondition arg);

		 String getName();

		 void setName(String arg);

		 CodeableConcept getSex();

		 void setSex(CodeableConcept arg);

		 DatePeriodOrStringChoice getBorn();

		 void setBorn(DatePeriodOrStringChoice arg);

		 QuantityRangeRatioOrStringChoice getAge();

		 void setAge(QuantityRangeRatioOrStringChoice arg);

		 Boolean getEstimatedAge();

		 void setEstimatedAge(Boolean arg);

		 DeceasedChoice getDeceased();

		 void setDeceased(DeceasedChoice arg);

}