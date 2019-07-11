package org.reimagineehr.model.quick.impl.party;

import org.reimagineehr.model.quick.impl.party.CareRecipientImpl;
import org.reimagineehr.model.quick.api.party.Group;
import java.lang.Boolean;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.party.Party;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.GroupCharacteristic;
import org.reimagineehr.model.quick.api.backbone.GroupMember;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GroupImpl extends CareRecipientImpl implements Group {

	private Boolean active;
	private String type;
	private Boolean actual;
	private CodeableConcept code;
	private String name;
	private Integer quantity;
	private Party managingEntity;
	private List<GroupCharacteristic> characteristic;
	private List<GroupMember> member;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean arg) {
		this.active=arg;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String arg) {
		this.type=arg;
	}

	public Boolean getActual() {
		return this.actual;
	}

	public void setActual(Boolean arg) {
		this.actual=arg;
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name=arg;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer arg) {
		this.quantity=arg;
	}

	public Party getManagingEntity() {
		return this.managingEntity;
	}

	public void setManagingEntity(Party arg) {
		this.managingEntity=arg;
	}

	public List<GroupCharacteristic> getCharacteristic() {
		return this.characteristic;
	}

	public void setCharacteristic(List<GroupCharacteristic> arg) {
		this.characteristic=arg;
	}

	public void addCharacteristic(GroupCharacteristic arg) {
		this.characteristic.add(arg);
	}

	public List<GroupMember> getMember() {
		return this.member;
	}

	public void setMember(List<GroupMember> arg) {
		this.member=arg;
	}

	public void addMember(GroupMember arg) {
		this.member.add(arg);
	}

}