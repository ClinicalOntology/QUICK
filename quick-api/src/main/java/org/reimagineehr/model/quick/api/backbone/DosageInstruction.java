package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DoseAndRate;
import org.reimagineehr.model.quick.api.backbone.Timing;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface DosageInstruction extends BackboneElement {


		 List<DoseAndRate> getDoseAndRate();

		 void setDoseAndRate(List<DoseAndRate> arg);

		public void addDoseAndRate(DoseAndRate arg);

		 Timing getTiming();

		 void setTiming(Timing arg);

		 CodeableConcept getRoute();

		 void setRoute(CodeableConcept arg);

		 CodeableConcept getMethod();

		 void setMethod(CodeableConcept arg);

}