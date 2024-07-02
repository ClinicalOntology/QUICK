package org.reimagineehr.model.quick.stu3.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IdentifierWrapper implements Identifier {

	private org.hl7.fhir.dstu3.model.Identifier adaptee;

	public IdentifierWrapper() {
	
	}

	public IdentifierWrapper(org.hl7.fhir.dstu3.model.Identifier adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Identifier getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Identifier arg) {
		this.adaptee=arg;
	}

	public String getUse() {
		if (this.adaptee.getUse() != null) {
			return this.adaptee.getUse().toCode();
		} else {
			return null;
		}
	}

	public void setUse(String arg) {
		if (arg != null) {
			this.adaptee.setUse(org.hl7.fhir.dstu3.model.Identifier.IdentifierUse.fromCode(arg));
		}
	}

	public CodeableConcept getType() {
	return new org.reimagineehr.model.quick.stu3.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getType());
	}

	public void setType(CodeableConcept arg) {
	this.adaptee.setType(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public String getSystem() {
	return this.adaptee.getSystemElement().getValue();
	}

	public void setSystem(String arg) {
	this.adaptee.setSystem(arg);
	}

	public String getValue() {
	return this.adaptee.getValueElement().getValue();
	}

	public void setValue(String arg) {
	this.adaptee.setValue(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.stu3.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public Organization getAssigner() {
		return new org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getAssigner()).getResource());
	}

	public void setAssigner(Organization arg) {
		this.adaptee.setAssigner(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

}