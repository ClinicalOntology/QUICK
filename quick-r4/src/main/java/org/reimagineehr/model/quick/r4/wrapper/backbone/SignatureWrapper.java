package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.Signature;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import java.lang.String;
import java.lang.Byte;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SignatureWrapper implements Signature {

	private org.hl7.fhir.r4.model.Signature adaptee;

	public SignatureWrapper() {
	
	}

	public SignatureWrapper(org.hl7.fhir.r4.model.Signature adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Signature getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Signature arg) {
		this.adaptee=arg;
	}

	public List<Coding> getType() {
		return org.reimagineehr.model.quick.r4.utils.R4Utils.getAsQuickCoding(this.adaptee.getType());
	}

	public void setType(java.util.List<Coding> arg) {
		this.adaptee.setType(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCoding(arg));
	}

	public void addType(Coding arg) {
		this.adaptee.addType(org.reimagineehr.model.quick.r4.utils.R4Utils.getAsFhirCoding(arg));
	}

	public Date getWhen() {
	return this.adaptee.getWhenElement().getValue();
	}

	public void setWhen(Date arg) {
	this.adaptee.setWhen(arg);
	}

	public Party getWho() {
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getWho();
		if (type instanceof org.hl7.fhir.r4.model.Reference) {
			org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)this.adaptee.getWhoReference().getResource();
			if  (resource instanceof org.hl7.fhir.r4.model.Practitioner) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Patient) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.RelatedPerson) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.r4.model.RelatedPerson) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Device) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper((org.hl7.fhir.r4.model.Device) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Organization) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization) resource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else { throw new RuntimeException("QUICK does not support type " + type.getClass().getName() + " for property 'who'");}
		return (Party)choice;
	}

	public void setWho(Party arg) {
	
		org.reimagineehr.model.quick.api.primitive.Element domainResource = arg;
		if(domainResource != null) {
			if  (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) {
				this.adaptee.setWho(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) {
				this.adaptee.setWho(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) {
				this.adaptee.setWho(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper) {
				this.adaptee.setWho(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper) {
				this.adaptee.setWho(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper) domainResource).getAdaptee()));
			} else { throw new RuntimeException("Unsupported resource type");}
		}
	}

	public Party getOnBehalfOf() {
		Object choice = null;
		org.hl7.fhir.r4.model.Type type = this.adaptee.getOnBehalfOf();
		if (type instanceof org.hl7.fhir.r4.model.Reference) {
			org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)this.adaptee.getOnBehalfOfReference().getResource();
			if  (resource instanceof org.hl7.fhir.r4.model.Practitioner) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Patient) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.RelatedPerson) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper((org.hl7.fhir.r4.model.RelatedPerson) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Device) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper((org.hl7.fhir.r4.model.Device) resource);
			} else if (resource instanceof org.hl7.fhir.r4.model.Organization) {
				choice = new org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper((org.hl7.fhir.r4.model.Organization) resource);
			} else { throw new RuntimeException("Unsupported resource type");}
		} else { throw new RuntimeException("QUICK does not support type " + type.getClass().getName() + " for property 'onBehalfOf'");}
		return (Party)choice;
	}

	public void setOnBehalfOf(Party arg) {
	
		org.reimagineehr.model.quick.api.primitive.Element domainResource = arg;
		if(domainResource != null) {
			if  (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) {
				this.adaptee.setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) {
				this.adaptee.setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) {
				this.adaptee.setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.RelatedPersonWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper) {
				this.adaptee.setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper) domainResource).getAdaptee()));
			} else if (domainResource != null && domainResource instanceof org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper) {
				this.adaptee.setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(((org.reimagineehr.model.quick.r4.wrapper.party.OrganizationWrapper) domainResource).getAdaptee()));
			} else { throw new RuntimeException("Unsupported resource type");}
		}
	}

	public String getTargetFormat() {
	return this.adaptee.getTargetFormatElement().getValue();
	}

	public void setTargetFormat(String arg) {
	this.adaptee.setTargetFormat(arg);
	}

	public String getSigFormat() {
	return this.adaptee.getSigFormatElement().getValue();
	}

	public void setSigFormat(String arg) {
	this.adaptee.setSigFormat(arg);
	}

	public Byte[] getData() {
		byte[] bytes = this.adaptee.getData();
		return org.apache.commons.lang3.ArrayUtils.toObject(bytes);
	}

	public void setData(Byte[] arg) {
		this.adaptee.setData(org.apache.commons.lang3.ArrayUtils.toPrimitive(arg));
	}

}