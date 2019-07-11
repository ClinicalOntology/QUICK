package org.reimagineehr.model.quick.impl.resource;

import org.reimagineehr.model.quick.impl.primitive.ElementImpl;
import org.reimagineehr.model.quick.api.resource.Resource;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ResourceImpl extends ElementImpl implements Resource {

	private String id;
	private Meta meta;
	private String implicitRules;
	private String language;

	public String getId() {
		return this.id;
	}

	public void setId(String arg) {
		this.id=arg;
	}

	public Meta getMeta() {
		return this.meta;
	}

	public void setMeta(Meta arg) {
		this.meta=arg;
	}

	public String getImplicitRules() {
		return this.implicitRules;
	}

	public void setImplicitRules(String arg) {
		this.implicitRules=arg;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String arg) {
		this.language=arg;
	}

}