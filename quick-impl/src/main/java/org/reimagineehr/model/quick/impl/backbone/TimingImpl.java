package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Timing;
import java.util.List;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.TimingRepeat;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class TimingImpl extends BackboneElementImpl implements Timing {

	private List<Date> event;
	private TimingRepeat repeat;
	private CodeableConcept code;

	public List<Date> getEvent() {
		return this.event;
	}

	public void setEvent(List<Date> arg) {
		this.event=arg;
	}

	public void addEvent(Date arg) {
		this.event.add(arg);
	}

	public TimingRepeat getRepeat() {
		return this.repeat;
	}

	public void setRepeat(TimingRepeat arg) {
		this.repeat=arg;
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

}