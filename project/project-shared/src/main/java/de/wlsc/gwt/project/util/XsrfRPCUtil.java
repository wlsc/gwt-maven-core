package de.wlsc.gwt.project.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.HasRpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.rpc.XsrfToken;
import com.google.gwt.user.client.rpc.XsrfTokenService;
import com.google.gwt.user.client.rpc.XsrfTokenServiceAsync;

public class XsrfRPCUtil {

	private static XsrfToken xsrfToken;

	public static void addToken(final HasRpcToken rpcService) {

		if (xsrfToken == null) {

			XsrfTokenServiceAsync xsrf = (XsrfTokenServiceAsync) GWT.create(XsrfTokenService.class);
			((ServiceDefTarget) xsrf).setServiceEntryPoint(GWT.getModuleBaseURL() + "xsrf");
			xsrf.getNewXsrfToken(new AsyncCallback<XsrfToken>() {

				public void onSuccess(XsrfToken token) {
					xsrfToken = token;
					rpcService.setRpcToken(token);
				}

				public void onFailure(Throwable caught) {
					try {
						throw caught;
					} catch (RpcTokenException e) {
					} catch (Throwable e) {
					}
				}
			});
		} else {
			rpcService.setRpcToken(xsrfToken);
		}
	}
}
