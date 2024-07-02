package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.DispenseRequest;
import org.reimagineehr.model.quick.api.backbone.InitialFill;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DispenseRequestWrapper implements DispenseRequest {

	private org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestDispenseRequestComponent adaptee;

	public DispenseRequestWrapper() {
	
	}

	public DispenseRequestWrapper(org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestDispenseRequestComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestDispenseRequestComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestDispenseRequestComponent arg) {
		this.adaptee=arg;
	}

	public InitialFill getInitialFill() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setInitialFill(InitialFill arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Duration getDispenseInterval() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setDispenseInterval(Duration arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public Period getValidityPeriod() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.PeriodWrapper(this.adaptee.getValidityPeriod());
	}

	public void setValidityPeriod(Period arg) {
	
		this.adaptee.setValidityPeriod(((org.reimagineehr.model.quick.stu3.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public Integer getNumberOfRepeatsAllowed() {
	return this.adaptee.getNumberOfRepeatsAllowedElement().getValue();
	}

	public void setNumberOfRepeatsAllowed(Integer arg) {
	this.adaptee.setNumberOfRepeatsAllowed(arg);
	}

	public SimpleQuantity getQuantity() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper(this.adaptee.getQuantity());
	}

	public void setQuantity(SimpleQuantity arg) {
	
		this.adaptee.setQuantity(((org.reimagineehr.model.quick.stu3.wrapper.datatype.SimpleQuantityWrapper)arg).getAdaptee());
	}

	public Duration getExpectedSupplyDuration() {
	
		return new org.reimagineehr.model.quick.stu3.wrapper.datatype.DurationWrapper(this.adaptee.getExpectedSupplyDuration());
	}

	public void setExpectedSupplyDuration(Duration arg) {
	
		this.adaptee.setExpectedSupplyDuration(((org.reimagineehr.model.quick.stu3.wrapper.datatype.DurationWrapper)arg).getAdaptee());
	}

	public Organization getPerformer() {
		return new org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getPerformer()).getResource());
	}

	public void setPerformer(Organization arg) {
		this.adaptee.setPerformer(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

}