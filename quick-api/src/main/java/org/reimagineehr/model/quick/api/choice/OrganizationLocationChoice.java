package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface OrganizationLocationChoice extends ChoiceElement {


		 Location getLocation();

		 void setLocation(Location arg);

		 Organization getOrganization();

		 void setOrganization(Organization arg);

}