package org.reimagineehr.model.quick.api.other;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.SubstancePackage;
import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Substance extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 String getStatus();

		 void setStatus(String arg);

		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 String getDescription();

		 void setDescription(String arg);

		 List<SubstancePackage> getInstance();

		 void setInstance(List<SubstancePackage> arg);

		public void addInstance(SubstancePackage arg);

		 List<Ingredient> getIngredient();

		 void setIngredient(List<Ingredient> arg);

		public void addIngredient(Ingredient arg);

}