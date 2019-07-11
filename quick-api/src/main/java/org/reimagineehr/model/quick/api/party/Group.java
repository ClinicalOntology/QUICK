package org.reimagineehr.model.quick.api.party;

import java.lang.Boolean;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.GroupCharacteristic;
import org.reimagineehr.model.quick.api.backbone.GroupMember;
import org.reimagineehr.model.quick.api.party.CareRecipient;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Group extends CareRecipient {


		 Boolean getActive();

		 void setActive(Boolean arg);

		 String getType();

		 void setType(String arg);

		 Boolean getActual();

		 void setActual(Boolean arg);

		 CodeableConcept getCode();

		 void setCode(CodeableConcept arg);

		 String getName();

		 void setName(String arg);

		 Integer getQuantity();

		 void setQuantity(Integer arg);

		 Party getManagingEntity();

		 void setManagingEntity(Party arg);

		 List<GroupCharacteristic> getCharacteristic();

		 void setCharacteristic(List<GroupCharacteristic> arg);

		public void addCharacteristic(GroupCharacteristic arg);

		 List<GroupMember> getMember();

		 void setMember(List<GroupMember> arg);

		public void addMember(GroupMember arg);

}