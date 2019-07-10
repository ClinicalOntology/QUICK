package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Contact extends BackboneElement {


		 HumanName getName();

		 void setName(HumanName arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 Address getAddress();

		 void setAddress(Address arg);

}