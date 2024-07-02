package org.reimagineehr.model.quick.impl.resource;

import org.reimagineehr.model.quick.impl.resource.ResourceImpl;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.datatype.Narrative;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DomainResourceImpl extends ResourceImpl implements DomainResource {

	private Narrative text;

	public Narrative getText() {
		return this.text;
	}

	public void setText(Narrative arg) {
		this.text=arg;
	}

}