package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.party.Party;
import java.util.Date;
import org.reimagineehr.model.quick.api.finding.Finding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface AssertionalFinding extends Finding {


		 Party getAsserter();

		 void setAsserter(Party arg);

		 Date getAssertedDate();

		 void setAssertedDate(Date arg);

}