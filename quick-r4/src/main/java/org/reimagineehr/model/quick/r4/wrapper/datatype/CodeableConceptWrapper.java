package org.reimagineehr.model.quick.r4.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CodeableConceptWrapper implements CodeableConcept {

	private org.hl7.fhir.r4.model.CodeableConcept adaptee;

	public CodeableConceptWrapper() {
	
	}

	public CodeableConceptWrapper(org.hl7.fhir.r4.model.CodeableConcept adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.CodeableConcept getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.CodeableConcept arg) {
		this.adaptee=arg;
	}

	public List<Coding> getCoding() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCoding(this.adaptee.getCoding());
	}

	public void setCoding(java.util.List<Coding> arg) {
		this.adaptee.setCoding(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCoding(arg));
	}

	public void addCoding(Coding arg) {
		this.adaptee.addCoding(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCoding(arg));
	}

	public String getText() {
	return this.adaptee.getTextElement().getValue();
	}

	public void setText(String arg) {
	this.adaptee.setText(arg);
	}

}