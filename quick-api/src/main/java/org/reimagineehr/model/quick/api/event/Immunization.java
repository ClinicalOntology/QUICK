package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Quantity;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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