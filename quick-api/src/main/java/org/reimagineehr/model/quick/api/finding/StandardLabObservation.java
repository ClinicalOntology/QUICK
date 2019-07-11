package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.List;
import org.reimagineehr.model.quick.api.party.IndividualCareGiver;
import org.reimagineehr.model.quick.api.party.Organization;
import java.util.Date;
import org.reimagineehr.model.quick.api.party.IndividualCareRecipient;
import org.reimagineehr.model.quick.api.other.Specimen;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface StandardLabObservation {


		 Identifier getAccessionNumber();

		 void setAccessionNumber(Identifier arg);

		 Identifier getFillerOrderNumber();

		 void setFillerOrderNumber(Identifier arg);

		 Identifier getPlacerOrderNumber();

		 void setPlacerOrderNumber(Identifier arg);

		 String getResultStatus();

		 void setResultStatus(String arg);

		 CodeableConcept getReportingPriority();

		 void setReportingPriority(CodeableConcept arg);

		 CodeableConcept getInterpretation();

		 void setInterpretation(CodeableConcept arg);

		 List<IndividualCareGiver> getResponsibleObserver();

		 void setResponsibleObserver(List<IndividualCareGiver> arg);

		public void addResponsibleObserver(IndividualCareGiver arg);

		 Organization getPerformingLaboratory();

		 void setPerformingLaboratory(Organization arg);

		 IndividualCareGiver getPerformingOrganizationMedicalDirector();

		 void setPerformingOrganizationMedicalDirector(IndividualCareGiver arg);

		 Date getResultedDateTime();

		 void setResultedDateTime(Date arg);

		 IndividualCareRecipient getFocalSubject();

		 void setFocalSubject(IndividualCareRecipient arg);

		 Specimen getSpecimenCollected();

		 void setSpecimenCollected(Specimen arg);

		 Date getSpecimenReceivedByLab();

		 void setSpecimenReceivedByLab(Date arg);

}