package de.wlsc.gwt.project.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class WelcomePlace extends
		Place {

	public WelcomePlace() {
	}

	public static class Tokenizer implements
			PlaceTokenizer<WelcomePlace> {

		private String token;

		public WelcomePlace getPlace(String token) {
			this.token = token;
			return new WelcomePlace();
		}

		public String getToken(WelcomePlace place) {
			return token;
		}
	}
}
