package org.reimagineehr.model.quick.r4.wrapper.other;

import org.reimagineehr.model.quick.api.other.Medication;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Ratio;
import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.backbone.MedicationBatch;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationWrapper implements Medication {

	private org.hl7.fhir.r4.model.Medication adaptee;

	public MedicationWrapper() {
	
	}

	public MedicationWrapper(org.hl7.fhir.r4.model.Medication adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Medication getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Medication arg) {
		this.adaptee=arg;
	}

	public String getId() {
	return this.adaptee.getIdElement().getValue();
	}

	public void setId(String arg) {
	this.adaptee.setId(arg);
	}

	public Meta getMeta() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.MetaWrapper(this.adaptee.getMeta());
	}

	public void setMeta(Meta arg) {
	
		this.adaptee.setMeta(((org.reimagineehr.model.quick.r4.wrapper.datatype.MetaWrapper)arg).getAdaptee());
	}

	public String getImplicitRules() {
	return this.adaptee.getImplicitRulesElement().getValue();
	}

	public void setImplicitRules(String arg) {
	this.adaptee.setImplicitRules(arg);
	}

	public String getLanguage() {
	return this.adaptee.getLanguageElement().getValue();
	}

	public void setLanguage(String arg) {
	this.adaptee.setLanguage(arg);
	}

	public Narrative getText() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.NarrativeWrapper(this.adaptee.getText());
	}

	public void setText(Narrative arg) {
	
		this.adaptee.setText(((org.reimagineehr.model.quick.r4.wrapper.datatype.NarrativeWrapper)arg).getAdaptee());
	}

	public List<Identifier> getIdentifier() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setIdentifier(java.util.List<Identifier> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addIdentifier(Identifier arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public String getStatus() {
		if (this.adaptee.getStatus() != null) {
			return this.adaptee.getStatus().toCode();
		} else {
			return null;
		}
	}

	public void setStatus(String arg) {
		if (arg != null) {
			this.adaptee.setStatus(org.hl7.fhir.r4.model.Medication.MedicationStatus.fromCode(arg));
		}
	}

	public Organization getManufacturer() {
		return new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization)((org.hl7.fhir.r4.model.Reference)this.adaptee.getManufacturer()).getResource());
	}

	public void setManufacturer(Organization arg) {
		this.adaptee.setManufacturer(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public CodeableConcept getForm() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getForm());
	}

	public void setForm(CodeableConcept arg) {
	this.adaptee.setForm(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public Ratio getAmount() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setAmount(Ratio arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<Ingredient> getIngredient() {
		List<org.reimagineehr.model.quick.api.backbone.Ingredient> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent> items = this.adaptee.getIngredient();
		for(org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.IngredientWrapper(item));
		}
		return returnList;
	}

	public void setIngredient(java.util.List<Ingredient> arg) {
		List<org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.Ingredient item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.IngredientWrapper)item).getAdaptee());
		}
		this.adaptee.setIngredient(targetList);
	}

	public void addIngredient(Ingredient arg) {
		this.adaptee.addIngredient(((org.reimagineehr.model.quick.r4.wrapper.backbone.IngredientWrapper)arg).getAdaptee());
	}

	public MedicationBatch getBatch() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setBatch(MedicationBatch arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

}