package de.wlsc.gwt.project.mvp;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

import de.wlsc.gwt.project.mvp.view.WelcomeView;
import de.wlsc.gwt.project.resource.LocaleStrings;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	LocaleStrings getStrings();

	WelcomeView getWelcomeView();
}
