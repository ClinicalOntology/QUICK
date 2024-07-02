package org.reimagineehr.model.quick.impl.request;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.request.Request;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.CareRecipient;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class RequestImpl extends DomainResourceImpl implements Request {

	private List<Identifier> identifier;
	private String intent;
	private List<CodeableConcept> reasonCode;
	private Date authoredOn;
	private Party requester;
	private CareRecipient subject;
	private String status;
	private CodeableConcept statusReason;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public String getIntent() {
		return this.intent;
	}

	public void setIntent(String arg) {
		this.intent=arg;
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

	public Date getAuthoredOn() {
		return this.authoredOn;
	}

	public void setAuthoredOn(Date arg) {
		this.authoredOn=arg;
	}

	public Party getRequester() {
		return this.requester;
	}

	public void setRequester(Party arg) {
		this.requester=arg;
	}

	public CareRecipient getSubject() {
		return this.subject;
	}

	public void setSubject(CareRecipient arg) {
		this.subject=arg;
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

}