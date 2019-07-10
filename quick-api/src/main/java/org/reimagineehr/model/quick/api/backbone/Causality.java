package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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