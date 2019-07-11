package org.reimagineehr.model.quick.api.other;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Schedule extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 Boolean getActive();

		 void setActive(Boolean arg);

		 List<CodeableConcept> getServiceCategory();

		 void setServiceCategory(List<CodeableConcept> arg);

		public void addServiceCategory(CodeableConcept arg);

		 List<CodeableConcept> getServiceType();

		 void setServiceType(List<CodeableConcept> arg);

		public void addServiceType(CodeableConcept arg);

		 List<CodeableConcept> getSpecialty();

		 void setSpecialty(List<CodeableConcept> arg);

		public void addSpecialty(CodeableConcept arg);

		 List<Party> getActor();

		 void setActor(List<Party> arg);

		public void addActor(Party arg);

		 Period getPlanningHorizon();

		 void setPlanningHorizon(Period arg);

		 String getComment();

		 void setComment(String arg);

}