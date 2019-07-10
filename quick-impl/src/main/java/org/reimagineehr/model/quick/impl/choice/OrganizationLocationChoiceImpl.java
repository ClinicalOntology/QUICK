package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.OrganizationLocationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class OrganizationLocationChoiceImpl extends N2Choice<Location,Organization> implements OrganizationLocationChoice {

	private Location location;
	private Organization organization;

	public OrganizationLocationChoiceImpl(Object choice) {
	super(choice);
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location arg) {
		this.location=arg;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization arg) {
		this.organization=arg;
	}

	public N2Choice<Location,Organization> buildChoice(Object choice) {
		if(choice != null && (Location.class.isInstance(choice) || Organization.class.isInstance(choice))) {
			N2Choice<Location,Organization> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}