package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Slot;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.other.Schedule;
import java.lang.String;
import java.util.Date;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class SlotImpl extends DomainResourceImpl implements Slot {

	private List<Identifier> identifier;
	private List<CodeableConcept> serviceCategory;
	private List<CodeableConcept> serviceType;
	private List<CodeableConcept> specialty;
	private CodeableConcept appointmentType;
	private Schedule schedule;
	private String status;
	private Date start;
	private Date end;
	private Boolean overbooked;
	private String comment;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public List<CodeableConcept> getServiceCategory() {
		return this.serviceCategory;
	}

	public void setServiceCategory(List<CodeableConcept> arg) {
		this.serviceCategory=arg;
	}

	public void addServiceCategory(CodeableConcept arg) {
		this.serviceCategory.add(arg);
	}

	public List<CodeableConcept> getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(List<CodeableConcept> arg) {
		this.serviceType=arg;
	}

	public void addServiceType(CodeableConcept arg) {
		this.serviceType.add(arg);
	}

	public List<CodeableConcept> getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(List<CodeableConcept> arg) {
		this.specialty=arg;
	}

	public void addSpecialty(CodeableConcept arg) {
		this.specialty.add(arg);
	}

	public CodeableConcept getAppointmentType() {
		return this.appointmentType;
	}

	public void setAppointmentType(CodeableConcept arg) {
		this.appointmentType=arg;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule arg) {
		this.schedule=arg;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date arg) {
		this.start=arg;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date arg) {
		this.end=arg;
	}

	public Boolean getOverbooked() {
		return this.overbooked;
	}

	public void setOverbooked(Boolean arg) {
		this.overbooked=arg;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String arg) {
		this.comment=arg;
	}

}