package org.reimagineehr.model.quick.impl.datatype;

import org.reimagineehr.model.quick.impl.datatype.DatatypeImpl;
import org.reimagineehr.model.quick.api.datatype.Meta;
import java.lang.String;
import java.util.Date;
import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Coding;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:19 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public class MetaImpl extends DatatypeImpl implements Meta {

	private String versionId;
	private Date lastUpdated;
	private String source;
	private List<String> profile;
	private List<Coding> security;
	private List<Coding> tag;

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String arg) {
		this.versionId=arg;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date arg) {
		this.lastUpdated=arg;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String arg) {
		this.source=arg;
	}

	public List<String> getProfile() {
		return this.profile;
	}

	public void setProfile(List<String> arg) {
		this.profile=arg;
	}

	public void addProfile(String arg) {
		this.profile.add(arg);
	}

	public List<Coding> getSecurity() {
		return this.security;
	}

	public void setSecurity(List<Coding> arg) {
		this.security=arg;
	}

	public void addSecurity(Coding arg) {
		this.security.add(arg);
	}

	public List<Coding> getTag() {
		return this.tag;
	}

	public void setTag(List<Coding> arg) {
		this.tag=arg;
	}

	public void addTag(Coding arg) {
		this.tag.add(arg);
	}

}