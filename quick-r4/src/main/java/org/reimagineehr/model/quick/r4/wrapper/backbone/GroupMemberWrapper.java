package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.GroupMember;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GroupMemberWrapper implements GroupMember {

	private org.hl7.fhir.r4.model.Group.GroupMemberComponent adaptee;

	public GroupMemberWrapper() {
	
	}

	public GroupMemberWrapper(org.hl7.fhir.r4.model.Group.GroupMemberComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Group.GroupMemberComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Group.GroupMemberComponent arg) {
		this.adaptee=arg;
	}

	public Party getEntity() {
		Party returnValue = null;
		org.hl7.fhir.r4.model.Reference reference = this.adaptee.getEntity();
		org.hl7.fhir.r4.model.Resource resource = (org.hl7.fhir.r4.model.Resource)reference.getResource();
		if(resource instanceof org.hl7.fhir.r4.model.Patient) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.PatientWrapper((org.hl7.fhir.r4.model.Patient)resource);}
		else if(resource instanceof org.hl7.fhir.r4.model.Practitioner) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.PractitionerWrapper((org.hl7.fhir.r4.model.Practitioner)resource);}
		else if(resource instanceof org.hl7.fhir.r4.model.Device) { returnValue = new org.reimagineehr.model.quick.r4.wrapper.party.DeviceWrapper((org.hl7.fhir.r4.model.Device)resource);}
		return returnValue;
	}

	public void setEntity(Party arg) {
		org.hl7.fhir.r4.model.Resource resource = ((org.reimagineehr.model.quick.r4.wrapper.api.Wrapper)arg).getAdaptee();
		org.hl7.fhir.r4.model.Reference reference = null;
		if(resource instanceof org.hl7.fhir.r4.model.Patient||resource instanceof org.hl7.fhir.r4.model.Practitioner||resource instanceof org.hl7.fhir.r4.model.Device) {
		reference = new org.hl7.fhir.r4.model.Reference();
		} else {
			throw new IllegalArgumentException(String.format("Unsupported type for attribute '%s' - %s" ,"entity", resource.getClass().getName()));
		}
		reference.setResource(resource);
		this.adaptee.setEntity(reference);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

	public Boolean getInactive() {
	return this.adaptee.getInactiveElement().getValue();
	}

	public void setInactive(Boolean arg) {
	this.adaptee.setInactive(arg);
	}

}