package org.reimagineehr.model.quick.impl.request;

import org.reimagineehr.model.quick.impl.request.RequestImpl;
import org.reimagineehr.model.quick.api.request.MedicationRequest;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.backbone.DispenseRequest;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.MedicationOrCodeChoice;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class MedicationRequestImpl extends RequestImpl implements MedicationRequest {

	private List<DosageInstruction> dosageInstruction;
	private DispenseRequest dispenseRequest;
	private List<CodeableConcept> category;
	private MedicationOrCodeChoice medication;
	private Boolean doNotPerform;

	public List<DosageInstruction> getDosageInstruction() {
		return this.dosageInstruction;
	}

	public void setDosageInstruction(List<DosageInstruction> arg) {
		this.dosageInstruction=arg;
	}

	public void addDosageInstruction(DosageInstruction arg) {
		this.dosageInstruction.add(arg);
	}

	public DispenseRequest getDispenseRequest() {
		return this.dispenseRequest;
	}

	public void setDispenseRequest(DispenseRequest arg) {
		this.dispenseRequest=arg;
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

	public MedicationOrCodeChoice getMedication() {
		return this.medication;
	}

	public void setMedication(MedicationOrCodeChoice arg) {
		this.medication=arg;
	}

	public Boolean getDoNotPerform() {
		return this.doNotPerform;
	}

	public void setDoNotPerform(Boolean arg) {
		this.doNotPerform=arg;
	}

}