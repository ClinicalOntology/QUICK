package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Causality extends BackboneElement {


		 CodeableConcept getAssessment();

		 void setAssessment(CodeableConcept arg);

		 String getProductRelatedness();

		 void setProductRelatedness(String arg);

		 IndividualCareGiver getAuthor();

		 void setAuthor(IndividualCareGiver arg);

		 CodeableConcept getMethod();

		 void setMethod(CodeableConcept arg);

}