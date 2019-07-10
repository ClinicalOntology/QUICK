package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import java.lang.String;
import java.lang.Byte;
import java.lang.Integer;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class AttachmentImpl extends DatatypeImpl implements Attachment {

	private String contentType;
	private String language;
	private Byte[] data;
	private String url;
	private Integer size;
	private Byte[] hash;
	private String title;
	private Date creation;

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String arg) {
		this.contentType=arg;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String arg) {
		this.language=arg;
	}

	public Byte[] getData() {
		return this.data;
	}

	public void setData(Byte[] arg) {
		this.data=arg;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String arg) {
		this.url=arg;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer arg) {
		this.size=arg;
	}

	public Byte[] getHash() {
		return this.hash;
	}

	public void setHash(Byte[] arg) {
		this.hash=arg;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String arg) {
		this.title=arg;
	}

	public Date getCreation() {
		return this.creation;
	}

	public void setCreation(Date arg) {
		this.creation=arg;
	}

}