package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DosageInstructionImpl extends BackboneElementImpl implements DosageInstruction {

	private List<DoseAndRate> doseAndRate;
	private Timing timing;
	private CodeableConcept route;
	private CodeableConcept method;

	public List<DoseAndRate> getDoseAndRate() {
		return this.doseAndRate;
	}

	public void setDoseAndRate(List<DoseAndRate> arg) {
		this.doseAndRate=arg;
	}

	public void addDoseAndRate(DoseAndRate arg) {
		this.doseAndRate.add(arg);
	}

	public Timing getTiming() {
		return this.timing;
	}

	public void setTiming(Timing arg) {
		this.timing=arg;
	}

	public CodeableConcept getRoute() {
		return this.route;
	}

	public void setRoute(CodeableConcept arg) {
		this.route=arg;
	}

	public CodeableConcept getMethod() {
		return this.method;
	}

	public void setMethod(CodeableConcept arg) {
		this.method=arg;
	}

}