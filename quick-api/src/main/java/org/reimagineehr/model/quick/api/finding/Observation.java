package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.choice.ObservationValueChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ObservationComponent;
import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.other.Specimen;
import org.reimagineehr.model.quick.api.finding.ObservationalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Observation extends ObservationalFinding {


		 ObservationValueChoice getValue();

		 void setValue(ObservationValueChoice arg);

		 CodeableConcept getMethod();

		 void setMethod(CodeableConcept arg);

		 List<ObservationComponent> getComponent();

		 void setComponent(List<ObservationComponent> arg);

		public void addComponent(ObservationComponent arg);

		 CodeableConcept getBodySite();

		 void setBodySite(CodeableConcept arg);

		 CodeableConcept getDataAbsentReason();

		 void setDataAbsentReason(CodeableConcept arg);

		 CodeableConcept getInterpretation();

		 void setInterpretation(CodeableConcept arg);

		 List<DomainResource> getFocus();

		 void setFocus(List<DomainResource> arg);

		public void addFocus(DomainResource arg);

		 Specimen getSpecimen();

		 void setSpecimen(Specimen arg);

}