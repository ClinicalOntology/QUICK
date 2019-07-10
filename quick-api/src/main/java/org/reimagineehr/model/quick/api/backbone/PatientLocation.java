package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.other.Location;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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