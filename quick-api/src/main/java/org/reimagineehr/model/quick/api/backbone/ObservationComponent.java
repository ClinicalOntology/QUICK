package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ObservationComponent extends BackboneElement {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 ObservationValueChoice getValue();

		 void setValue(ObservationValueChoice arg);

		 CodeableConcept getDataAbsentReason();

		 void setDataAbsentReason(CodeableConcept arg);

		 List<CodeableConcept> getInterpretation();

		 void setInterpretation(List<CodeableConcept> arg);

		public void addInterpretation(CodeableConcept arg);

}