package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.finding.Finding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface ObservationalFinding extends Finding {


		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 Date getIssued();

		 void setIssued(Date arg);

}