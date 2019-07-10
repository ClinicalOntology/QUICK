package org.reimagineehr.model.quick.api.backbone;

import org.reimagineehr.model.quick.api.choice.ResourceOrStringChoice;
import java.util.Date;
import java.lang.String;
import org.reimagineehr.model.quick.api.backbone.BackboneElement;


/**
 * Author: Claude Nanjo
 * GENERATED CODE - DO NOT EDIT
 * Generated or updated on: Tue Jul 09 15:15:42 PDT 2019
 * Copyright: Claude Nanjo
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