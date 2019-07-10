package org.reimagineehr.model.quick.api.request;

import java.util.List;
import org.reimagineehr.model.quick.api.backbone.DosageInstruction;
import org.reimagineehr.model.quick.api.backbone.DispenseRequest;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.choice.MedicationOrCodeChoice;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.request.Request;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface MedicationRequest extends Request {


		 List<DosageInstruction> getDosageInstruction();

		 void setDosageInstruction(List<DosageInstruction> arg);

		public void addDosageInstruction(DosageInstruction arg);

		 DispenseRequest getDispenseRequest();

		 void setDispenseRequest(DispenseRequest arg);

		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 MedicationOrCodeChoice getMedication();

		 void setMedication(MedicationOrCodeChoice arg);

		 Boolean getDoNotPerform();

		 void setDoNotPerform(Boolean arg);

}