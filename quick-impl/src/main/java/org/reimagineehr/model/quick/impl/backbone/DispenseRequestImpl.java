package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DispenseRequest;
import org.reimagineehr.model.quick.api.backbone.InitialFill;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.datatype.SimpleQuantity;
import org.reimagineehr.model.quick.api.party.Organization;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DispenseRequestImpl extends BackboneElementImpl implements DispenseRequest {

	private InitialFill initialFill;
	private Duration dispenseInterval;
	private Period validityPeriod;
	private Integer numberOfRepeatsAllowed;
	private SimpleQuantity quantity;
	private Duration expectedSupplyDuration;
	private Organization performer;

	public InitialFill getInitialFill() {
		return this.initialFill;
	}

	public void setInitialFill(InitialFill arg) {
		this.initialFill=arg;
	}

	public Duration getDispenseInterval() {
		return this.dispenseInterval;
	}

	public void setDispenseInterval(Duration arg) {
		this.dispenseInterval=arg;
	}

	public Period getValidityPeriod() {
		return this.validityPeriod;
	}

	public void setValidityPeriod(Period arg) {
		this.validityPeriod=arg;
	}

	public Integer getNumberOfRepeatsAllowed() {
		return this.numberOfRepeatsAllowed;
	}

	public void setNumberOfRepeatsAllowed(Integer arg) {
		this.numberOfRepeatsAllowed=arg;
	}

	public SimpleQuantity getQuantity() {
		return this.quantity;
	}

	public void setQuantity(SimpleQuantity arg) {
		this.quantity=arg;
	}

	public Duration getExpectedSupplyDuration() {
		return this.expectedSupplyDuration;
	}

	public void setExpectedSupplyDuration(Duration arg) {
		this.expectedSupplyDuration=arg;
	}

	public Organization getPerformer() {
		return this.performer;
	}

	public void setPerformer(Organization arg) {
		this.performer=arg;
	}

}