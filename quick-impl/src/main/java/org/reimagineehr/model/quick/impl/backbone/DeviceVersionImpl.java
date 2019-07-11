package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.DeviceVersion;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DeviceVersionImpl extends BackboneElementImpl implements DeviceVersion {

	private CodeableConcept type;
	private Identifier component;
	private String value;

	public CodeableConcept getType() {
		return this.type;
	}

	public void setType(CodeableConcept arg) {
		this.type=arg;
	}

	public Identifier getComponent() {
		return this.component;
	}

	public void setComponent(Identifier arg) {
		this.component=arg;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String arg) {
		this.value=arg;
	}

}