package org.reimagineehr.model.quick.r4.wrapper.party;

import org.reimagineehr.model.quick.api.party.PractitionerRole;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Practitioner;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.party.HealthcareService;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;
import org.reimagineehr.model.quick.api.backbone.NonAvailability;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PractitionerRoleWrapper implements PractitionerRole {

	private org.hl7.fhir.r4.model.PractitionerRole adaptee;

	public PractitionerRoleWrapper() {
	
	}

	public PractitionerRoleWrapper(org.hl7.fhir.r4.model.PractitionerRole adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.PractitionerRole getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.PractitionerRole arg) {
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
		List<org.reimagineehr.model.quick.api.datatype.Identifier> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.Identifier> items = this.adaptee.getIdentifier();
		for(org.hl7.fhir.r4.model.Identifier item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper(item));
		}
		return returnList;
	}

	public void setIdentifier(java.util.List<Identifier> arg) {
		List<org.hl7.fhir.r4.model.Identifier> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Identifier item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper)item).getAdaptee());
		}
		this.adaptee.setIdentifier(targetList);
	}

	public void addIdentifier(Identifier arg) {
		this.adaptee.addIdentifier(((org.reimagineehr.model.quick.r4.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public Boolean getActive() {
	return this.adaptee.getActiveElement().getValue();
	}

	public void setActive(Boolean arg) {
	this.adaptee.setActive(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public Practitioner getPractitioner() {
		return new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner)((org.hl7.fhir.r4.model.Reference)this.adaptee.getPractitioner()).getResource());
	}

	public void setPractitioner(Practitioner arg) {
		this.adaptee.setPractitioner(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper)arg).getAdaptee()));
	}

	public Organization getOrganization() {
		return new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization)((org.hl7.fhir.r4.model.Reference)this.adaptee.getOrganization()).getResource());
	}

	public void setOrganization(Organization arg) {
		this.adaptee.setOrganization(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper)arg).getAdaptee()));
	}

	public List<CodeableConcept> getCode() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCodeableConcept(this.adaptee.getCode());
	}

	public void setCode(java.util.List<CodeableConcept> arg) {
		this.adaptee.setCode(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public void addCode(CodeableConcept arg) {
		this.adaptee.addCode(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public List<CodeableConcept> getSpecialty() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCodeableConcept(this.adaptee.getSpecialty());
	}

	public void setSpecialty(java.util.List<CodeableConcept> arg) {
		this.adaptee.setSpecialty(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public void addSpecialty(CodeableConcept arg) {
		this.adaptee.addSpecialty(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCodeableConcept(arg));
	}

	public List<Location> getLocation() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setLocation(java.util.List<Location> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addLocation(Location arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<HealthcareService> getHealthcareService() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setHealthcareService(java.util.List<HealthcareService> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addHealthcareService(HealthcareService arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<ContactPoint> getTelecom() {
		List<org.reimagineehr.model.quick.api.backbone.ContactPoint> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.r4.model.ContactPoint> items = this.adaptee.getTelecom();
		for(org.hl7.fhir.r4.model.ContactPoint item : items) {
			returnList.add(new org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper(item));
		}
		return returnList;
	}

	public void setTelecom(java.util.List<ContactPoint> arg) {
		List<org.hl7.fhir.r4.model.ContactPoint> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.ContactPoint item : arg) {
			targetList.add(((org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper)item).getAdaptee());
		}
		this.adaptee.setTelecom(targetList);
	}

	public void addTelecom(ContactPoint arg) {
		this.adaptee.addTelecom(((org.reimagineehr.model.quick.r4.wrapper.backbone.ContactPointWrapper)arg).getAdaptee());
	}

	public List<AvailableTime> getAvailableTime() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setAvailableTime(java.util.List<AvailableTime> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addAvailableTime(AvailableTime arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public List<NonAvailability> getNotAvailable() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setNotAvailable(java.util.List<NonAvailability> arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void addNotAvailable(NonAvailability arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public String getAvailabilityExceptions() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

	public void setAvailabilityExceptions(String arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR R4)");
	}

}