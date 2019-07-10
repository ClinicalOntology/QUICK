package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Coding;
import java.lang.String;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class CodingImpl extends DatatypeImpl implements Coding {

	private String system;
	private String version;
	private String code;
	private String display;
	private Boolean userSelected;

	public String getSystem() {
		return this.system;
	}

	public void setSystem(String arg) {
		this.system=arg;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String arg) {
		this.version=arg;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String arg) {
		this.code=arg;
	}

	public String getDisplay() {
		return this.display;
	}

	public void setDisplay(String arg) {
		this.display=arg;
	}

	public Boolean getUserSelected() {
		return this.userSelected;
	}

	public void setUserSelected(Boolean arg) {
		this.userSelected=arg;
	}

}