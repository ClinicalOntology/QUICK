package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class CodeableConceptImpl extends DatatypeImpl implements CodeableConcept {

	private List<Coding> coding;
	private String text;

	public List<Coding> getCoding() {
		return this.coding;
	}

	public void setCoding(List<Coding> arg) {
		this.coding=arg;
	}

	public void addCoding(Coding arg) {
		this.coding.add(arg);
	}

	public String getText() {
		return this.text;
	}

	public void setText(String arg) {
		this.text=arg;
	}

}