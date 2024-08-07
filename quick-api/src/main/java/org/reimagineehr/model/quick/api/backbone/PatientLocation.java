package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.other.Location;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface PatientLocation extends BackboneElement {


		 Location getLocation();

		 void setLocation(Location arg);

		 String getStatus();

		 void setStatus(String arg);

		 CodeableConcept getPhysicalType();

		 void setPhysicalType(CodeableConcept arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

}