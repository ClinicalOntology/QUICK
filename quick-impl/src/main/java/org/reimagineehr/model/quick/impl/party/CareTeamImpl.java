package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.CareGiverImpl;
import org.reimagineehr.model.quick.api.party.CareTeam;
import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Annotation;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CareTeamImpl extends CareGiverImpl implements CareTeam {

	private String status;
	private List<CodeableConcept> category;
	private List<String> name;
	private CareRecipient subject;
	private Encounter encounter;
	private Period period;
	private List<Participation> participant;
	private List<CodeableConcept> reasonCode;
	private List<Condition> reasonReference;
	private List<Organization> managingOrganization;
	private List<ContactPoint> telecom;
	private List<Annotation> note;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public List<CodeableConcept> getCategory() {
		return this.category;
	}

	public void setCategory(List<CodeableConcept> arg) {
		this.category=arg;
	}

	public void addCategory(CodeableConcept arg) {
		this.category.add(arg);
	}

	public List<String> getName() {
		return this.name;
	}

	public void setName(List<String> arg) {
		this.name=arg;
	}

	public void addName(String arg) {
		this.name.add(arg);
	}

	public CareRecipient getSubject() {
		return this.subject;
	}

	public void setSubject(CareRecipient arg) {
		this.subject=arg;
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter arg) {
		this.encounter=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public List<Participation> getParticipant() {
		return this.participant;
	}

	public void setParticipant(List<Participation> arg) {
		this.participant=arg;
	}

	public void addParticipant(Participation arg) {
		this.participant.add(arg);
	}

	public List<CodeableConcept> getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(List<CodeableConcept> arg) {
		this.reasonCode=arg;
	}

	public void addReasonCode(CodeableConcept arg) {
		this.reasonCode.add(arg);
	}

	public List<Condition> getReasonReference() {
		return this.reasonReference;
	}

	public void setReasonReference(List<Condition> arg) {
		this.reasonReference=arg;
	}

	public void addReasonReference(Condition arg) {
		this.reasonReference.add(arg);
	}

	public List<Organization> getManagingOrganization() {
		return this.managingOrganization;
	}

	public void setManagingOrganization(List<Organization> arg) {
		this.managingOrganization=arg;
	}

	public void addManagingOrganization(Organization arg) {
		this.managingOrganization.add(arg);
	}

	public List<ContactPoint> getTelecom() {
		return this.telecom;
	}

	public void setTelecom(List<ContactPoint> arg) {
		this.telecom=arg;
	}

	public void addTelecom(ContactPoint arg) {
		this.telecom.add(arg);
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