package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.AssertionalFindingImpl;
import org.reimagineehr.model.quick.api.finding.FamilyMemberHistory;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.FamilyMemberHistoryCondition;
import java.lang.String;
import org.reimagineehr.model.quick.api.choice.DatePeriodOrStringChoice;
import org.reimagineehr.model.quick.api.choice.QuantityRangeRatioOrStringChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.choice.DeceasedChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class FamilyMemberHistoryImpl extends AssertionalFindingImpl implements FamilyMemberHistory {

	private CodeableConcept relationship;
	private List<FamilyMemberHistoryCondition> condition;
	private String name;
	private CodeableConcept sex;
	private DatePeriodOrStringChoice born;
	private QuantityRangeRatioOrStringChoice age;
	private Boolean estimatedAge;
	private DeceasedChoice deceased;

	public CodeableConcept getRelationship() {
		return this.relationship;
	}

	public void setRelationship(CodeableConcept arg) {
		this.relationship=arg;
	}

	public List<FamilyMemberHistoryCondition> getCondition() {
		return this.condition;
	}

	public void setCondition(List<FamilyMemberHistoryCondition> arg) {
		this.condition=arg;
	}

	public void addCondition(FamilyMemberHistoryCondition arg) {
		this.condition.add(arg);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name=arg;
	}

	public CodeableConcept getSex() {
		return this.sex;
	}

	public void setSex(CodeableConcept arg) {
		this.sex=arg;
	}

	public DatePeriodOrStringChoice getBorn() {
		return this.born;
	}

	public void setBorn(DatePeriodOrStringChoice arg) {
		this.born=arg;
	}

	public QuantityRangeRatioOrStringChoice getAge() {
		return this.age;
	}

	public void setAge(QuantityRangeRatioOrStringChoice arg) {
		this.age=arg;
	}

	public Boolean getEstimatedAge() {
		return this.estimatedAge;
	}

	public void setEstimatedAge(Boolean arg) {
		this.estimatedAge=arg;
	}

	public DeceasedChoice getDeceased() {
		return this.deceased;
	}

	public void setDeceased(DeceasedChoice arg) {
		this.deceased=arg;
	}

}