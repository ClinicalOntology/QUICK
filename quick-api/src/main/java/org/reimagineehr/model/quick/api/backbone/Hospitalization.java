package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.choice.OrganizationLocationChoice;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface Hospitalization extends BackboneElement {


		 Identifier getPreAdmissionIdentifier();

		 void setPreAdmissionIdentifier(Identifier arg);

		 OrganizationLocationChoice getOrigin();

		 void setOrigin(OrganizationLocationChoice arg);

		 CodeableConcept getAdmitSource();

		 void setAdmitSource(CodeableConcept arg);

		 CodeableConcept getReAdmission();

		 void setReAdmission(CodeableConcept arg);

		 List<CodeableConcept> getDietPreference();

		 void setDietPreference(List<CodeableConcept> arg);

		public void addDietPreference(CodeableConcept arg);

		 List<CodeableConcept> getSpecialCourtesy();

		 void setSpecialCourtesy(List<CodeableConcept> arg);

		public void addSpecialCourtesy(CodeableConcept arg);

		 List<CodeableConcept> getSpecialArrangement();

		 void setSpecialArrangement(List<CodeableConcept> arg);

		public void addSpecialArrangement(CodeableConcept arg);

		 OrganizationLocationChoice getDestination();

		 void setDestination(OrganizationLocationChoice arg);

		 CodeableConcept getDischargeDisposition();

		 void setDischargeDisposition(CodeableConcept arg);

}