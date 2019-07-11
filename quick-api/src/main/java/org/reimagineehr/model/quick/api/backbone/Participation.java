package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Participation extends BackboneElement {


		 CodeableConcept getRole();

		 void setRole(CodeableConcept arg);

		 Party getActor();

		 void setActor(Party arg);

		 Organization getOnBehalfOf();

		 void setOnBehalfOf(Organization arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 String getRequired();

		 void setRequired(String arg);

		 String getStatus();

		 void setStatus(String arg);

}