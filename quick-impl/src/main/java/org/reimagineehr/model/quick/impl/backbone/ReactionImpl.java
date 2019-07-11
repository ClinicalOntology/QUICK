package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Reaction;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.Annotation;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ReactionImpl extends BackboneElementImpl implements Reaction {

	private CodeableConcept substance;
	private List<CodeableConcept> manifestation;
	private String description;
	private Date onset;
	private String severity;
	private CodeableConcept exposureRoute;
	private Annotation note;

	public CodeableConcept getSubstance() {
		return this.substance;
	}

	public void setSubstance(CodeableConcept arg) {
		this.substance=arg;
	}

	public List<CodeableConcept> getManifestation() {
		return this.manifestation;
	}

	public void setManifestation(List<CodeableConcept> arg) {
		this.manifestation=arg;
	}

	public void addManifestation(CodeableConcept arg) {
		this.manifestation.add(arg);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String arg) {
		this.description=arg;
	}

	public Date getOnset() {
		return this.onset;
	}

	public void setOnset(Date arg) {
		this.onset=arg;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String arg) {
		this.severity=arg;
	}

	public CodeableConcept getExposureRoute() {
		return this.exposureRoute;
	}

	public void setExposureRoute(CodeableConcept arg) {
		this.exposureRoute=arg;
	}

	public Annotation getNote() {
		return this.note;
	}

	public void setNote(Annotation arg) {
		this.note=arg;
	}

}