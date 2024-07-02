package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.event.Event;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Procedure extends Event {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 CodeableConcept getOutcome();

		 void setOutcome(CodeableConcept arg);

		 List<CodeableConcept> getBodySite();

		 void setBodySite(List<CodeableConcept> arg);

		public void addBodySite(CodeableConcept arg);

		 List<Event> getPartOf();

		 void setPartOf(List<Event> arg);

		public void addPartOf(Event arg);

}