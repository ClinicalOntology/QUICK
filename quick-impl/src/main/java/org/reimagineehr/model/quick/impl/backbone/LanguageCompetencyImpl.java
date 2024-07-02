package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.LanguageCompetency;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class LanguageCompetencyImpl extends BackboneElementImpl implements LanguageCompetency {

	private CodeableConcept language;
	private Boolean preferred;

	public CodeableConcept getLanguage() {
		return this.language;
	}

	public void setLanguage(CodeableConcept arg) {
		this.language=arg;
	}

	public Boolean getPreferred() {
		return this.preferred;
	}

	public void setPreferred(Boolean arg) {
		this.preferred=arg;
	}

}