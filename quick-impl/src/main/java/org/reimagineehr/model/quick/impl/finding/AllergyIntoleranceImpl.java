package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.AssertionalFindingImpl;
import org.reimagineehr.model.quick.api.finding.AllergyIntolerance;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.OnsetAbatementChoice;
import org.reimagineehr.model.quick.api.finding.FamilyMemberHistory;
import java.util.List;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AllergyIntoleranceImpl extends AssertionalFindingImpl implements AllergyIntolerance {

	private CodeableConcept code;
	private String criticality;
	private OnsetAbatementChoice onset;
	private FamilyMemberHistory lastOccurrence;
	private List<FamilyMemberHistory> note;
	private List<FamilyMemberHistory> reaction;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public String getCriticality() {
		return this.criticality;
	}

	public void setCriticality(String arg) {
		this.criticality=arg;
	}

	public OnsetAbatementChoice getOnset() {
		return this.onset;
	}

	public void setOnset(OnsetAbatementChoice arg) {
		this.onset=arg;
	}

	public FamilyMemberHistory getLastOccurrence() {
		return this.lastOccurrence;
	}

	public void setLastOccurrence(FamilyMemberHistory arg) {
		this.lastOccurrence=arg;
	}

	public List<FamilyMemberHistory> getNote() {
		return this.note;
	}

	public void setNote(List<FamilyMemberHistory> arg) {
		this.note=arg;
	}

	public void addNote(FamilyMemberHistory arg) {
		this.note.add(arg);
	}

	public List<FamilyMemberHistory> getReaction() {
		return this.reaction;
	}

	public void setReaction(List<FamilyMemberHistory> arg) {
		this.reaction=arg;
	}

	public void addReaction(FamilyMemberHistory arg) {
		this.reaction.add(arg);
	}

}