package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.ProfessionalQualification;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ProfessionalQualificationImpl extends BackboneElementImpl implements ProfessionalQualification {

	private List<Identifier> identifier;
	private CodeableConcept code;
	private Period period;
	private Organization issuer;

	public List<Identifier> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Identifier> arg) {
		this.identifier=arg;
	}

	public void addIdentifier(Identifier arg) {
		this.identifier.add(arg);
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Organization getIssuer() {
		return this.issuer;
	}

	public void setIssuer(Organization arg) {
		this.issuer=arg;
	}

}