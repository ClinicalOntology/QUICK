package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Signature;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.Party;
import java.lang.String;
import java.lang.Byte;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class SignatureImpl extends BackboneElementImpl implements Signature {

	private List<Coding> type;
	private Date when;
	private Party who;
	private Party onBehalfOf;
	private String targetFormat;
	private String sigFormat;
	private Byte[] data;

	public List<Coding> getType() {
		return this.type;
	}

	public void setType(List<Coding> arg) {
		this.type=arg;
	}

	public void addType(Coding arg) {
		this.type.add(arg);
	}

	public Date getWhen() {
		return this.when;
	}

	public void setWhen(Date arg) {
		this.when=arg;
	}

	public Party getWho() {
		return this.who;
	}

	public void setWho(Party arg) {
		this.who=arg;
	}

	public Party getOnBehalfOf() {
		return this.onBehalfOf;
	}

	public void setOnBehalfOf(Party arg) {
		this.onBehalfOf=arg;
	}

	public String getTargetFormat() {
		return this.targetFormat;
	}

	public void setTargetFormat(String arg) {
		this.targetFormat=arg;
	}

	public String getSigFormat() {
		return this.sigFormat;
	}

	public void setSigFormat(String arg) {
		this.sigFormat=arg;
	}

	public Byte[] getData() {
		return this.data;
	}

	public void setData(Byte[] arg) {
		this.data=arg;
	}

}