package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Reference;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Identifier;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ReferenceImpl extends DatatypeImpl implements Reference {

	private String reference;
	private String type;
	private Identifier identifier;
	private String display;

	public String getReference() {
		return this.reference;
	}

	public void setReference(String arg) {
		this.reference=arg;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String arg) {
		this.type=arg;
	}

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Identifier arg) {
		this.identifier=arg;
	}

	public String getDisplay() {
		return this.display;
	}

	public void setDisplay(String arg) {
		this.display=arg;
	}

}