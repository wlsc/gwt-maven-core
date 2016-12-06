package de.wlsc.gwt.project.mvp;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;

import de.wlsc.gwt.project.App;
import de.wlsc.gwt.project.mvp.place.WelcomePlace;

public class ProjectApp {

	private EventBus eventBus;
	private ClientFactory clientFactory = App.clientFactory;

	private Place defaultPlace = new WelcomePlace();

	public ProjectApp() {
		init(clientFactory.getEventBus(), new SimplePanel());
	}

	public ProjectApp(
			EventBus eventBus,
			AcceptsOneWidget widget) {
		init(eventBus, widget);
	}

	private void init(EventBus eventBus,
			AcceptsOneWidget widget) {

		this.eventBus = eventBus;

		final PlaceController placeController = clientFactory.getPlaceController();
		final ActivityMapper activityMapper = new ProjectActivityMapper(clientFactory);
		final ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(widget);

		final ProjectPlaceHistoryMapper historyMapper = GWT.create(ProjectPlaceHistoryMapper.class);
		final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);

		historyHandler.handleCurrentHistory();
	}
}
