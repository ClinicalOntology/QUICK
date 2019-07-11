package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Annotation;
import org.reimagineehr.model.quick.api.choice.ResourceOrStringChoice;
import java.util.Date;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AnnotationImpl extends BackboneElementImpl implements Annotation {

	private ResourceOrStringChoice author;
	private Date time;
	private String text;

	public ResourceOrStringChoice getAuthor() {
		return this.author;
	}

	public void setAuthor(ResourceOrStringChoice arg) {
		this.author=arg;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date arg) {
		this.time=arg;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String arg) {
		this.text=arg;
	}

}