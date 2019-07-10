package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.SuspectEntity;
import org.reimagineehr.model.quick.api.choice.SuspectEntityChoice;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.Causality;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class SuspectEntityImpl extends BackboneElementImpl implements SuspectEntity {

	private SuspectEntityChoice instance;
	private List<Causality> causality;

	public SuspectEntityChoice getInstance() {
		return this.instance;
	}

	public void setInstance(SuspectEntityChoice arg) {
		this.instance=arg;
	}

	public List<Causality> getCausality() {
		return this.causality;
	}

	public void setCausality(List<Causality> arg) {
		this.causality=arg;
	}

	public void addCausality(Causality arg) {
		this.causality.add(arg);
	}

}