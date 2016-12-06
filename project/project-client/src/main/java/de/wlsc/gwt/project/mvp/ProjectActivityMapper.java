package de.wlsc.gwt.project.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

import de.wlsc.gwt.project.mvp.activity.WelcomeActivity;
import de.wlsc.gwt.project.mvp.place.WelcomePlace;

public class ProjectActivityMapper implements
		ActivityMapper {

	private ClientFactory clientFactory;

	public ProjectActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	/* (non-Javadoc)
	 * @see com.google.gwt.activity.shared.ActivityMapper#getActivity(com.google.gwt.place.shared.Place)
	 */
	@Override
	public Activity getActivity(Place place) {

		if (place instanceof WelcomePlace) {
			return new WelcomeActivity((WelcomePlace) place, clientFactory);
		}

		return null;
	}

}
