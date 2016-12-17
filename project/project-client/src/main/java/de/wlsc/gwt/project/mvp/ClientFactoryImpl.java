package de.wlsc.gwt.project.mvp;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

import de.wlsc.gwt.project.mvp.model.WelcomeModel;
import de.wlsc.gwt.project.mvp.model.impl.WelcomeModelImpl;
import de.wlsc.gwt.project.mvp.view.WelcomeView;
import de.wlsc.gwt.project.mvp.view.impl.WelcomeViewImpl;
import de.wlsc.gwt.project.resource.LocaleStrings;

public class ClientFactoryImpl implements
		ClientFactory {

	private static EventBus eventBus;

	private static PlaceController placeController;

	private static LocaleStrings localeStrings;

	private static WelcomeModel welcomeModel;

	private static WelcomeView welcomeView;

	@Override
	public EventBus getEventBus() {

		if (eventBus == null) {
			eventBus = new SimpleEventBus();
		}
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {

		if (placeController == null) {
			placeController = new PlaceController(getEventBus());
		}
		return placeController;
	}

	@Override
	public LocaleStrings getStrings() {

		if (localeStrings == null) {
			localeStrings = LocaleStrings.Util.getInstance();
		}

		return localeStrings;
	}

	@Override
	public WelcomeModel getWelcomeModel() {

		if (welcomeModel == null) {
			welcomeModel = new WelcomeModelImpl();
		}

		return welcomeModel;
	}

	@Override
	public WelcomeView getWelcomeView() {

		if (welcomeView == null) {
			welcomeView = new WelcomeViewImpl();
		}

		return welcomeView;
	}

}
