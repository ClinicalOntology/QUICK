package org.reimagineehr.model.quick.stu3.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Reference;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Identifier;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ReferenceWrapper implements Reference {

	private org.hl7.fhir.dstu3.model.Reference adaptee;

	public ReferenceWrapper() {
	
	}

	public ReferenceWrapper(org.hl7.fhir.dstu3.model.Reference adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Reference getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Reference arg) {
		this.adaptee=arg;
	}

	public String getReference() {
	return this.adaptee.getReferenceElement().getValue();
	}

	public void setReference(String arg) {
	this.adaptee.setReference(arg);
	}

	public String getType() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setType(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Identifier getIdentifier() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.IdentifierWrapper(this.adaptee.getIdentifier());
	}

	public void setIdentifier(Identifier arg) {
	
		this.adaptee.setIdentifier(((org.reimagineehr.model.quick.stu3.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public String getDisplay() {
	return this.adaptee.getDisplayElement().getValue();
	}

	public void setDisplay(String arg) {
	this.adaptee.setDisplay(arg);
	}

}