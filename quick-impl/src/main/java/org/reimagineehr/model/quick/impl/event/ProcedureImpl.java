package org.reimagineehr.model.quick.impl.event;

import org.reimagineehr.model.quick.impl.event.EventImpl;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ProcedureImpl extends EventImpl implements Procedure {

	private CodeableConcept code;
	private CodeableConcept outcome;
	private List<CodeableConcept> bodySite;
	private List<Event> partOf;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public CodeableConcept getOutcome() {
		return this.outcome;
	}

	public void setOutcome(CodeableConcept arg) {
		this.outcome=arg;
	}

	public List<CodeableConcept> getBodySite() {
		return this.bodySite;
	}

	public void setBodySite(List<CodeableConcept> arg) {
		this.bodySite=arg;
	}

	public void addBodySite(CodeableConcept arg) {
		this.bodySite.add(arg);
	}

	public List<Event> getPartOf() {
		return this.partOf;
	}

	public void setPartOf(List<Event> arg) {
		this.partOf=arg;
	}

	public void addPartOf(Event arg) {
		this.partOf.add(arg);
	}

}