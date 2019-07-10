package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class ResourceOrCodeChoiceImpl extends N2Choice<DomainResource,CodeableConcept> implements ResourceOrCodeChoice {

	private DomainResource resource;
	private CodeableConcept code;

	public ResourceOrCodeChoiceImpl(Object choice) {
	super(choice);
	}

	public DomainResource getResource() {
		return this.resource;
	}

	public void setResource(DomainResource arg) {
		this.resource=arg;
	}

	public CodeableConcept getCode() {
		return this.code;
	}

	public void setCode(CodeableConcept arg) {
		this.code=arg;
	}

	public N2Choice<DomainResource,CodeableConcept> buildChoice(Object choice) {
		if(choice != null && (DomainResource.class.isInstance(choice) || CodeableConcept.class.isInstance(choice))) {
			N2Choice<DomainResource,CodeableConcept> myChoice = new N2Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}