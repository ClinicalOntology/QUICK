package org.reimagineehr.model.quick.api.choice;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface CommunicationPayloadContentChoice extends ChoiceElement {


		 String getString();

		 void setString(String arg);

		 Attachment getAttachment();

		 void setAttachment(Attachment arg);

		 DomainResource getReference();

		 void setReference(DomainResource arg);

}