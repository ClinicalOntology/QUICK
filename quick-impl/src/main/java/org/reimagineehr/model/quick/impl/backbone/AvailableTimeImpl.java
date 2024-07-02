package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.AvailableTime;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.time.LocalTime;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class AvailableTimeImpl extends BackboneElementImpl implements AvailableTime {

	private List<String> daysOfWeek;
	private Boolean allDay;
	private LocalTime availableStartTime;
	private LocalTime availableEndTime;

	public List<String> getDaysOfWeek() {
		return this.daysOfWeek;
	}

	public void setDaysOfWeek(List<String> arg) {
		this.daysOfWeek=arg;
	}

	public void addDaysOfWeek(String arg) {
		this.daysOfWeek.add(arg);
	}

	public Boolean getAllDay() {
		return this.allDay;
	}

	public void setAllDay(Boolean arg) {
		this.allDay=arg;
	}

	public LocalTime getAvailableStartTime() {
		return this.availableStartTime;
	}

	public void setAvailableStartTime(LocalTime arg) {
		this.availableStartTime=arg;
	}

	public LocalTime getAvailableEndTime() {
		return this.availableEndTime;
	}

	public void setAvailableEndTime(LocalTime arg) {
		this.availableEndTime=arg;
	}

}