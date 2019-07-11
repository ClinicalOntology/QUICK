package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Medication;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.backbone.MedicationBatch;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationImpl extends DomainResourceImpl implements Medication {

	private List<Identifier> identifier;
	private CodeableConcept code;
	private String status;
	private Organization manufacturer;
	private CodeableConcept form;
	private Ratio amount;
	private List<Ingredient> ingredient;
	private MedicationBatch batch;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public Organization getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Organization arg) {
		this.manufacturer=arg;
	}

	public CodeableConcept getForm() {
		return this.form;
	}

	public void setForm(CodeableConcept arg) {
		this.form=arg;
	}

	public Ratio getAmount() {
		return this.amount;
	}

	public void setAmount(Ratio arg) {
		this.amount=arg;
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

	public MedicationBatch getBatch() {
		return this.batch;
	}

	public void setBatch(MedicationBatch arg) {
		this.batch=arg;
	}

}