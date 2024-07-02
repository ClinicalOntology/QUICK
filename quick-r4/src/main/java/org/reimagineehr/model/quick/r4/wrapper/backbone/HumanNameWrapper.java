package org.reimagineehr.model.quick.r4.wrapper.backbone;

import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.lang.String;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class HumanNameWrapper implements HumanName {

	private org.hl7.fhir.r4.model.HumanName adaptee;

	public HumanNameWrapper() {
	
	}

	public HumanNameWrapper(org.hl7.fhir.r4.model.HumanName adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.r4.model.HumanName getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.r4.model.HumanName arg) {
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
			this.adaptee.setUse(org.hl7.fhir.r4.model.HumanName.NameUse.fromCode(arg));
		}
	}

	public String getText() {
	return this.adaptee.getTextElement().getValue();
	}

	public void setText(String arg) {
	this.adaptee.setText(arg);
	}

	public String getFamily() {
	return this.adaptee.getFamilyElement().getValue();
	}

	public void setFamily(String arg) {
	this.adaptee.setFamily(arg);
	}

	public List<String> getGiven() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getGiven() != null) {
			for(org.hl7.fhir.r4.model.StringType type: this.adaptee.getGiven()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setGiven(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.r4.model.StringType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.r4.model.StringType(type));
			}
		}
		this.adaptee.setGiven(values);
	}

	public void addGiven(String arg) {
	
		this.adaptee.addGiven(arg);
	}

	public List<String> getPrefix() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getPrefix() != null) {
			for(org.hl7.fhir.r4.model.StringType type: this.adaptee.getPrefix()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setPrefix(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.r4.model.StringType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.r4.model.StringType(type));
			}
		}
		this.adaptee.setPrefix(values);
	}

	public void addPrefix(String arg) {
	
		this.adaptee.addPrefix(arg);
	}

	public List<String> getSuffix() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getSuffix() != null) {
			for(org.hl7.fhir.r4.model.StringType type: this.adaptee.getSuffix()) {
				retVals.add(type.getValueAsString());
			}
		}
		return retVals;
	}

	public void setSuffix(java.util.List<String> arg) {
	
		java.util.List<org.hl7.fhir.r4.model.StringType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add(new org.hl7.fhir.r4.model.StringType(type));
			}
		}
		this.adaptee.setSuffix(values);
	}

	public void addSuffix(String arg) {
	
		this.adaptee.addSuffix(arg);
	}

	public Period getPeriod() {
	
		return new org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper(this.adaptee.getPeriod());
	}

	public void setPeriod(Period arg) {
	
		this.adaptee.setPeriod(((org.reimagineehr.model.quick.r4.wrapper.datatype.PeriodWrapper)arg).getAdaptee());
	}

}