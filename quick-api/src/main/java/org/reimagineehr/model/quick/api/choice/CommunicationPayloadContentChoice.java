package org.reimagineehr.model.quick.api.choice;

import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
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