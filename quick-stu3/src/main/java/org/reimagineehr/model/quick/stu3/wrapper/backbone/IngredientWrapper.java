package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Ingredient;
import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Ratio;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IngredientWrapper implements Ingredient {

	private org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent adaptee;

	public IngredientWrapper() {
	
	}

	public IngredientWrapper(org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent arg) {
		this.adaptee=arg;
	}

	public ResourceOrCodeChoice getItem() {
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getItem();
		if (type instanceof org.hl7.fhir.dstu3.model.Reference) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)this.adaptee.getItemReference().getResource();
			if  (resource instanceof org.hl7.fhir.dstu3.model.Medication) {
				choice = new org.reimagineehr.model.quick.stu3.wrapper.other.MedicationWrapper((org.hl7.fhir.dstu3.model.Medication) resource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if (!(type instanceof org.hl7.fhir.dstu3.model.Reference)){
			if  (type instanceof org.hl7.fhir.dstu3.model.CodeableConcept) {
				choice = org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept)type);
			} else { throw new RuntimeException("Unsupported type");}
		}
		return new org.reimagineehr.model.quick.impl.choice.ResourceOrCodeChoiceImpl(choice);
	}

	public void setItem(ResourceOrCodeChoice arg) {
	
		org.reimagineehr.model.quick.api.resource.DomainResource domainResource = arg.getResource();
		Object element = arg.getCode();
		if(domainResource != null) {
			if  (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.stu3.wrapper.other.MedicationWrapper) {
				this.adaptee.setItem(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.stu3.wrapper.other.MedicationWrapper) domainResource).getAdaptee()));
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if(element != null) {
			if  (element instanceof org.reimagineehr.model.quick.api.datatype.CodeableConcept) {
				this.adaptee.setItem(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept((org.reimagineehr.model.quick.api.datatype.CodeableConcept)element));
			} else { throw new RuntimeException("Unsupported type");}
		}
	}

	public Boolean getIsActive() {
	return this.adaptee.getIsActiveElement().getValue();
	}

	public void setIsActive(Boolean arg) {
	this.adaptee.setIsActive(arg);
	}

	public Ratio getStrength() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper(this.adaptee.getAmount());
	}

	public void setStrength(Ratio arg) {
	
		this.adaptee.setAmount(((org.reimagineehr.model.quick.stu3.wrapper.datatype.RatioWrapper)arg).getAdaptee());
	}

}