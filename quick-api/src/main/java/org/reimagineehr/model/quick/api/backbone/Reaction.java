package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import java.lang.String;
import java.util.Date;
import org.reimagineehr.model.quick.api.backbone.Annotation;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Reaction extends BackboneElement {


		 CodeableConcept getSubstance();

		 void setSubstance(CodeableConcept arg);

		 List<CodeableConcept> getManifestation();

		 void setManifestation(List<CodeableConcept> arg);

		public void addManifestation(CodeableConcept arg);

		 String getDescription();

		 void setDescription(String arg);

		 Date getOnset();

		 void setOnset(Date arg);

		 String getSeverity();

		 void setSeverity(String arg);

		 CodeableConcept getExposureRoute();

		 void setExposureRoute(CodeableConcept arg);

		 Annotation getNote();

		 void setNote(Annotation arg);

}