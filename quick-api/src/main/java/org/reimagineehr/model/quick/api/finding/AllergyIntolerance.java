package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import org.reimagineehr.model.quick.api.finding.FamilyMemberHistory;
import java.util.List;
import org.reimagineehr.model.quick.api.finding.AssertionalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface AllergyIntolerance extends AssertionalFinding {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 String getCriticality();

		 void setCriticality(String arg);

		 OnsetAbatementChoice getOnset();

		 void setOnset(OnsetAbatementChoice arg);

		 FamilyMemberHistory getLastOccurrence();

		 void setLastOccurrence(FamilyMemberHistory arg);

		 List<FamilyMemberHistory> getNote();

		 void setNote(List<FamilyMemberHistory> arg);

		public void addNote(FamilyMemberHistory arg);

		 List<FamilyMemberHistory> getReaction();

		 void setReaction(List<FamilyMemberHistory> arg);

		public void addReaction(FamilyMemberHistory arg);

}