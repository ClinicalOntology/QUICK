package org.reimagineehr.model.quick.api.choice;

import org.reimagineehr.model.quick.api.event.Immunization;
import org.reimagineehr.model.quick.api.event.Procedure;
import org.reimagineehr.model.quick.api.other.Medication;
import org.reimagineehr.model.quick.api.event.MedicationAdministration;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import org.reimagineehr.model.quick.api.party.Device;
import org.reimagineehr.model.quick.api.other.Substance;
import org.reimagineehr.model.quick.api.choice.ChoiceElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface SuspectEntityChoice extends ChoiceElement {


		 Immunization getImmunization();

		 void setImmunization(Immunization arg);

		 Procedure getProcedure();

		 void setProcedure(Procedure arg);

		 Medication getMedication();

		 void setMedication(Medication arg);

		 MedicationAdministration getMedicationAdministration();

		 void setMedicationAdministration(MedicationAdministration arg);

		 MedicationStatement getMedicationStatement();

		 void setMedicationStatement(MedicationStatement arg);

		 Device getDevice();

		 void setDevice(Device arg);

		 Substance getSubstance();

		 void setSubstance(Substance arg);

}