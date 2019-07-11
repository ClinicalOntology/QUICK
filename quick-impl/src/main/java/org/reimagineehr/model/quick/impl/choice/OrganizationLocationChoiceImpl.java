package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.other.Location;
import org.reimagineehr.model.quick.api.party.Organization;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.OrganizationLocationChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class OrganizationLocationChoiceImpl extends N2Choice<Location,Organization> implements OrganizationLocationChoice {


	public OrganizationLocationChoiceImpl(Object choice) {
		super(choice);
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

	public Location getLocation() {
		if(getChoice() instanceof Location) {
			return (Location) getChoice();
		} else {
			return null;
		}
	}

	public void setLocation(Location locationArg) {
		setChoice(locationArg);
	}

	public Organization getOrganization() {
		if(getChoice() instanceof Organization) {
			return (Organization) getChoice();
		} else {
			return null;
		}
	}

	public void setOrganization(Organization organizationArg) {
		setChoice(organizationArg);
	}

}