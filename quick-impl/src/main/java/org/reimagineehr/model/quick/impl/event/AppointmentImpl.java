package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.Appointment;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import java.lang.String;
import org.reimagineehr.model.quick.api.resource.Resource;
import java.util.Date;
import org.reimagineehr.model.quick.api.other.Slot;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class AppointmentImpl extends EventImpl implements Appointment {

	private List<CodeableConcept> serviceCategory;
	private List<CodeableConcept> serviceType;
	private List<CodeableConcept> specialty;
	private CodeableConcept appointmentTime;
	private Integer priority;
	private String description;
	private List<Resource> supportingInformation;
	private Date start;
	private Date stop;
	private Integer minutesDuration;
	private List<Slot> slot;
	private Date created;
	private String comment;
	private String patientInstruction;
	private List<Participation> participant;
	private List<Period> requestedPeriod;

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

	public CodeableConcept getAppointmentTime() {
		return this.appointmentTime;
	}

	public void setAppointmentTime(CodeableConcept arg) {
		this.appointmentTime=arg;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer arg) {
		this.priority=arg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String arg) {
		this.description=arg;
	}

	public List<Resource> getSupportingInformation() {
		return this.supportingInformation;
	}

	public void setSupportingInformation(List<Resource> arg) {
		this.supportingInformation=arg;
	}

	public void addSupportingInformation(Resource arg) {
		this.supportingInformation.add(arg);
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date arg) {
		this.start=arg;
	}

	public Date getStop() {
		return this.stop;
	}

	public void setStop(Date arg) {
		this.stop=arg;
	}

	public Integer getMinutesDuration() {
		return this.minutesDuration;
	}

	public void setMinutesDuration(Integer arg) {
		this.minutesDuration=arg;
	}

	public List<Slot> getSlot() {
		return this.slot;
	}

	public void setSlot(List<Slot> arg) {
		this.slot=arg;
	}

	public void addSlot(Slot arg) {
		this.slot.add(arg);
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date arg) {
		this.created=arg;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String arg) {
		this.comment=arg;
	}

	public String getPatientInstruction() {
		return this.patientInstruction;
	}

	public void setPatientInstruction(String arg) {
		this.patientInstruction=arg;
	}

	public List<Participation> getParticipant() {
		return this.participant;
	}

	public void setParticipant(List<Participation> arg) {
		this.participant=arg;
	}

	public void addParticipant(Participation arg) {
		this.participant.add(arg);
	}

	public List<Period> getRequestedPeriod() {
		return this.requestedPeriod;
	}

	public void setRequestedPeriod(List<Period> arg) {
		this.requestedPeriod=arg;
	}

	public void addRequestedPeriod(Period arg) {
		this.requestedPeriod.add(arg);
	}

}