package de.wlsc.gwt.project.resource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface LocaleStrings extends
		Messages {

	static class Util {

		private static LocaleStrings INSTANCE;

		public static LocaleStrings getInstance() {
			if (INSTANCE == null) {
				INSTANCE = GWT.create(LocaleStrings.class);
			}
			return INSTANCE;
		}
	}

	String welcome();
}
