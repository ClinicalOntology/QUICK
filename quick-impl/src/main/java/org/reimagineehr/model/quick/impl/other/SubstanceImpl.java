package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Substance;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.SubstancePackage;
import org.reimagineehr.model.quick.api.backbone.Ingredient;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SubstanceImpl extends DomainResourceImpl implements Substance {

	private List<Identifier> identifier;
	private String status;
	private List<CodeableConcept> category;
	private CodeableConcept code;
	private String description;
	private List<SubstancePackage> instance;
	private List<Ingredient> ingredient;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public List<CodeableConcept> getCategory() {
		return this.category;
	}

	public void setCategory(List<CodeableConcept> arg) {
		this.category=arg;
	}

	public void addCategory(CodeableConcept arg) {
		this.category.add(arg);
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String arg) {
		this.description=arg;
	}

	public List<SubstancePackage> getInstance() {
		return this.instance;
	}

	public void setInstance(List<SubstancePackage> arg) {
		this.instance=arg;
	}

	public void addInstance(SubstancePackage arg) {
		this.instance.add(arg);
	}

	public List<Ingredient> getIngredient() {
		return this.ingredient;
	}

	public void setIngredient(List<Ingredient> arg) {
		this.ingredient=arg;
	}

	public void addIngredient(Ingredient arg) {
		this.ingredient.add(arg);
	}

}