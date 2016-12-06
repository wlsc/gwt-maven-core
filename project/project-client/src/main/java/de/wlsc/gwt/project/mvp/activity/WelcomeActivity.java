package de.wlsc.gwt.project.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import de.wlsc.gwt.project.mvp.ClientFactory;
import de.wlsc.gwt.project.mvp.place.WelcomePlace;
import de.wlsc.gwt.project.mvp.presenter.WelcomePresenter;
import de.wlsc.gwt.project.mvp.view.WelcomeView;

public class WelcomeActivity extends
		AbstractActivity implements
		WelcomePresenter {

	private ClientFactory clientFactory;

	private WelcomeView welcomeView;

	public WelcomeActivity(WelcomePlace place,
			ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.activity.shared.Activity#start(com.google.gwt.user.client.ui.AcceptsOneWidget, com.google.gwt.event.shared.EventBus)
	 */
	@Override
	public void start(AcceptsOneWidget panel,
			EventBus eventBus) {

		welcomeView = clientFactory.getWelcomeView();
		panel.setWidget(welcomeView.asWidget());
		bind();
	}

	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

	public void bind() {
		welcomeView.setPresenter(this);
	}
}
