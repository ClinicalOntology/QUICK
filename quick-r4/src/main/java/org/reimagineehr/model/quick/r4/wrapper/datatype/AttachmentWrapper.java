package org.reimagineehr.model.quick.r4.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Attachment;
import java.lang.String;
import java.lang.Byte;
import java.lang.Integer;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AttachmentWrapper implements Attachment {

	private org.hl7.fhir.r4.model.Attachment adaptee;

	public AttachmentWrapper() {
	
	}

	public AttachmentWrapper(org.hl7.fhir.r4.model.Attachment adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.Attachment getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.Attachment arg) {
		this.adaptee=arg;
	}

	public String getContentType() {
	return this.adaptee.getContentTypeElement().getValue();
	}

	public void setContentType(String arg) {
	this.adaptee.setContentType(arg);
	}

	public String getLanguage() {
	return this.adaptee.getLanguageElement().getValue();
	}

	public void setLanguage(String arg) {
	this.adaptee.setLanguage(arg);
	}

	public Byte[] getData() {
		byte[] bytes = this.adaptee.getData();
		return org.apache.commons.lang3.ArrayUtils.toObject(bytes);
	}

	public void setData(Byte[] arg) {
		this.adaptee.setData(org.apache.commons.lang3.ArrayUtils.toPrimitive(arg));
	}

	public String getUrl() {
	return this.adaptee.getUrlElement().getValue();
	}

	public void setUrl(String arg) {
	this.adaptee.setUrl(arg);
	}

	public Integer getSize() {
	return this.adaptee.getSizeElement().getValue();
	}

	public void setSize(Integer arg) {
	this.adaptee.setSize(arg);
	}

	public Byte[] getHash() {
		byte[] bytes = this.adaptee.getHash();
		return org.apache.commons.lang3.ArrayUtils.toObject(bytes);
	}

	public void setHash(Byte[] arg) {
		this.adaptee.setHash(org.apache.commons.lang3.ArrayUtils.toPrimitive(arg));
	}

	public String getTitle() {
	return this.adaptee.getTitleElement().getValue();
	}

	public void setTitle(String arg) {
	this.adaptee.setTitle(arg);
	}

	public Date getCreation() {
	return this.adaptee.getCreationElement().getValue();
	}

	public void setCreation(Date arg) {
	this.adaptee.setCreation(arg);
	}

}