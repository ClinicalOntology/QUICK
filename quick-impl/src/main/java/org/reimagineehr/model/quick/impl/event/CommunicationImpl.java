package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.Communication;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.Participation;
import java.util.List;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.CommunicationPayload;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CommunicationImpl extends EventImpl implements Communication {

	private CodeableConcept category;
	private Participation sender;
	private List<Party> recipient;
	private Date sent;
	private Date received;
	private List<CodeableConcept> medium;
	private List<CommunicationPayload> payload;

	public CodeableConcept getCategory() {
		return this.category;
	}

	public void setCategory(CodeableConcept arg) {
		this.category=arg;
	}

	public Participation getSender() {
		return this.sender;
	}

	public void setSender(Participation arg) {
		this.sender=arg;
	}

	public List<Party> getRecipient() {
		return this.recipient;
	}

	public void setRecipient(List<Party> arg) {
		this.recipient=arg;
	}

	public void addRecipient(Party arg) {
		this.recipient.add(arg);
	}

	public Date getSent() {
		return this.sent;
	}

	public void setSent(Date arg) {
		this.sent=arg;
	}

	public Date getReceived() {
		return this.received;
	}

	public void setReceived(Date arg) {
		this.received=arg;
	}

	public List<CodeableConcept> getMedium() {
		return this.medium;
	}

	public void setMedium(List<CodeableConcept> arg) {
		this.medium=arg;
	}

	public void addMedium(CodeableConcept arg) {
		this.medium.add(arg);
	}

	public List<CommunicationPayload> getPayload() {
		return this.payload;
	}

	public void setPayload(List<CommunicationPayload> arg) {
		this.payload=arg;
	}

	public void addPayload(CommunicationPayload arg) {
		this.payload.add(arg);
	}

}