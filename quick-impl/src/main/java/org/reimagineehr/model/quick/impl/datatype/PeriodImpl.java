package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Period;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class PeriodImpl extends DatatypeImpl implements Period {

	private Date start;
	private Date end;

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date arg) {
		this.start=arg;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date arg) {
		this.end=arg;
	}

}