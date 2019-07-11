package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.AssertionalFindingImpl;
import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import java.util.List;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ConditionImpl extends AssertionalFindingImpl implements Condition {

	private CodeableConcept code;
	private OnsetAbatementChoice onset;
	private OnsetAbatementChoice abatement;
	private List<CodeableConcept> bodySite;
	private CodeableConcept severity;
	private String clinicalStatus;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public OnsetAbatementChoice getOnset() {
		return this.onset;
	}

	public void setOnset(OnsetAbatementChoice arg) {
		this.onset=arg;
	}

	public OnsetAbatementChoice getAbatement() {
		return this.abatement;
	}

	public void setAbatement(OnsetAbatementChoice arg) {
		this.abatement=arg;
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

	public CodeableConcept getSeverity() {
		return this.severity;
	}

	public void setSeverity(CodeableConcept arg) {
		this.severity=arg;
	}

	public String getClinicalStatus() {
		return this.clinicalStatus;
	}

	public void setClinicalStatus(String arg) {
		this.clinicalStatus=arg;
	}

}