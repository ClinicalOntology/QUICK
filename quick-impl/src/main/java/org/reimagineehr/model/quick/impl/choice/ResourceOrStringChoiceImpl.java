package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.resource.DomainResource;
import java.lang.String;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.ResourceOrStringChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ResourceOrStringChoiceImpl extends N2Choice<DomainResource,String> implements ResourceOrStringChoice {

	private DomainResource resource;
	private String string;

	public ResourceOrStringChoiceImpl(Object choice) {
	super(choice);
	}

	public DomainResource getResource() {
		return this.resource;
	}

	public void setResource(DomainResource arg) {
		this.resource=arg;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String arg) {
		this.string=arg;
	}

	public N2Choice<DomainResource,String> buildChoice(Object choice) {
		if(choice != null && (DomainResource.class.isInstance(choice) || String.class.isInstance(choice))) {
			N2Choice<DomainResource,String> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}