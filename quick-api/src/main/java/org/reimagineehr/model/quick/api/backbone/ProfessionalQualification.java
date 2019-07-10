package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface ProfessionalQualification extends BackboneElement {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Organization getIssuer();

		 void setIssuer(Organization arg);

}