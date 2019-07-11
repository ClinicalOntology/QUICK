package org.reimagineehr.model.quick.wrapper.party;

import org.reimagineehr.model.quick.api.party.Group;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Meta;
import org.reimagineehr.model.quick.api.datatype.Narrative;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import java.lang.Boolean;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import java.lang.Integer;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.backbone.GroupCharacteristic;
import org.reimagineehr.model.quick.api.backbone.GroupMember;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class GroupWrapper implements Group {

	private org.hl7.fhir.dstu3.model.Group adaptee;

	public GroupWrapper() {
	
	}

	public GroupWrapper(org.hl7.fhir.dstu3.model.Group adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Group getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Group arg) {
		this.adaptee=arg;
	}

	public String getId() {
	return this.adaptee.getIdElement().getValue();
	}

	public void setId(String arg) {
	this.adaptee.setId(arg);
	}

	public Meta getMeta() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.MetaWrapper(this.adaptee.getMeta());
	}

	public void setMeta(Meta arg) {
	
		this.adaptee.setMeta(((org.reimagineehr.model.quick.wrapper.datatype.MetaWrapper)arg).getAdaptee());
	}

	public String getImplicitRules() {
	return this.adaptee.getImplicitRulesElement().getValue();
	}

	public void setImplicitRules(String arg) {
	this.adaptee.setImplicitRules(arg);
	}

	public String getLanguage() {
	return this.adaptee.getLanguageElement().getValue();
	}

	public void setLanguage(String arg) {
	this.adaptee.setLanguage(arg);
	}

	public Narrative getText() {
	
		return new org.reimagineehr.model.quick.wrapper.datatype.NarrativeWrapper(this.adaptee.getText());
	}

	public void setText(Narrative arg) {
	
		this.adaptee.setText(((org.reimagineehr.model.quick.wrapper.datatype.NarrativeWrapper)arg).getAdaptee());
	}

	public List<Identifier> getIdentifier() {
		List<org.reimagineehr.model.quick.api.datatype.Identifier> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Identifier> items = this.adaptee.getIdentifier();
		for(org.hl7.fhir.dstu3.model.Identifier item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper(item));
		}
		return returnList;
	}

	public void setIdentifier(java.util.List<Identifier> arg) {
		List<org.hl7.fhir.dstu3.model.Identifier> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.datatype.Identifier item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper)item).getAdaptee());
		}
		this.adaptee.setIdentifier(targetList);
	}

	public void addIdentifier(Identifier arg) {
		this.adaptee.addIdentifier(((org.reimagineehr.model.quick.wrapper.datatype.IdentifierWrapper)arg).getAdaptee());
	}

	public Boolean getActive() {
	return this.adaptee.getActiveElement().getValue();
	}

	public void setActive(Boolean arg) {
	this.adaptee.setActive(arg);
	}

	public String getType() {
		org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Group.GroupType>  item = this.adaptee.getTypeElement();
		return item.getValueAsString();
	}

	public void setType(String arg) {
		this.adaptee.setTypeElement((new org.hl7.fhir.dstu3.model.Group.GroupTypeEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(arg)));
	}

	public Boolean getActual() {
	return this.adaptee.getActualElement().getValue();
	}

	public void setActual(Boolean arg) {
	this.adaptee.setActual(arg);
	}

	public CodeableConcept getCode() {
	return new org.reimagineehr.model.quick.wrapper.datatype.CodeableConceptWrapper(this.adaptee.getCode());
	}

	public void setCode(CodeableConcept arg) {
	this.adaptee.setCode(org.reimagineehr.model.quick.utils.Stu3Utils.getAsFhirCodeableConcept(arg));
	}

	public String getName() {
	return this.adaptee.getNameElement().getValue();
	}

	public void setName(String arg) {
	this.adaptee.setName(arg);
	}

	public Integer getQuantity() {
	return this.adaptee.getQuantityElement().getValue();
	}

	public void setQuantity(Integer arg) {
	this.adaptee.setQuantity(arg);
	}

	public Party getManagingEntity() {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public void setManagingEntity(Party arg) {
	throw new RuntimeException("QUICK attribute currently unsupported in FHIR DSTU3)");
	}

	public List<GroupCharacteristic> getCharacteristic() {
		List<org.reimagineehr.model.quick.api.backbone.GroupCharacteristic> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent> items = this.adaptee.getCharacteristic();
		for(org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.GroupCharacteristicWrapper(item));
		}
		return returnList;
	}

	public void setCharacteristic(java.util.List<GroupCharacteristic> arg) {
		List<org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.GroupCharacteristic item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.GroupCharacteristicWrapper)item).getAdaptee());
		}
		this.adaptee.setCharacteristic(targetList);
	}

	public void addCharacteristic(GroupCharacteristic arg) {
		this.adaptee.addCharacteristic(((org.reimagineehr.model.quick.wrapper.backbone.GroupCharacteristicWrapper)arg).getAdaptee());
	}

	public List<GroupMember> getMember() {
		List<org.reimagineehr.model.quick.api.backbone.GroupMember> returnList = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Group.GroupMemberComponent> items = this.adaptee.getMember();
		for(org.hl7.fhir.dstu3.model.Group.GroupMemberComponent item : items) {
			returnList.add(new org.reimagineehr.model.quick.wrapper.backbone.GroupMemberWrapper(item));
		}
		return returnList;
	}

	public void setMember(java.util.List<GroupMember> arg) {
		List<org.hl7.fhir.dstu3.model.Group.GroupMemberComponent> targetList = new java.util.ArrayList<>();
		for(org.reimagineehr.model.quick.api.backbone.GroupMember item : arg) {
			targetList.add(((org.reimagineehr.model.quick.wrapper.backbone.GroupMemberWrapper)item).getAdaptee());
		}
		this.adaptee.setMember(targetList);
	}

	public void addMember(GroupMember arg) {
		this.adaptee.addMember(((org.reimagineehr.model.quick.wrapper.backbone.GroupMemberWrapper)arg).getAdaptee());
	}

}