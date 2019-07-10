package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Hospitalization;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.choice.OrganizationLocationChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class HospitalizationImpl extends BackboneElementImpl implements Hospitalization {

	private Identifier preAdmissionIdentifier;
	private OrganizationLocationChoice origin;
	private CodeableConcept admitSource;
	private CodeableConcept reAdmission;
	private List<CodeableConcept> dietPreference;
	private List<CodeableConcept> specialCourtesy;
	private List<CodeableConcept> specialArrangement;
	private OrganizationLocationChoice destination;
	private CodeableConcept dischargeDisposition;

	public Identifier getPreAdmissionIdentifier() {
		return this.preAdmissionIdentifier;
	}

	public void setPreAdmissionIdentifier(Identifier arg) {
		this.preAdmissionIdentifier=arg;
	}

	public OrganizationLocationChoice getOrigin() {
		return this.origin;
	}

	public void setOrigin(OrganizationLocationChoice arg) {
		this.origin=arg;
	}

	public CodeableConcept getAdmitSource() {
		return this.admitSource;
	}

	public void setAdmitSource(CodeableConcept arg) {
		this.admitSource=arg;
	}

	public CodeableConcept getReAdmission() {
		return this.reAdmission;
	}

	public void setReAdmission(CodeableConcept arg) {
		this.reAdmission=arg;
	}

	public List<CodeableConcept> getDietPreference() {
		return this.dietPreference;
	}

	public void setDietPreference(List<CodeableConcept> arg) {
		this.dietPreference=arg;
	}

	public void addDietPreference(CodeableConcept arg) {
		this.dietPreference.add(arg);
	}

	public List<CodeableConcept> getSpecialCourtesy() {
		return this.specialCourtesy;
	}

	public void setSpecialCourtesy(List<CodeableConcept> arg) {
		this.specialCourtesy=arg;
	}

	public void addSpecialCourtesy(CodeableConcept arg) {
		this.specialCourtesy.add(arg);
	}

	public List<CodeableConcept> getSpecialArrangement() {
		return this.specialArrangement;
	}

	public void setSpecialArrangement(List<CodeableConcept> arg) {
		this.specialArrangement=arg;
	}

	public void addSpecialArrangement(CodeableConcept arg) {
		this.specialArrangement.add(arg);
	}

	public OrganizationLocationChoice getDestination() {
		return this.destination;
	}

	public void setDestination(OrganizationLocationChoice arg) {
		this.destination=arg;
	}

	public CodeableConcept getDischargeDisposition() {
		return this.dischargeDisposition;
	}

	public void setDischargeDisposition(CodeableConcept arg) {
		this.dischargeDisposition=arg;
	}

}