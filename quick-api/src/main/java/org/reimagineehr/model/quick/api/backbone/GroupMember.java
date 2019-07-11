package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface GroupMember extends BackboneElement {


		 Party getEntity();

		 void setEntity(Party arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Boolean getInactive();

		 void setInactive(Boolean arg);

}