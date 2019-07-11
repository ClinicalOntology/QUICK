package org.reimagineehr.model.quick.impl.finding;

import org.reimagineehr.model.quick.impl.finding.ObservationalFindingImpl;
import org.reimagineehr.model.quick.api.finding.DiagnosticReport;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.CodeableConcept;
import org.reimagineehr.model.quick.api.event.Encounter;
import org.reimagineehr.model.quick.api.party.Party;
import org.reimagineehr.model.quick.api.finding.Observation;
import java.lang.String;
import org.reimagineehr.model.quick.api.datatype.Attachment;
import org.reimagineehr.model.quick.api.other.Location;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class DiagnosticReportImpl extends ObservationalFindingImpl implements DiagnosticReport {

	private List<CodeableConcept> category;
	private Encounter encounter;
	private List<Party> resultsInterpreter;
	private List<Observation> result;
	private String conclusion;
	private List<CodeableConcept> conclusionCode;
	private List<Attachment> presentedForm;
	private Location locationPerformed;

	public List<CodeableConcept> getCategory() {
		return this.category;
	}

	public void setCategory(List<CodeableConcept> arg) {
		this.category=arg;
	}

	public void addCategory(CodeableConcept arg) {
		this.category.add(arg);
	}

	public Encounter getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounter arg) {
		this.encounter=arg;
	}

	public List<Party> getResultsInterpreter() {
		return this.resultsInterpreter;
	}

	public void setResultsInterpreter(List<Party> arg) {
		this.resultsInterpreter=arg;
	}

	public void addResultsInterpreter(Party arg) {
		this.resultsInterpreter.add(arg);
	}

	public List<Observation> getResult() {
		return this.result;
	}

	public void setResult(List<Observation> arg) {
		this.result=arg;
	}

	public void addResult(Observation arg) {
		this.result.add(arg);
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String arg) {
		this.conclusion=arg;
	}

	public List<CodeableConcept> getConclusionCode() {
		return this.conclusionCode;
	}

	public void setConclusionCode(List<CodeableConcept> arg) {
		this.conclusionCode=arg;
	}

	public void addConclusionCode(CodeableConcept arg) {
		this.conclusionCode.add(arg);
	}

	public List<Attachment> getPresentedForm() {
		return this.presentedForm;
	}

	public void setPresentedForm(List<Attachment> arg) {
		this.presentedForm=arg;
	}

	public void addPresentedForm(Attachment arg) {
		this.presentedForm.add(arg);
	}

	public Location getLocationPerformed() {
		return this.locationPerformed;
	}

	public void setLocationPerformed(Location arg) {
		this.locationPerformed=arg;
	}

}