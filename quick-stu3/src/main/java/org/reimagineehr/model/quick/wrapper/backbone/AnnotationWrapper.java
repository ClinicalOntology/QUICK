package org.reimagineehr.model.quick.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Annotation;
import org.reimagineehr.model.quick.api.choice.ResourceOrStringChoice;
import java.util.Date;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class AnnotationWrapper implements Annotation {

	private org.hl7.fhir.dstu3.model.Annotation adaptee;

	public AnnotationWrapper() {
	
	}

	public AnnotationWrapper(org.hl7.fhir.dstu3.model.Annotation adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Annotation getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Annotation arg) {
		this.adaptee=arg;
	}

	public ResourceOrStringChoice getAuthor() {
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getAuthor();
		if (type instanceof org.hl7.fhir.dstu3.model.Reference) {
			org.hl7.fhir.dstu3.model.Resource resource = (org.hl7.fhir.dstu3.model.Resource)this.adaptee.getAuthorReference().getResource();
			if  (resource instanceof org.hl7.fhir.dstu3.model.Practitioner) {
				choice = new org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper((org.hl7.fhir.dstu3.model.Practitioner) resource);
			} else if (resource instanceof org.hl7.fhir.dstu3.model.Patient) {
				choice = new org.reimagineehr.model.quick.wrapper.party.PatientWrapper((org.hl7.fhir.dstu3.model.Patient) resource);
			} else if (resource instanceof org.hl7.fhir.dstu3.model.RelatedPerson) {
				choice = new org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.dstu3.model.RelatedPerson) resource);
			} else if (resource instanceof org.hl7.fhir.dstu3.model.Organization) {
				choice = new org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper((org.hl7.fhir.dstu3.model.Organization) resource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if (!(type instanceof org.hl7.fhir.dstu3.model.Reference)){
			if  (type instanceof org.hl7.fhir.dstu3.model.StringType) {
				choice = ((org.hl7.fhir.dstu3.model.StringType) type).getValue();
			} else { throw new RuntimeException("Unsupported type");}
		}
		return new org.reimagineehr.model.quick.impl.choice.ResourceOrStringChoiceImpl(choice);
	}

	public void setAuthor(ResourceOrStringChoice arg) {
	
		org.reimagineehr.model.quick.api.resource.DomainResource domainResource = arg.getResource();
		Object element = arg.getString();
		if(domainResource != null) {
			if  (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) {
				this.adaptee.setAuthor(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.PractitionerWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.wrapper.party.PatientWrapper) {
				this.adaptee.setAuthor(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.PatientWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) {
				this.adaptee.setAuthor(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.RelatedPersonWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) {
				this.adaptee.setAuthor(new org.hl7.fhir.dstu3.model.Reference(((org.reimagineehr.model.quick.wrapper.party.OrganizationWrapper) domainResource).getAdaptee()));
			} else { throw new RuntimeException("Unsupported resource type");}
		} else if(element != null) {
			if  (element instanceof String) {
				this.adaptee.setAuthor(new org.hl7.fhir.dstu3.model.StringType((String) element));
			} else { throw new RuntimeException("Unsupported type");}
		}
	}

	public Date getTime() {
	return this.adaptee.getTimeElement().getValue();
	}

	public void setTime(Date arg) {
	this.adaptee.setTime(arg);
	}

	public String getText() {
	return this.adaptee.getTextElement().getValue();
	}

	public void setText(String arg) {
	this.adaptee.setText(arg);
	}

}