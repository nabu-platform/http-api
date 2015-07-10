package be.nabu.libs.http.api.server;

import be.nabu.utils.mime.api.ExpectContinueHandler;

public interface HTTPExpectContinueHandler extends ExpectContinueHandler {
	public void setRequestLine(String method, String target);
}
