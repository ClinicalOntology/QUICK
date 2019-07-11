package org.reimagineehr.model.quick.api.other;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.backbone.MedicationBatch;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Medication extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 String getStatus();

		 void setStatus(String arg);

		 Organization getManufacturer();

		 void setManufacturer(Organization arg);

		 CodeableConcept getForm();

		 void setForm(CodeableConcept arg);

		 Ratio getAmount();

		 void setAmount(Ratio arg);

		 List<Ingredient> getIngredient();

		 void setIngredient(List<Ingredient> arg);

		public void addIngredient(Ingredient arg);

		 MedicationBatch getBatch();

		 void setBatch(MedicationBatch arg);

}