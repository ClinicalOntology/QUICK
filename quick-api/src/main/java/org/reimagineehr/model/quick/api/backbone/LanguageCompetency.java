package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface LanguageCompetency extends BackboneElement {


		 CodeableConcept getLanguage();

		 void setLanguage(CodeableConcept arg);

		 Boolean getPreferred();

		 void setPreferred(Boolean arg);

}