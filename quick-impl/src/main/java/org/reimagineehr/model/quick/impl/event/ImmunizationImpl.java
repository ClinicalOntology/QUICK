package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.Immunization;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ImmunizationImpl extends EventImpl implements Immunization {

	private CodeableConcept vaccineCode;
	private Quantity doseQuantity;
	private CodeableConcept route;
	private Boolean primarySource;

	public CodeableConcept getVaccineCode() {
		return this.vaccineCode;
	}

	public void setVaccineCode(CodeableConcept arg) {
		this.vaccineCode=arg;
	}

	public Quantity getDoseQuantity() {
		return this.doseQuantity;
	}

	public void setDoseQuantity(Quantity arg) {
		this.doseQuantity=arg;
	}

	public CodeableConcept getRoute() {
		return this.route;
	}

	public void setRoute(CodeableConcept arg) {
		this.route=arg;
	}

	public Boolean getPrimarySource() {
		return this.primarySource;
	}

	public void setPrimarySource(Boolean arg) {
		this.primarySource=arg;
	}

}