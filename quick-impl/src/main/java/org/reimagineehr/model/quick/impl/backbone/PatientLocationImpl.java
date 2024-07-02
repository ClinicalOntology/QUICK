package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.PatientLocation;
import org.reimagineehr.model.quick.api.other.Location;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PatientLocationImpl extends BackboneElementImpl implements PatientLocation {

	private Location location;
	private String status;
	private CodeableConcept physicalType;
	private Period period;

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location arg) {
		this.location=arg;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public CodeableConcept getPhysicalType() {
		return this.physicalType;
	}

	public void setPhysicalType(CodeableConcept arg) {
		this.physicalType=arg;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period arg) {
		this.period=arg;
	}

}