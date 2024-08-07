package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.ContactImpl;
import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OrganizationalContactImpl extends ContactImpl implements OrganizationalContact {

	private CodeableConcept purpose;

	public CodeableConcept getPurpose() {
		return this.purpose;
	}

	public void setPurpose(CodeableConcept arg) {
		this.purpose=arg;
	}

}