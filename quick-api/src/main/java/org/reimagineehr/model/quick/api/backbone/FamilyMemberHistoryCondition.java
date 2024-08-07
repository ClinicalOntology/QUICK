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
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
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