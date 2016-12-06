package de.wlsc.gwt.project.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

import de.wlsc.gwt.project.mvp.presenter.WelcomePresenter;

public interface WelcomeView extends
		IsWidget {

	void setPresenter(WelcomePresenter presenter);

}
