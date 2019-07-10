package org.reimagineehr.model.quick.api.finding;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.finding.Observation;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.finding.ObservationalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public interface DiagnosticReport extends ObservationalFinding {


		 List<CodeableConcept> getCategory();

		 void setCategory(List<CodeableConcept> arg);

		public void addCategory(CodeableConcept arg);

		 Encounter getEncounter();

		 void setEncounter(Encounter arg);

		 List<Party> getResultsInterpreter();

		 void setResultsInterpreter(List<Party> arg);

		public void addResultsInterpreter(Party arg);

		 List<Observation> getResult();

		 void setResult(List<Observation> arg);

		public void addResult(Observation arg);

		 String getConclusion();

		 void setConclusion(String arg);

		 List<CodeableConcept> getConclusionCode();

		 void setConclusionCode(List<CodeableConcept> arg);

		public void addConclusionCode(CodeableConcept arg);

		 List<Attachment> getPresentedForm();

		 void setPresentedForm(List<Attachment> arg);

		public void addPresentedForm(Attachment arg);

		 Location getLocationPerformed();

		 void setLocationPerformed(Location arg);

}