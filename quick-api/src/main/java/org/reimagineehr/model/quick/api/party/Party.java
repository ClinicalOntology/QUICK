package org.reimagineehr.model.quick.api.party;

import java.util.List;
import org.reimagineehr.model.quick.api.datatype.Identifier;
import org.reimagineehr.model.quick.api.resource.DomainResource;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Thu Jul 11 00:39:54 PDT 2019
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Party extends DomainResource {


		 List<Identifier> getIdentifier();

		 void setIdentifier(List<Identifier> arg);

		public void addIdentifier(Identifier arg);

}