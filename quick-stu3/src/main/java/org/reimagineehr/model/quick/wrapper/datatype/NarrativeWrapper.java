package org.reimagineehr.model.quick.wrapper.datatype;

import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class NarrativeWrapper implements Narrative {

	private org.hl7.fhir.dstu3.model.Narrative adaptee;

	public NarrativeWrapper() {
	
	}

	public NarrativeWrapper(org.hl7.fhir.dstu3.model.Narrative adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Narrative getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Narrative arg) {
		this.adaptee=arg;
	}

	public String getStatus() {
		if (this.adaptee.getStatus() != null) {
			return this.adaptee.getStatus().toCode();
		} else {
			return null;
		}
	}

	public void setStatus(String arg) {
		if (arg != null) {
			this.adaptee.setStatus(org.hl7.fhir.dstu3.model.Narrative.NarrativeStatus.fromCode(arg));
		}
	}

	public String getDiv() {
	return this.adaptee.getDivAsString();
	}

	public void setDiv(String arg) {
	this.adaptee.setDivAsString(arg);
	}

}