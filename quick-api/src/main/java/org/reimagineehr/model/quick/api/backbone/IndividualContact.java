package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.Contact;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface IndividualContact extends Contact {


		 List<CodeableConcept> getRelationship();

		 void setRelationship(List<CodeableConcept> arg);

		public void addRelationship(CodeableConcept arg);

		 String getGender();

		 void setGender(String arg);

		 Organization getOrganization();

		 void setOrganization(Organization arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}