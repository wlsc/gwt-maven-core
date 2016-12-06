package de.wlsc.gwt.project.model;

import java.io.Serializable;

public class WelcomeResponse implements
		Serializable {

	private static final long serialVersionUID = -2592145010728048591L;

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
