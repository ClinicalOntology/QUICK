package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.FindingImpl;
import org.reimagineehr.model.quick.api.finding.AssertionalFinding;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AssertionalFindingImpl extends FindingImpl implements AssertionalFinding {

	private Party asserter;
	private Date assertedDate;

	public Party getAsserter() {
		return this.asserter;
	}

	public void setAsserter(Party arg) {
		this.asserter=arg;
	}

	public Date getAssertedDate() {
		return this.assertedDate;
	}

	public void setAssertedDate(Date arg) {
		this.assertedDate=arg;
	}

}