package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface EncounterDiagnosisOrProcedure extends BackboneElement {


		 ConditionOrProcedureChoice getReference();

		 void setReference(ConditionOrProcedureChoice arg);

		 CodeableConcept getUse();

		 void setUse(CodeableConcept arg);

		 Integer getRank();

		 void setRank(Integer arg);

}