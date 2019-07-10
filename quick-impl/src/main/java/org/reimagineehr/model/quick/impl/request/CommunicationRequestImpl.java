package org.reimagineehr.model.quick.impl.request;

import org.reimagineehr.model.quick.impl.request.RequestImpl;
import org.reimagineehr.model.quick.api.request.CommunicationRequest;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.CommunicationPayload;
import org.reimagineehr.model.quick.api.party.Party;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class CommunicationRequestImpl extends RequestImpl implements CommunicationRequest {

	private List<CodeableConcept> category;
	private Boolean doNotPerform;
	private List<CodeableConcept> medium;
	private List<CommunicationPayload> payload;
	private Party sender;
	private Party recipient;

	public List<CodeableConcept> getCategory() {
		return this.category;
	}

	public void setCategory(List<CodeableConcept> arg) {
		this.category=arg;
	}

	public void addCategory(CodeableConcept arg) {
		this.category.add(arg);
	}

	public Boolean getDoNotPerform() {
		return this.doNotPerform;
	}

	public void setDoNotPerform(Boolean arg) {
		this.doNotPerform=arg;
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

	public Party getSender() {
		return this.sender;
	}

	public void setSender(Party arg) {
		this.sender=arg;
	}

	public Party getRecipient() {
		return this.recipient;
	}

	public void setRecipient(Party arg) {
		this.recipient=arg;
	}

}