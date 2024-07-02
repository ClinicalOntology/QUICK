package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.finding.Finding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface AssertionalFinding extends Finding {


		 Party getAsserter();

		 void setAsserter(Party arg);

		 Date getAssertedDate();

		 void setAssertedDate(Date arg);

}