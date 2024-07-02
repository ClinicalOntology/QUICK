package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.ContactImpl;
import org.reimagineehr.model.quick.api.backbone.IndividualContact;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.String;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IndividualContactImpl extends ContactImpl implements IndividualContact {

	private List<CodeableConcept> relationship;
	private String gender;
	private Organization organization;
	private Period period;

	public List<CodeableConcept> getRelationship() {
		return this.relationship;
	}

	public void setRelationship(List<CodeableConcept> arg) {
		this.relationship=arg;
	}

	public void addRelationship(CodeableConcept arg) {
		this.relationship.add(arg);
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String arg) {
		this.gender=arg;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization arg) {
		this.organization=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}