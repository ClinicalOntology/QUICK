package org.reimagineehr.model.quick.wrapper.backbone;

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
 * Generated or updated on: Thu Jul 11 13:57:04 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public class TimingRepeatWrapper implements TimingRepeat {

	private org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent adaptee;

	public TimingRepeatWrapper() {
	
	}

	public TimingRepeatWrapper(org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent adaptee) {
		this.adaptee = adaptee;
	}

	public org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent getAdaptee() {
		return this.adaptee;
	}

	public void setAdaptee(org.hl7.fhir.dstu3.model.Timing.TimingRepeatComponent arg) {
		this.adaptee=arg;
	}

	public TimeIntervalChoice getBounds() {
	
		Object choice = null;
		org.hl7.fhir.dstu3.model.Type type = this.adaptee.getBounds();
		if(type instanceof org.hl7.fhir.dstu3.model.Duration) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.DurationWrapper((org.hl7.fhir.dstu3.model.Duration)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.Range) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper((org.hl7.fhir.dstu3.model.Range)type);
		} else if(type instanceof org.hl7.fhir.dstu3.model.Period) {
			choice = new org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper((org.hl7.fhir.dstu3.model.Period)type);
		}
		return new org.reimagineehr.model.quick.impl.choice.TimeIntervalChoiceImpl(choice);
	}

	public void setBounds(TimeIntervalChoice arg) {
	
		TimeIntervalChoice choice = arg;
		if(choice.getDuration() != null) {
			this.adaptee.setBounds(((org.reimagineehr.model.quick.wrapper.datatype.DurationWrapper)choice.getDuration()).getAdaptee());
		}else if(choice.getRange() != null) {
			this.adaptee.setBounds(((org.reimagineehr.model.quick.wrapper.datatype.RangeWrapper)choice.getRange()).getAdaptee());
		}else if(choice.getPeriod() != null) {
			this.adaptee.setBounds(((org.reimagineehr.model.quick.wrapper.datatype.PeriodWrapper)choice.getPeriod()).getAdaptee());
		}
	}

	public Integer getCount() {
	return this.adaptee.getCountElement().getValue();
	}

	public void setCount(Integer arg) {
	this.adaptee.setCount(arg);
	}

	public Integer getCountMax() {
	return this.adaptee.getCountMaxElement().getValue();
	}

	public void setCountMax(Integer arg) {
	this.adaptee.setCountMax(arg);
	}

	public BigDecimal getDuration() {
	return this.adaptee.getDurationElement().getValue();
	}

	public void setDuration(BigDecimal arg) {
	this.adaptee.setDuration(arg);
	}

	public BigDecimal getDurationMax() {
	return this.adaptee.getDurationMaxElement().getValue();
	}

	public void setDurationMax(BigDecimal arg) {
	this.adaptee.setDurationMax(arg);
	}

	public String getDurationUnit() {
		if (this.adaptee.getDurationUnit() != null) {
			return this.adaptee.getDurationUnit().toCode();
		} else {
			return null;
		}
	}

	public void setDurationUnit(String arg) {
		if (arg != null) {
			this.adaptee.setDurationUnit(org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.fromCode(arg));
		}
	}

	public Integer getFrequency() {
	return this.adaptee.getFrequencyElement().getValue();
	}

	public void setFrequency(Integer arg) {
	this.adaptee.setFrequency(arg);
	}

	public Integer getFrequencyMax() {
	return this.adaptee.getFrequencyMaxElement().getValue();
	}

	public void setFrequencyMax(Integer arg) {
	this.adaptee.setFrequencyMax(arg);
	}

	public BigDecimal getPeriod() {
	return this.adaptee.getPeriodElement().getValue();
	}

	public void setPeriod(BigDecimal arg) {
	this.adaptee.setPeriod(arg);
	}

	public BigDecimal getPeriodMax() {
	return this.adaptee.getPeriodMaxElement().getValue();
	}

	public void setPeriodMax(BigDecimal arg) {
	this.adaptee.setPeriodMax(arg);
	}

	public String getPeriodUnit() {
		if (this.adaptee.getPeriodUnit() != null) {
			return this.adaptee.getPeriodUnit().toCode();
		} else {
			return null;
		}
	}

	public void setPeriodUnit(String arg) {
		if (arg != null) {
			this.adaptee.setPeriodUnit(org.hl7.fhir.dstu3.model.Timing.UnitsOfTime.fromCode(arg));
		}
	}

	public List<String> getDayOfWeek() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getDayOfWeek() != null) {
			for(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Timing.DayOfWeek> type: this.adaptee.getDayOfWeek()) {
				retVals.add(type.getValueAsString());
			}
		}return retVals;
	}

	public void setDayOfWeek(java.util.List<String> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Timing.DayOfWeek>> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add((new org.hl7.fhir.dstu3.model.Timing.DayOfWeekEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(type)));
			}
		}
		this.adaptee.setDayOfWeek(values);
	}

	public void addDayOfWeek(String arg) {
	this.adaptee.addDayOfWeek(org.hl7.fhir.dstu3.model.Timing.DayOfWeek.fromCode(arg));
	}

	public List<LocalTime> getTimeOfDay() {
		java.util.List<LocalTime> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getTimeOfDay() != null) {
			for(org.hl7.fhir.dstu3.model.TimeType type: this.adaptee.getTimeOfDay()) {
				retVals.add(LocalTime.parse(type.getValue()));
			}
		}
		return retVals;
	}

	public void setTimeOfDay(java.util.List<LocalTime> arg) {
	
		java.util.List<org.hl7.fhir.dstu3.model.TimeType> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(LocalTime type: arg) {
				values.add(new org.hl7.fhir.dstu3.model.TimeType(type.toString()));
			}
		}
		this.adaptee.setTimeOfDay(values);
	}

	public void addTimeOfDay(LocalTime arg) {
	
		this.adaptee.addTimeOfDay(arg.toString());
	}

	public List<String> getWhen() {
		java.util.List<String> retVals = new java.util.ArrayList<>();
		if(this.adaptee.getWhen() != null) {
			for(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Timing.EventTiming> type: this.adaptee.getWhen()) {
				retVals.add(type.getValueAsString());
			}
		}return retVals;
	}

	public void setWhen(java.util.List<String> arg) {
		java.util.List<org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Timing.EventTiming>> values = new java.util.ArrayList<>();
		if(arg != null) {
			for(String type: arg) {
				values.add((new org.hl7.fhir.dstu3.model.Timing.EventTimingEnumFactory()).fromType(new org.hl7.fhir.dstu3.model.CodeType(type)));
			}
		}
		this.adaptee.setWhen(values);
	}

	public void addWhen(String arg) {
	this.adaptee.addWhen(org.hl7.fhir.dstu3.model.Timing.EventTiming.fromCode(arg));
	}

	public Integer getOffset() {
	return this.adaptee.getOffsetElement().getValue();
	}

	public void setOffset(Integer arg) {
	this.adaptee.setOffset(arg);
	}

}