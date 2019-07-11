package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.AssertionalFindingImpl;
import org.reimagineehr.model.quick.api.finding.AdverseEvent;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.other.Location;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.SuspectEntity;
import org.reimagineehr.model.quick.api.finding.Condition;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AdverseEventImpl extends AssertionalFindingImpl implements AdverseEvent {

	private CodeableConcept event;
	private Date date;
	private CodeableConcept seriousness;
	private CodeableConcept severity;
	private Location location;
	private List<SuspectEntity> suspectEntity;
	private List<Condition> resultingCondition;

	public CodeableConcept getEvent() {
		return this.event;
	}

	public void setEvent(CodeableConcept arg) {
		this.event=arg;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date arg) {
		this.date=arg;
	}

	public CodeableConcept getSeriousness() {
		return this.seriousness;
	}

	public void setSeriousness(CodeableConcept arg) {
		this.seriousness=arg;
	}

	public CodeableConcept getSeverity() {
		return this.severity;
	}

	public void setSeverity(CodeableConcept arg) {
		this.severity=arg;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location arg) {
		this.location=arg;
	}

	public List<SuspectEntity> getSuspectEntity() {
		return this.suspectEntity;
	}

	public void setSuspectEntity(List<SuspectEntity> arg) {
		this.suspectEntity=arg;
	}

	public void addSuspectEntity(SuspectEntity arg) {
		this.suspectEntity.add(arg);
	}

	public List<Condition> getResultingCondition() {
		return this.resultingCondition;
	}

	public void setResultingCondition(List<Condition> arg) {
		this.resultingCondition=arg;
	}

	public void addResultingCondition(Condition arg) {
		this.resultingCondition.add(arg);
	}

}