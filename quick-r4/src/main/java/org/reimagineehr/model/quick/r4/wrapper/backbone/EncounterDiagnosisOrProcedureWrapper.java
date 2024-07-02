package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.EncounterDiagnosisOrProcedure;
import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class EncounterDiagnosisOrProcedureWrapper implements EncounterDiagnosisOrProcedure {

	private org.hl7.fhir.r4.model.Encounter.DiagnosisComponent adaptee;

	public EncounterDiagnosisOrProcedureWrapper() {
	
	}

	public EncounterDiagnosisOrProcedureWrapper(org.hl7.fhir.r4.model.Encounter.DiagnosisComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Encounter.DiagnosisComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Encounter.DiagnosisComponent arg) {
		this.adaptee=arg;
	}

	public ConditionOrProcedureChoice getReference() {
	
		Object choice = null;
		org.hl7.fhir.r4.model.Reference reference = this.adaptee.getCondition();
		org.hl7.fhir.r4.model.DomainResource type = (org.hl7.fhir.r4.model.DomainResource)reference.getResource();
		if(type instanceof org.hl7.fhir.r4.model.Condition) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.finding.ConditionWrapper((org.hl7.fhir.r4.model.Condition)type);
		} else if(type instanceof org.hl7.fhir.r4.model.Procedure) {
			choice = new org.reimagineehr.model.quick.r4.wrapper.event.ProcedureWrapper((org.hl7.fhir.r4.model.Procedure)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.ConditionOrProcedureChoiceImpl(choice);
	}

	public void setReference(ConditionOrProcedureChoice arg) {
	
		ConditionOrProcedureChoice choice = arg;
		if(choice.getCondition() != null) {
			this.adaptee.setCondition(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.finding.ConditionWrapper)choice.getCondition()).getAdaptee()));
		}else if(choice.getProcedure() != null) {
			this.adaptee.setCondition(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.event.ProcedureWrapper)choice.getProcedure()).getAdaptee()));
		}
	}

	public CodeableConcept getUse() {
	return new org.reimagineehr.model.quick.r4.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getUse());
	}

	public void setUse(CodeableConcept arg) {
	this.adaptee.setUse(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public Integer getRank() {
	return this.adaptee.getRankElement().getValue();
	}

	public void setRank(Integer arg) {
	this.adaptee.setRank(arg);
	}

}