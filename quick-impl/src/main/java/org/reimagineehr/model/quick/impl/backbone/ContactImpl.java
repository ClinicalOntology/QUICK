package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.Contact;
import org.reimagineehr.model.quick.api.backbone.HumanName;
import java.util.List;
import org.reimagineehr.model.quick.api.backbone.ContactPoint;
import org.reimagineehr.model.quick.api.backbone.Address;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ContactImpl extends BackboneElementImpl implements Contact {

	private HumanName name;
	private List<ContactPoint> telecom;
	private Address address;

	public HumanName getName() {
		return this.name;
	}

	public void setName(HumanName arg) {
		this.name=arg;
	}

	public List<ContactPoint> getTelecom() {
		return this.telecom;
	}

	public void setTelecom(List<ContactPoint> arg) {
		this.telecom=arg;
	}

	public void addTelecom(ContactPoint arg) {
		this.telecom.add(arg);
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address arg) {
		this.address=arg;
	}

}