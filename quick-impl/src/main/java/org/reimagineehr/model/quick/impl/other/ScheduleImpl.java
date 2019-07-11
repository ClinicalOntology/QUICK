package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Schedule;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ScheduleImpl extends DomainResourceImpl implements Schedule {

	private List<Identifier> identifier;
	private Boolean active;
	private List<CodeableConcept> serviceCategory;
	private List<CodeableConcept> serviceType;
	private List<CodeableConcept> specialty;
	private List<Party> actor;
	private Period planningHorizon;
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

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
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

	public List<Party> getActor() {
		return this.actor;
	}

	public void setActor(List<Party> arg) {
		this.actor=arg;
	}

	public void addActor(Party arg) {
		this.actor.add(arg);
	}

	public Period getPlanningHorizon() {
		return this.planningHorizon;
	}

	public void setPlanningHorizon(Period arg) {
		this.planningHorizon=arg;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String arg) {
		this.comment=arg;
	}

}