package de.wlsc.gwt.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.HasRpcToken;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.XsrfProtect;

import de.wlsc.gwt.project.util.XsrfRPCUtil;

@XsrfProtect
@RemoteServiceRelativePath("app")
public interface AppService extends
		RemoteService {

	public static class Util {

		private static AppServiceAsync instance;

		public static AppServiceAsync getInstance() {

			if (instance == null) {
				instance = GWT.create(AppService.class);
				XsrfRPCUtil.addToken((HasRpcToken) instance);
			}

			return instance;
		}
	}
}
