package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.finding.Condition;
import org.reimagineehr.model.quick.api.finding.Observation;
import org.reimagineehr.model.quick.api.event.MedicationStatement;
import org.reimagineehr.model.quick.api.request.ServiceRequest;
import org.reimagineehr.model.quick.impl.choice.N4Choice;
import org.reimagineehr.model.quick.api.choice.GoalChoice;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:41 PDT 2019
 * Copyright: Claude Nanjo
 * License: Apache 2
*/
public class GoalChoiceImpl extends N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> implements GoalChoice {

	private Condition condition;
	private Observation observation;
	private MedicationStatement medicationStatement;
	private ServiceRequest serviceRequest;

	public GoalChoiceImpl(Object choice) {
	super(choice);
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition arg) {
		this.condition=arg;
	}

	public Observation getObservation() {
		return this.observation;
	}

	public void setObservation(Observation arg) {
		this.observation=arg;
	}

	public MedicationStatement getMedicationStatement() {
		return this.medicationStatement;
	}

	public void setMedicationStatement(MedicationStatement arg) {
		this.medicationStatement=arg;
	}

	public ServiceRequest getServiceRequest() {
		return this.serviceRequest;
	}

	public void setServiceRequest(ServiceRequest arg) {
		this.serviceRequest=arg;
	}

	public N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> buildChoice(Object choice) {
		if(choice != null && (Condition.class.isInstance(choice) || Observation.class.isInstance(choice) || MedicationStatement.class.isInstance(choice) || ServiceRequest.class.isInstance(choice))) {
			N4Choice<Condition,Observation,MedicationStatement,ServiceRequest> myChoice = new N4Choice<>(choice);
			return myChoice;
		} else if(choice == null) {
			throw new RuntimeException("A choice type must have a value.");
		} else {
			throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
		}
	}

}