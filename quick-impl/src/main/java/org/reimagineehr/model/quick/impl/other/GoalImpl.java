package org.reimagineehr.model.quick.impl.other;

import org.reimagineehr.model.quick.impl.resource.DomainResourceImpl;
import org.reimagineehr.model.quick.api.other.Goal;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.DateCodeableConceptChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.choice.GoalChoice;
import org.reimagineehr.model.quick.api.choice.DateDurationChoice;
import org.reimagineehr.model.quick.api.party.Party;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GoalImpl extends DomainResourceImpl implements Goal {

	private String lifecycleStatus;
	private CodeableConcept description;
	private DateCodeableConceptChoice start;
	private List<GoalChoice> addresses;
	private List<DateDurationChoice> target;
	private Party expressedBy;

	public String getLifecycleStatus() {
		return this.lifecycleStatus;
	}

	public void setLifecycleStatus(String arg) {
		this.lifecycleStatus=arg;
	}

	public CodeableConcept getDescription() {
		return this.description;
	}

	public void setDescription(CodeableConcept arg) {
		this.description=arg;
	}

	public DateCodeableConceptChoice getStart() {
		return this.start;
	}

	public void setStart(DateCodeableConceptChoice arg) {
		this.start=arg;
	}

	public List<GoalChoice> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<GoalChoice> arg) {
		this.addresses=arg;
	}

	public void addAddresses(GoalChoice arg) {
		this.addresses.add(arg);
	}

	public List<DateDurationChoice> getTarget() {
		return this.target;
	}

	public void setTarget(List<DateDurationChoice> arg) {
		this.target=arg;
	}

	public void addTarget(DateDurationChoice arg) {
		this.target.add(arg);
	}

	public Party getExpressedBy() {
		return this.expressedBy;
	}

	public void setExpressedBy(Party arg) {
		this.expressedBy=arg;
	}

}