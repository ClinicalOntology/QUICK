package org.reimagineehr.model.quick.stu3.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Meta;
import java.lang.String;
import java.util.Date;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MetaWrapper implements Meta {

	private org.hl7.fhir.dstu3.model.Meta adaptee;

	public MetaWrapper() {
	
	}

	public MetaWrapper(org.hl7.fhir.dstu3.model.Meta adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Meta getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Meta arg) {
		this.adaptee=arg;
	}

	public String getVersionId() {
	return this.adaptee.getVersionIdElement().getValue();
	}

	public void setVersionId(String arg) {
	this.adaptee.setVersionId(arg);
	}

	public Date getLastUpdated() {
	return this.adaptee.getLastUpdatedElement().getValue();
	}

	public void setLastUpdated(Date arg) {
	this.adaptee.setLastUpdated(arg);
	}

	public String getSource() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setSource(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public List<String> getProfile() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getProfile() != null) {
			for(org.hl7.fhir.dstu3.model.UriType type: this.adaptee.getProfile()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setProfile(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.dstu3.model.UriType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.dstu3.model.UriType(type));
			}
		}
		this.adaptee.setProfile(values);
	}

	public void addProfile(String arg) {
	
		this.adaptee.addProfile(arg);
	}

	public List<Coding> getSecurity() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCoding(this.adaptee.getSecurity());
	}

	public void setSecurity(java.util.List<Coding> arg) {
		this.adaptee.setSecurity(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCoding(arg));
	}

	public void addSecurity(Coding arg) {
		this.adaptee.addSecurity(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCoding(arg));
	}

	public List<Coding> getTag() {
		return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCoding(this.adaptee.getTag());
	}

	public void setTag(java.util.List<Coding> arg) {
		this.adaptee.setTag(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCoding(arg));
	}

	public void addTag(Coding arg) {
		this.adaptee.addTag(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCoding(arg));
	}

}