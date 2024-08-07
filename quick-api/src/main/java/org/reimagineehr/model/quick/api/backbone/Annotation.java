package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.ResourceOrStringChoice;
import java.util.Date;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Mon May 11 10:30:20 PDT 2020
 * Copyright: University of Utah
 * License: Apache 2
*/
public interface Annotation extends BackboneElement {


		 ResourceOrStringChoice getAuthor();

		 void setAuthor(ResourceOrStringChoice arg);

		 Date getTime();

		 void setTime(Date arg);

		 String getText();

		 void setText(String arg);

}