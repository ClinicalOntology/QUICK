package org.reimagineehr.model.quick.wrapper.backbone;

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
public class AddressWrapper implements Address {

	private org.hl7.fhir.dstu3.model.Address adaptee;

	public AddressWrapper() {
	
	}

	public AddressWrapper(org.hl7.fhir.dstu3.model.Address adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Address getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Address arg) {
		this.adaptee=arg;
	}

	public String getUse() {
		if (this.adaptee.getUse() != null) {
			return this.adaptee.getUse().toCode();
		} else {
			return null;
		}
	}

	public void setUse(String arg) {
		if (arg != null) {
			this.adaptee.setUse(org.hl7.fhir.dstu3.model.Address.AddressUse.fromCode(arg));
		}
	}

	public String getType() {
		if (this.adaptee.getType() != null) {
			return this.adaptee.getType().toCode();
		} else {
			return null;
		}
	}

	public void setType(String arg) {
		if (arg != null) {
			this.adaptee.setType(org.hl7.fhir.dstu3.model.Address.AddressType.fromCode(arg));
		}
	}

	public String getText() {
	return this.adaptee.getTextElement().getValue();
	}

	public void setText(String arg) {
	this.adaptee.setText(arg);
	}

	public List<String> getLine() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getLine() != null) {
			for(org.hl7.fhir.dstu3.model.StringType type: this.adaptee.getLine()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setLine(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.dstu3.model.StringType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.dstu3.model.StringType(type));
			}
		}
		this.adaptee.setLine(values);
	}

	public void addLine(String arg) {
	
		this.adaptee.addLine(arg);
	}

	public String getCity() {
	return this.adaptee.getCityElement().getValue();
	}

	public void setCity(String arg) {
	this.adaptee.setCity(arg);
	}

	public String getDistrict() {
	return this.adaptee.getDistrictElement().getValue();
	}

	public void setDistrict(String arg) {
	this.adaptee.setDistrict(arg);
	}

	public String getState() {
	return this.adaptee.getStateElement().getValue();
	}

	public void setState(String arg) {
	this.adaptee.setState(arg);
	}

	public String getPostalCode() {
	return this.adaptee.getPostalCodeElement().getValue();
	}

	public void setPostalCode(String arg) {
	this.adaptee.setPostalCode(arg);
	}

	public String getCountry() {
	return this.adaptee.getCountryElement().getValue();
	}

	public void setCountry(String arg) {
	this.adaptee.setCountry(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

}