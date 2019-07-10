package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.ContactImpl;
import org.reimagineehr.model.quick.api.backbone.OrganizationalContact;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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