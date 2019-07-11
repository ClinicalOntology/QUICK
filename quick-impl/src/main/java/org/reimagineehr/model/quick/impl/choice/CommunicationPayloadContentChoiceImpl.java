package org.reimagineehr.model.quick.impl.choice;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.impl.choice.N3Choice;
import org.reimagineehr.model.quick.api.choice.CommunicationPayloadContentChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class CommunicationPayloadContentChoiceImpl extends N3Choice<String,Attachment,DomainResource> implements CommunicationPayloadContentChoice {


	public CommunicationPayloadContentChoiceImpl(Object choice) {
		super(choice);
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

	public String getString() {
		if(getChoice() instanceof String) {
			return (String) getChoice();
		} else {
			return null;
		}
	}

	public void setString(String stringArg) {
		setChoice(stringArg);
	}

	public Attachment getAttachment() {
		if(getChoice() instanceof Attachment) {
			return (Attachment) getChoice();
		} else {
			return null;
		}
	}

	public void setAttachment(Attachment attachmentArg) {
		setChoice(attachmentArg);
	}

	public DomainResource getReference() {
		if(getChoice() instanceof DomainResource) {
			return (DomainResource) getChoice();
		} else {
			return null;
		}
	}

	public void setReference(DomainResource referenceArg) {
		setChoice(referenceArg);
	}

}