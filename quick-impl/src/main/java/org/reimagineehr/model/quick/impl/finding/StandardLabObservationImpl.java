package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.api.finding.StandardLabObservation;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;
import org.reimagineehr.model.quick.api.party.Organization;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import org.reimagineehr.model.quick.api.other.Specimen;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class StandardLabObservationImpl implements StandardLabObservation {

	private Identifier accessionNumber;
	private Identifier fillerOrderNumber;
	private Identifier placerOrderNumber;
	private String resultStatus;
	private CodeableConcept reportingPriority;
	private CodeableConcept interpretation;
	private List<IndividualCareGiver> responsibleObserver;
	private Organization performingLaboratory;
	private IndividualCareGiver performingOrganizationMedicalDirector;
	private Date resultedDateTime;
	private IndividualCareRecipient focalSubject;
	private Specimen specimenCollected;
	private Date specimenReceivedByLab;

	public Identifier getAccessionNumber() {
		return this.accessionNumber;
	}

	public void setAccessionNumber(Identifier arg) {
		this.accessionNumber=arg;
	}

	public Identifier getFillerOrderNumber() {
		return this.fillerOrderNumber;
	}

	public void setFillerOrderNumber(Identifier arg) {
		this.fillerOrderNumber=arg;
	}

	public Identifier getPlacerOrderNumber() {
		return this.placerOrderNumber;
	}

	public void setPlacerOrderNumber(Identifier arg) {
		this.placerOrderNumber=arg;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}

	public void setResultStatus(String arg) {
		this.resultStatus=arg;
	}

	public CodeableConcept getReportingPriority() {
		return this.reportingPriority;
	}

	public void setReportingPriority(CodeableConcept arg) {
		this.reportingPriority=arg;
	}

	public CodeableConcept getInterpretation() {
		return this.interpretation;
	}

	public void setInterpretation(CodeableConcept arg) {
		this.interpretation=arg;
	}

	public List<IndividualCareGiver> getResponsibleObserver() {
		return this.responsibleObserver;
	}

	public void setResponsibleObserver(List<IndividualCareGiver> arg) {
		this.responsibleObserver=arg;
	}

	public void addResponsibleObserver(IndividualCareGiver arg) {
		this.responsibleObserver.add(arg);
	}

	public Organization getPerformingLaboratory() {
		return this.performingLaboratory;
	}

	public void setPerformingLaboratory(Organization arg) {
		this.performingLaboratory=arg;
	}

	public IndividualCareGiver getPerformingOrganizationMedicalDirector() {
		return this.performingOrganizationMedicalDirector;
	}

	public void setPerformingOrganizationMedicalDirector(IndividualCareGiver arg) {
		this.performingOrganizationMedicalDirector=arg;
	}

	public Date getResultedDateTime() {
		return this.resultedDateTime;
	}

	public void setResultedDateTime(Date arg) {
		this.resultedDateTime=arg;
	}

	public IndividualCareRecipient getFocalSubject() {
		return this.focalSubject;
	}

	public void setFocalSubject(IndividualCareRecipient arg) {
		this.focalSubject=arg;
	}

	public Specimen getSpecimenCollected() {
		return this.specimenCollected;
	}

	public void setSpecimenCollected(Specimen arg) {
		this.specimenCollected=arg;
	}

	public Date getSpecimenReceivedByLab() {
		return this.specimenReceivedByLab;
	}

	public void setSpecimenReceivedByLab(Date arg) {
		this.specimenReceivedByLab=arg;
	}

}