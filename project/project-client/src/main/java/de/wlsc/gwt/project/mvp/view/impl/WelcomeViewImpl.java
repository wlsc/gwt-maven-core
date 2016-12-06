package de.wlsc.gwt.project.mvp.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import de.wlsc.gwt.project.mvp.presenter.WelcomePresenter;
import de.wlsc.gwt.project.mvp.view.WelcomeView;

public class WelcomeViewImpl extends
		Composite implements
		WelcomeView {

	interface WelcomeViewUiBinder extends
			UiBinder<Widget, WelcomeViewImpl> {
	}

	private static WelcomeViewUiBinder uiBinder = GWT.create(WelcomeViewUiBinder.class);

	private WelcomePresenter presenter;

	public WelcomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(WelcomePresenter presenter) {
		this.presenter = presenter;
	}

}
