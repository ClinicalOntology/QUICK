package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class HumanNameImpl extends BackboneElementImpl implements HumanName {

	private String use;
	private String text;
	private String family;
	private List<String> given;
	private List<String> prefix;
	private List<String> suffix;
	private Period period;

	public String getUse() {
		return this.use;
	}

	public void setUse(String arg) {
		this.use=arg;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String arg) {
		this.text=arg;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String arg) {
		this.family=arg;
	}

	public List<String> getGiven() {
		return this.given;
	}

	public void setGiven(List<String> arg) {
		this.given=arg;
	}

	public void addGiven(String arg) {
		this.given.add(arg);
	}

	public List<String> getPrefix() {
		return this.prefix;
	}

	public void setPrefix(List<String> arg) {
		this.prefix=arg;
	}

	public void addPrefix(String arg) {
		this.prefix.add(arg);
	}

	public List<String> getSuffix() {
		return this.suffix;
	}

	public void setSuffix(List<String> arg) {
		this.suffix=arg;
	}

	public void addSuffix(String arg) {
		this.suffix.add(arg);
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}