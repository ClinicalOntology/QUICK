package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Immunization extends Event {


		 CodeableConcept getVaccineCode();

		 void setVaccineCode(CodeableConcept arg);

		 Quantity getDoseQuantity();

		 void setDoseQuantity(Quantity arg);

		 CodeableConcept getRoute();

		 void setRoute(CodeableConcept arg);

		 Boolean getPrimarySource();

		 void setPrimarySource(Boolean arg);

}