package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.GoalTarget;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class GoalTargetImpl extends BackboneElementImpl implements GoalTarget {

	private CodeableConcept measure;
	private ObservationValueChoice detail;

	public CodeableConcept getMeasure() {
		return this.measure;
	}

	public void setMeasure(CodeableConcept arg) {
		this.measure=arg;
	}

	public ObservationValueChoice getDetail() {
		return this.detail;
	}

	public void setDetail(ObservationValueChoice arg) {
		this.detail=arg;
	}

}