package org.reimagineehr.model.quick.impl.request;

import org.reimagineehr.model.quick.impl.request.RequestImpl;
import org.reimagineehr.model.quick.api.request.ServiceRequest;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ServiceRequestImpl extends RequestImpl implements ServiceRequest {

	private CodeableConcept code;
	private List<CodeableConcept> bodySite;
	private Boolean doNotPerform;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public List<CodeableConcept> getBodySite() {
		return this.bodySite;
	}

	public void setBodySite(List<CodeableConcept> arg) {
		this.bodySite=arg;
	}

	public void addBodySite(CodeableConcept arg) {
		this.bodySite.add(arg);
	}

	public Boolean getDoNotPerform() {
		return this.doNotPerform;
	}

	public void setDoNotPerform(Boolean arg) {
		this.doNotPerform=arg;
	}

}