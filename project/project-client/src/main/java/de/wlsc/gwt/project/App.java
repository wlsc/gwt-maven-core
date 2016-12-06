package de.wlsc.gwt.project;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;

import de.wlsc.gwt.project.mvp.ClientFactory;
import de.wlsc.gwt.project.mvp.ProjectApp;
import de.wlsc.gwt.project.resource.Resources;

public class App implements
		EntryPoint {

	public static ClientFactory clientFactory = GWT.create(ClientFactory.class);

	public static final AppServiceAsync mainService = GWT.create(AppService.class);

	private final SimplePanel container = new SimplePanel();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		initResources();
		initApp();
	}

	private void initResources() {

		// inject CSS
		Resources.INSTANCE.resetCss().ensureInjected();
		Resources.INSTANCE.appCss().ensureInjected();
	}

	private void initApp() {

		final EventBus eventBus = clientFactory.getEventBus();

		new ProjectApp(eventBus, container);

		RootPanel.get().add(container);
	}
}
