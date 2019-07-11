package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.FamilyMemberHistoryCondition;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.Annotation;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class FamilyMemberHistoryConditionImpl extends BackboneElementImpl implements FamilyMemberHistoryCondition {

	private CodeableConcept code;
	private CodeableConcept outcome;
	private Boolean contributedToDeath;
	private OnsetAbatementChoice onset;
	private List<Annotation> note;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public CodeableConcept getOutcome() {
		return this.outcome;
	}

	public void setOutcome(CodeableConcept arg) {
		this.outcome=arg;
	}

	public Boolean getContributedToDeath() {
		return this.contributedToDeath;
	}

	public void setContributedToDeath(Boolean arg) {
		this.contributedToDeath=arg;
	}

	public OnsetAbatementChoice getOnset() {
		return this.onset;
	}

	public void setOnset(OnsetAbatementChoice arg) {
		this.onset=arg;
	}

	public List<Annotation> getNote() {
		return this.note;
	}

	public void setNote(List<Annotation> arg) {
		this.note=arg;
	}

	public void addNote(Annotation arg) {
		this.note.add(arg);
	}

}