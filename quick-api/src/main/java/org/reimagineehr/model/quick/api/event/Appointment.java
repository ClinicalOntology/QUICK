package org.reimagineehr.model.quick.api.event;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import java.lang.String;
import org.reimagineehr.model.quick.api.resource.Resource;
import java.util.Date;
import org.reimagineehr.model.quick.api.other.Slot;
import org.reimagineehr.model.quick.api.backbone.Participation;
import org.reimagineehr.model.quick.api.datatype.Period;
import org.reimagineehr.model.quick.api.event.Event;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Appointment extends Event {


		 List<CodeableConcept> getServiceCategory();

		 void setServiceCategory(List<CodeableConcept> arg);

		public void addServiceCategory(CodeableConcept arg);

		 List<CodeableConcept> getServiceType();

		 void setServiceType(List<CodeableConcept> arg);

		public void addServiceType(CodeableConcept arg);

		 List<CodeableConcept> getSpecialty();

		 void setSpecialty(List<CodeableConcept> arg);

		public void addSpecialty(CodeableConcept arg);

		 CodeableConcept getAppointmentTime();

		 void setAppointmentTime(CodeableConcept arg);

		 Integer getPriority();

		 void setPriority(Integer arg);

		 String getDescription();

		 void setDescription(String arg);

		 List<Resource> getSupportingInformation();

		 void setSupportingInformation(List<Resource> arg);

		public void addSupportingInformation(Resource arg);

		 Date getStart();

		 void setStart(Date arg);

		 Date getStop();

		 void setStop(Date arg);

		 Integer getMinutesDuration();

		 void setMinutesDuration(Integer arg);

		 List<Slot> getSlot();

		 void setSlot(List<Slot> arg);

		public void addSlot(Slot arg);

		 Date getCreated();

		 void setCreated(Date arg);

		 String getComment();

		 void setComment(String arg);

		 String getPatientInstruction();

		 void setPatientInstruction(String arg);

		 List<Participation> getParticipant();

		 void setParticipant(List<Participation> arg);

		public void addParticipant(Participation arg);

		 List<Period> getRequestedPeriod();

		 void setRequestedPeriod(List<Period> arg);

		public void addRequestedPeriod(Period arg);

}