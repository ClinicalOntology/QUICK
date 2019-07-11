package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Causality;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CausalityImpl extends BackboneElementImpl implements Causality {

	private CodeableConcept assessment;
	private String productRelatedness;
	private IndividualCareGiver author;
	private CodeableConcept method;

	public CodeableConcept getAssessment() {
		return this.assessment;
	}

	public void setAssessment(CodeableConcept arg) {
		this.assessment=arg;
	}

	public String getProductRelatedness() {
		return this.productRelatedness;
	}

	public void setProductRelatedness(String arg) {
		this.productRelatedness=arg;
	}

	public IndividualCareGiver getAuthor() {
		return this.author;
	}

	public void setAuthor(IndividualCareGiver arg) {
		this.author=arg;
	}

	public CodeableConcept getMethod() {
		return this.method;
	}

	public void setMethod(CodeableConcept arg) {
		this.method=arg;
	}

}