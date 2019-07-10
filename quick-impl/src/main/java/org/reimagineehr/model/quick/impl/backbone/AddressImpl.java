package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Address;
import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class AddressImpl extends BackboneElementImpl implements Address {

	private String use;
	private String type;
	private String text;
	private List<String> line;
	private String city;
	private String district;
	private String state;
	private String postalCode;
	private String country;
	private Period period;

	public String getUse() {
		return this.use;
	}

	public void setUse(String arg) {
		this.use=arg;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String arg) {
		this.type=arg;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String arg) {
		this.text=arg;
	}

	public List<String> getLine() {
		return this.line;
	}

	public void setLine(List<String> arg) {
		this.line=arg;
	}

	public void addLine(String arg) {
		this.line.add(arg);
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String arg) {
		this.city=arg;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String arg) {
		this.district=arg;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String arg) {
		this.state=arg;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String arg) {
		this.postalCode=arg;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String arg) {
		this.country=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}