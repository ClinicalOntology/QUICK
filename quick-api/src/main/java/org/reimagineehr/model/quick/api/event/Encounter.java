package org.reimagineehr.model.quick.api.event;

import org.reimagineehr.model.quick.api.datatype.Coding;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.event.Appointment;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.datatype.Duration;
import org.reimagineehr.model.quick.api.backbone.EncounterDiagnosisOrProcedure;
import org.reimagineehr.model.quick.api.backbone.Hospitalization;
import org.reimagineehr.model.quick.api.backbone.PatientLocation;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Encounter extends Event {


		 Coding getEncounterClass();

		 void setEncounterClass(Coding arg);

		 List<CodeableConcept> getType();

		 void setType(List<CodeableConcept> arg);

		public void addType(CodeableConcept arg);

		 CodeableConcept getServiceType();

		 void setServiceType(CodeableConcept arg);

		 CodeableConcept getPriority();

		 void setPriority(CodeableConcept arg);

		 List<Appointment> getAppointment();

		 void setAppointment(List<Appointment> arg);

		public void addAppointment(Appointment arg);

		 Period getPeriod();

		 void setPeriod(Period arg);

		 Duration getLength();

		 void setLength(Duration arg);

		 List<EncounterDiagnosisOrProcedure> getDiagnosisOrProcedure();

		 void setDiagnosisOrProcedure(List<EncounterDiagnosisOrProcedure> arg);

		public void addDiagnosisOrProcedure(EncounterDiagnosisOrProcedure arg);

		 Hospitalization getHospitalization();

		 void setHospitalization(Hospitalization arg);

		 List<PatientLocation> getLocation();

		 void setLocation(List<PatientLocation> arg);

		public void addLocation(PatientLocation arg);

		 Organization getServiceProvider();

		 void setServiceProvider(Organization arg);

		 Encounter getPartOf();

		 void setPartOf(Encounter arg);

}