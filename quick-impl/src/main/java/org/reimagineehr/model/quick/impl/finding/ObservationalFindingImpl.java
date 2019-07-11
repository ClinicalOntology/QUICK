package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.FindingImpl;
import org.reimagineehr.model.quick.api.finding.ObservationalFinding;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ObservationalFindingImpl extends FindingImpl implements ObservationalFinding {

	private CodeableConcept code;
	private Date issued;

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public Date getIssued() {
		return this.issued;
	}

	public void setIssued(Date arg) {
		this.issued=arg;
	}

}