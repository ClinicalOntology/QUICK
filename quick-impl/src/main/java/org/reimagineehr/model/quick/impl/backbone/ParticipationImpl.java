package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ParticipationImpl extends BackboneElementImpl implements Participation {

	private CodeableConcept role;
	private Party actor;
	private Organization onBehalfOf;
	private Period period;
	private String required;
	private String status;

	public CodeableConcept getRole() {
		return this.role;
	}

	public void setRole(CodeableConcept arg) {
		this.role=arg;
	}

	public Party getActor() {
		return this.actor;
	}

	public void setActor(Party arg) {
		this.actor=arg;
	}

	public Organization getOnBehalfOf() {
		return this.onBehalfOf;
	}

	public void setOnBehalfOf(Organization arg) {
		this.onBehalfOf=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public String getRequired() {
		return this.required;
	}

	public void setRequired(String arg) {
		this.required=arg;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

}