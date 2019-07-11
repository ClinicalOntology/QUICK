package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.event.Event;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.CareRecipient;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.finding.Finding;
import org.reimagineehr.model.quick.api.choice.OccurrenceAllChoice;
import org.reimagineehr.model.quick.api.request.Request;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class EventImpl extends DomainResourceImpl implements Event {

	private List<Identifier> identifier;
	private String status;
	private CodeableConcept statusReason;
	private CareRecipient subject;
	private List<Participation> performer;
	private List<CodeableConcept> reasonCode;
	private List<Finding> reasonReference;
	private OccurrenceAllChoice occurrence;
	private List<Request> basedOn;
	private Party recorder;
	private Date recorded;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public CodeableConcept getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(CodeableConcept arg) {
		this.statusReason=arg;
	}

	public CareRecipient getSubject() {
		return this.subject;
	}

	public void setSubject(CareRecipient arg) {
		this.subject=arg;
	}

	public List<Participation> getPerformer() {
		return this.performer;
	}

	public void setPerformer(List<Participation> arg) {
		this.performer=arg;
	}

	public void addPerformer(Participation arg) {
		this.performer.add(arg);
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

	public List<Finding> getReasonReference() {
		return this.reasonReference;
	}

	public void setReasonReference(List<Finding> arg) {
		this.reasonReference=arg;
	}

	public void addReasonReference(Finding arg) {
		this.reasonReference.add(arg);
	}

	public OccurrenceAllChoice getOccurrence() {
		return this.occurrence;
	}

	public void setOccurrence(OccurrenceAllChoice arg) {
		this.occurrence=arg;
	}

	public List<Request> getBasedOn() {
		return this.basedOn;
	}

	public void setBasedOn(List<Request> arg) {
		this.basedOn=arg;
	}

	public void addBasedOn(Request arg) {
		this.basedOn.add(arg);
	}

	public Party getRecorder() {
		return this.recorder;
	}

	public void setRecorder(Party arg) {
		this.recorder=arg;
	}

	public Date getRecorded() {
		return this.recorded;
	}

	public void setRecorded(Date arg) {
		this.recorded=arg;
	}

}