package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.GroupCharacteristic;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class GroupCharacteristicImpl extends BackboneElementImpl implements GroupCharacteristic {

	private CodeableConcept code;
	private ObservationValueChoice value;
	private Boolean exclude;
	private Period period;

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

	public Boolean getExclude() {
		return this.exclude;
	}

	public void setExclude(Boolean arg) {
		this.exclude=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}