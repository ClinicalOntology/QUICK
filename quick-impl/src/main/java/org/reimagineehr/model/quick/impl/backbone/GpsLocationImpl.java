package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.GpsLocation;
import java.math.BigDecimal;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GpsLocationImpl extends BackboneElementImpl implements GpsLocation {

	private BigDecimal longitude;
	private BigDecimal latitude;
	private BigDecimal altitude;

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal arg) {
		this.longitude=arg;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal arg) {
		this.latitude=arg;
	}

	public BigDecimal getAltitude() {
		return this.altitude;
	}

	public void setAltitude(BigDecimal arg) {
		this.altitude=arg;
	}

}