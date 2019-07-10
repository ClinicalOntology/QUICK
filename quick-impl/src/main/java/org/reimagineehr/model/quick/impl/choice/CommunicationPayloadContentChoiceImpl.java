package org.reimagineehr.model.quick.impl.choice;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.CommunicationPayloadContentChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class CommunicationPayloadContentChoiceImpl extends N3Choice<String,Attachment,DomainResource> implements CommunicationPayloadContentChoice {

	private String string;
	private Attachment attachment;
	private DomainResource reference;

	public CommunicationPayloadContentChoiceImpl(Object choice) {
	super(choice);
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void setAttachment(Attachment arg) {
		this.attachment=arg;
	}

	public DomainResource getReference() {
		return this.reference;
	}

	public void setReference(DomainResource arg) {
		this.reference=arg;
	}

	public N3Choice<String,Attachment,DomainResource> buildChoice(Object choice) {
		if(choice != null && (String.class.isInstance(choice) || Attachment.class.isInstance(choice) || DomainResource.class.isInstance(choice))) {
			N3Choice<String,Attachment,DomainResource> myChoice = new N3Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}