package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.lang.String;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class NarrativeImpl extends DatatypeImpl implements Narrative {

	private String status;
	private String div;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String arg) {
		this.status=arg;
	}

	public String getDiv() {
		return this.div;
	}

	public void setDiv(String arg) {
		this.div=arg;
	}

}