package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.ObservationComponent;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.util.List;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ObservationComponentImpl extends BackboneElementImpl implements ObservationComponent {

	private CodeableConcept code;
	private ObservationValueChoice value;
	private CodeableConcept dataAbsentReason;
	private List<CodeableConcept> interpretation;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public ObservationValueChoice getValue() {
		return this.value;
	}

	public void setValue(ObservationValueChoice arg) {
		this.value=arg;
	}

	public CodeableConcept getDataAbsentReason() {
		return this.dataAbsentReason;
	}

	public void setDataAbsentReason(CodeableConcept arg) {
		this.dataAbsentReason=arg;
	}

	public List<CodeableConcept> getInterpretation() {
		return this.interpretation;
	}

	public void setInterpretation(List<CodeableConcept> arg) {
		this.interpretation=arg;
	}

	public void addInterpretation(CodeableConcept arg) {
		this.interpretation.add(arg);
	}

}