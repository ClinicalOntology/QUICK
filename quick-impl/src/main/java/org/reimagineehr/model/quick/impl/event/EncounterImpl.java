package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.event.Appointment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.backbone.EncounterDiagnosisOrProcedure;
import org.reimagineehr.model.quick.api.backbone.Hospitalization;
import org.reimagineehr.model.quick.api.backbone.PatientLocation;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class EncounterImpl extends EventImpl implements Encounter {

	private Coding encounterClass;
	private List<CodeableConcept> type;
	private CodeableConcept serviceType;
	private CodeableConcept priority;
	private List<Appointment> appointment;
	private Period period;
	private Duration length;
	private List<EncounterDiagnosisOrProcedure> diagnosisOrProcedure;
	private Hospitalization hospitalization;
	private List<PatientLocation> location;
	private Organization serviceProvider;
	private Encounter partOf;

	public Coding getEncounterClass() {
		return this.encounterClass;
	}

	public void setEncounterClass(Coding arg) {
		this.encounterClass=arg;
	}

	public List<CodeableConcept> getType() {
		return this.type;
	}

	public void setType(List<CodeableConcept> arg) {
		this.type=arg;
	}

	public void addType(CodeableConcept arg) {
		this.type.add(arg);
	}

	public CodeableConcept getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(CodeableConcept arg) {
		this.serviceType=arg;
	}

	public CodeableConcept getPriority() {
		return this.priority;
	}

	public void setPriority(CodeableConcept arg) {
		this.priority=arg;
	}

	public List<Appointment> getAppointment() {
		return this.appointment;
	}

	public void setAppointment(List<Appointment> arg) {
		this.appointment=arg;
	}

	public void addAppointment(Appointment arg) {
		this.appointment.add(arg);
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Duration getLength() {
		return this.length;
	}

	public void setLength(Duration arg) {
		this.length=arg;
	}

	public List<EncounterDiagnosisOrProcedure> getDiagnosisOrProcedure() {
		return this.diagnosisOrProcedure;
	}

	public void setDiagnosisOrProcedure(List<EncounterDiagnosisOrProcedure> arg) {
		this.diagnosisOrProcedure=arg;
	}

	public void addDiagnosisOrProcedure(EncounterDiagnosisOrProcedure arg) {
		this.diagnosisOrProcedure.add(arg);
	}

	public Hospitalization getHospitalization() {
		return this.hospitalization;
	}

	public void setHospitalization(Hospitalization arg) {
		this.hospitalization=arg;
	}

	public List<PatientLocation> getLocation() {
		return this.location;
	}

	public void setLocation(List<PatientLocation> arg) {
		this.location=arg;
	}

	public void addLocation(PatientLocation arg) {
		this.location.add(arg);
	}

	public Organization getServiceProvider() {
		return this.serviceProvider;
	}

	public void setServiceProvider(Organization arg) {
		this.serviceProvider=arg;
	}

	public Encounter getPartOf() {
		return this.partOf;
	}

	public void setPartOf(Encounter arg) {
		this.partOf=arg;
	}

}