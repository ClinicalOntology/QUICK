package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.Annotation;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface FamilyMemberHistoryCondition extends BackboneElement {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 CodeableConcept getOutcome();

		 void setOutcome(CodeableConcept arg);

		 Boolean getContributedToDeath();

		 void setContributedToDeath(Boolean arg);

		 OnsetAbatementChoice getOnset();

		 void setOnset(OnsetAbatementChoice arg);

		 List<Annotation> getNote();

		 void setNote(List<Annotation> arg);

		public void addNote(Annotation arg);

}