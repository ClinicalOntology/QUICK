package org.reimagineehr.model.quick.impl.backbone;

import org.reimagineehr.model.quick.impl.backbone.BackboneElementImpl;
import org.reimagineehr.model.quick.api.backbone.TimingRepeat;
import org.reimagineehr.model.quick.api.choice.TimeIntervalChoice;
import java.lang.Integer;
import java.math.BigDecimal;
import java.lang.String;
import java.util.List;
import java.time.LocalTime;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class TimingRepeatImpl extends BackboneElementImpl implements TimingRepeat {

	private TimeIntervalChoice bounds;
	private Integer count;
	private Integer countMax;
	private BigDecimal duration;
	private BigDecimal durationMax;
	private String durationUnit;
	private Integer frequency;
	private Integer frequencyMax;
	private BigDecimal period;
	private BigDecimal periodMax;
	private String periodUnit;
	private List<String> dayOfWeek;
	private List<LocalTime> timeOfDay;
	private List<String> when;
	private Integer offset;

	public TimeIntervalChoice getBounds() {
		return this.bounds;
	}

	public void setBounds(TimeIntervalChoice arg) {
		this.bounds=arg;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer arg) {
		this.count=arg;
	}

	public Integer getCountMax() {
		return this.countMax;
	}

	public void setCountMax(Integer arg) {
		this.countMax=arg;
	}

	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal arg) {
		this.duration=arg;
	}

	public BigDecimal getDurationMax() {
		return this.durationMax;
	}

	public void setDurationMax(BigDecimal arg) {
		this.durationMax=arg;
	}

	public String getDurationUnit() {
		return this.durationUnit;
	}

	public void setDurationUnit(String arg) {
		this.durationUnit=arg;
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer arg) {
		this.frequency=arg;
	}

	public Integer getFrequencyMax() {
		return this.frequencyMax;
	}

	public void setFrequencyMax(Integer arg) {
		this.frequencyMax=arg;
	}

	public BigDecimal getPeriod() {
		return this.period;
	}

	public void setPeriod(BigDecimal arg) {
		this.period=arg;
	}

	public BigDecimal getPeriodMax() {
		return this.periodMax;
	}

	public void setPeriodMax(BigDecimal arg) {
		this.periodMax=arg;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String arg) {
		this.periodUnit=arg;
	}

	public List<String> getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(List<String> arg) {
		this.dayOfWeek=arg;
	}

	public void addDayOfWeek(String arg) {
		this.dayOfWeek.add(arg);
	}

	public List<LocalTime> getTimeOfDay() {
		return this.timeOfDay;
	}

	public void setTimeOfDay(List<LocalTime> arg) {
		this.timeOfDay=arg;
	}

	public void addTimeOfDay(LocalTime arg) {
		this.timeOfDay.add(arg);
	}

	public List<String> getWhen() {
		return this.when;
	}

	public void setWhen(List<String> arg) {
		this.when=arg;
	}

	public void addWhen(String arg) {
		this.when.add(arg);
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer arg) {
		this.offset=arg;
	}

}