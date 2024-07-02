package org.reimagineehr.model.quick.api.backbone;

import java.util.List;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.TimingRepeat;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Timing extends BackboneElement {


		 List<Date> getEvent();

		 void setEvent(List<Date> arg);

		public void addEvent(Date arg);

		 TimingRepeat getRepeat();

		 void setRepeat(TimingRepeat arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

}