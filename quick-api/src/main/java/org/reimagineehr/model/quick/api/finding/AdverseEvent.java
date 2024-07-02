package org.reimagineehr.model.quick.api.finding;

import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.util.Date;
import org.reimagineehr.model.quick.api.other.Location;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.SuspectEntity;
import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.finding.AssertionalFinding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface AdverseEvent extends AssertionalFinding {


		 CodeableConcept getEvent();

		 void setEvent(CodeableConcept arg);

		 Date getDate();

		 void setDate(Date arg);

		 CodeableConcept getSeriousness();

		 void setSeriousness(CodeableConcept arg);

		 CodeableConcept getSeverity();

		 void setSeverity(CodeableConcept arg);

		 Location getLocation();

		 void setLocation(Location arg);

		 List<SuspectEntity> getSuspectEntity();

		 void setSuspectEntity(List<SuspectEntity> arg);

		public void addSuspectEntity(SuspectEntity arg);

		 List<Condition> getResultingCondition();

		 void setResultingCondition(List<Condition> arg);

		public void addResultingCondition(Condition arg);

}