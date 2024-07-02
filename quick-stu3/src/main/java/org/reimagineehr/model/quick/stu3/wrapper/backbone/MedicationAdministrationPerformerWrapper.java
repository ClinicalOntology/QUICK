package org.reimagineehr.model.quick.stu3.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Sun May 10 23:50:43 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MedicationAdministrationPerformerWrapper implements Participation {

	private org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent adaptee;

	public MedicationAdministrationPerformerWrapper() {
	
	}

	public MedicationAdministrationPerformerWrapper(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationPerformerComponent arg) {
		this.adaptee=arg;
	}

	public CodeableConcept getRole() {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-med-admin-performer-role");
		if(extensions != null && extensions.size() > 0) {
			org.hl7.fhir.dstu3.model.Extension extension = extensions.get(0);
			return org.reimagineehr.model.quick.utils.Stu3Utils.getAsQuickCodeableConcept((org.hl7.fhir.dstu3.model.CodeableConcept)extension.getValue());
		} else {
			return null;
		}
	}

	public void setRole(CodeableConcept arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Extension> extensions = this.adaptee.getExtensionsByUrl("http://example.com/extensions/my-med-admin-performer-role");
		org.hl7.fhir.dstu3.model.Extension extension = null;
		if(extensions == null || extensions.size() <= 0) {
			extension = this.adaptee.addExtension();
			extension.setUrl("http://example.com/extensions/my-med-admin-performer-role");
		} else {
			extension = extensions.get(0);
		}
			extension.setValue(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public Party getActor() {
		Party returnValue = null;
		org.hl7.fhir.dstu3.model.Reference reference = this.adaptee.getActor();
		org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.dstu3.model.Practitioner) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.PractitionerWrapper((org.hl7.fhir.dstu3.model.Practitioner)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.Patient) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson)resource);}
		else if(resource instanceof org.hl7.fhir.dstu3.model.Device) { returnValue = new org.reimagineehr.model.quick.stu3.wrapper.party.DeviceWrapper((org.hl7.fhir.dstu3.model.Device)resource);}
		return returnValue;
	}

	public void setActor(Party arg) {
		org.hl7.fhir.dstu3.model.Resource resource = ((org.reimagineehr.model.quick.stu3.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.dstu3.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.dstu3.model.Practitioner||resource instanceof org.hl7.fhir.dstu3.model.Patient||resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson||resource instanceof org.hl7.fhir.dstu3.model.Device) {
		reference = new org.hl7.fhir.dstu3.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"actor", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setActor(reference);
	}

	public Organization getOnBehalfOf() {
		return new org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization)((org.hl7.fhir.dstu3.model.Reference)this.adaptee.getOnBehalfOf()).getResource());
	}

	public void setOnBehalfOf(Organization arg) {
		this.adaptee.setOnBehalfOf(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.stu3.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public Period getPeriod() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setPeriod(Period arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getRequired() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setRequired(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public String getStatus() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setStatus(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

}