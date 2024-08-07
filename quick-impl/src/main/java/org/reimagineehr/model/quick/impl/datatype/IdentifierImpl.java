package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class IdentifierImpl extends BackboneElementImpl implements Identifier {

	private String use;
	private CodeableConcept type;
	private String system;
	private String value;
	private Period period;
	private Organization assigner;

	public String getUse() {
		return this.use;
	}

	public void setUse(String arg) {
		this.use=arg;
	}

	public CodeableConcept getType() {
		return this.type;
	}

	public void setType(CodeableConcept arg) {
		this.type=arg;
	}

	public String getSystem() {
		return this.system;
	}

	public void setSystem(String arg) {
		this.system=arg;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String arg) {
		this.value=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

	public Organization getAssigner() {
		return this.assigner;
	}

	public void setAssigner(Organization arg) {
		this.assigner=arg;
	}

}