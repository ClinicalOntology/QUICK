package org.reimagineehr.model.quick.api.other;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.other.Schedule;
import java.lang.String;
import java.util.Date;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Slot extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

		 List<CodeableConcept> getServiceCategory();

		 void setServiceCategory(List<CodeableConcept> arg);

		public void addServiceCategory(CodeableConcept arg);

		 List<CodeableConcept> getServiceType();

		 void setServiceType(List<CodeableConcept> arg);

		public void addServiceType(CodeableConcept arg);

		 List<CodeableConcept> getSpecialty();

		 void setSpecialty(List<CodeableConcept> arg);

		public void addSpecialty(CodeableConcept arg);

		 CodeableConcept getAppointmentType();

		 void setAppointmentType(CodeableConcept arg);

		 Schedule getSchedule();

		 void setSchedule(Schedule arg);

		 String getStatus();

		 void setStatus(String arg);

		 Date getStart();

		 void setStart(Date arg);

		 Date getEnd();

		 void setEnd(Date arg);

		 Boolean getOverbooked();

		 void setOverbooked(Boolean arg);

		 String getComment();

		 void setComment(String arg);

}