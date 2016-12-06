package de.wlsc.gwt.project.resource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

import de.wlsc.gwt.project.resource.css.AppCss;
import de.wlsc.gwt.project.resource.css.BaseCss;

public interface Resources extends
		ClientBundle {

	public static final Resources INSTANCE = GWT.create(Resources.class);

	@Source("css/reset.gss")
	CssResource resetCss();

	@Source({ "css/base.gss", "css/app.gss" })
	AppCss appCss();

	@Source({ "css/base.gss" })
	BaseCss baseCss();

}
