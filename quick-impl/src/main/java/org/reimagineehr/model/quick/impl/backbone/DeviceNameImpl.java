package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DeviceName;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class DeviceNameImpl extends BackboneElementImpl implements DeviceName {

	private String name;
	private String type;

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name=arg;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String arg) {
		this.type=arg;
	}

}