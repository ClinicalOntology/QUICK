package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.SuspectEntityChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.Causality;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface SuspectEntity extends BackboneElement {


		 SuspectEntityChoice getInstance();

		 void setInstance(SuspectEntityChoice arg);

		 List<Causality> getCausality();

		 void setCausality(List<Causality> arg);

		public void addCausality(Causality arg);

}