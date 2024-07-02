package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.resource.DomainResource;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.impl.choice.N2Choice;
import org.reimagineehr.model.quick.api.choice.ResourceOrCodeChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class ResourceOrCodeChoiceImpl extends N2Choice<DomainResource,CodeableConcept> implements ResourceOrCodeChoice {


	public ResourceOrCodeChoiceImpl(Object choice) {
		super(choice);
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

	public DomainResource getResource() {
		if(getChoice() instanceof DomainResource) {
			return (DomainResource) getChoice();
		} else {
			return null;
		}
	}

	public void setResource(DomainResource resourceArg) {
		setChoice(resourceArg);
	}

	public CodeableConcept getCode() {
		if(getChoice() instanceof CodeableConcept) {
			return (CodeableConcept) getChoice();
		} else {
			return null;
		}
	}

	public void setCode(CodeableConcept codeArg) {
		setChoice(codeArg);
	}

}