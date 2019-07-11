package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.EncounterDiagnosisOrProcedure;
import org.reimagineehr.model.quick.api.choice.ConditionOrProcedureChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class EncounterDiagnosisOrProcedureImpl extends BackboneElementImpl implements EncounterDiagnosisOrProcedure {

	private ConditionOrProcedureChoice reference;
	private CodeableConcept use;
	private Integer rank;

	public ConditionOrProcedureChoice getReference() {
		return this.reference;
	}

	public void setReference(ConditionOrProcedureChoice arg) {
		this.reference=arg;
	}

	public CodeableConcept getUse() {
		return this.use;
	}

	public void setUse(CodeableConcept arg) {
		this.use=arg;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer arg) {
		this.rank=arg;
	}

}