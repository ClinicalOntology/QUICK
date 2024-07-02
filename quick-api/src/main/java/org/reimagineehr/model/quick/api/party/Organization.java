package org.reimagineehr.model.quick.api.party;

import java.lang.Boolean;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;
import org.reimagineehr.model.quick.api.party.CareGiver;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Organization extends CareGiver {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 List<CodeableConcept> getType();

		 void setType(List<CodeableConcept> arg);

		public void addType(CodeableConcept arg);

		 String getName();

		 void setName(String arg);

		 List<String> getAlias();

		 void setAlias(List<String> arg);

		public void addAlias(String arg);

		 List<ContactPoint> getTelecom();

		 void setTelecom(List<ContactPoint> arg);

		public void addTelecom(ContactPoint arg);

		 List<Address> getAddress();

		 void setAddress(List<Address> arg);

		public void addAddress(Address arg);

		 Organization getPartOf();

		 void setPartOf(Organization arg);

		 List<OrganizationalContact> getContact();

		 void setContact(List<OrganizationalContact> arg);

		public void addContact(OrganizationalContact arg);

}