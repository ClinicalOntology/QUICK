package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.ObservationalFindingImpl;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ObservationComponent;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.other.Specimen;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ObservationImpl extends ObservationalFindingImpl implements Observation {

	private ObservationValueChoice value;
	private CodeableConcept method;
	private List<ObservationComponent> component;
	private CodeableConcept bodySite;
	private CodeableConcept dataAbsentReason;
	private CodeableConcept interpretation;
	private List<DomainResource> focus;
	private Specimen specimen;

	public ObservationValueChoice getValue() {
		return this.value;
	}

	public void setValue(ObservationValueChoice arg) {
		this.value=arg;
	}

	public CodeableConcept getMethod() {
		return this.method;
	}

	public void setMethod(CodeableConcept arg) {
		this.method=arg;
	}

	public List<ObservationComponent> getComponent() {
		return this.component;
	}

	public void setComponent(List<ObservationComponent> arg) {
		this.component=arg;
	}

	public void addComponent(ObservationComponent arg) {
		this.component.add(arg);
	}

	public CodeableConcept getBodySite() {
		return this.bodySite;
	}

	public void setBodySite(CodeableConcept arg) {
		this.bodySite=arg;
	}

	public CodeableConcept getDataAbsentReason() {
		return this.dataAbsentReason;
	}

	public void setDataAbsentReason(CodeableConcept arg) {
		this.dataAbsentReason=arg;
	}

	public CodeableConcept getInterpretation() {
		return this.interpretation;
	}

	public void setInterpretation(CodeableConcept arg) {
		this.interpretation=arg;
	}

	public List<DomainResource> getFocus() {
		return this.focus;
	}

	public void setFocus(List<DomainResource> arg) {
		this.focus=arg;
	}

	public void addFocus(DomainResource arg) {
		this.focus.add(arg);
	}

	public Specimen getSpecimen() {
		return this.specimen;
	}

	public void setSpecimen(Specimen arg) {
		this.specimen=arg;
	}

}