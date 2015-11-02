package be.nabu.libs.http.api.server;

import be.nabu.libs.events.api.EventDispatcher;
import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.libs.nio.api.ExceptionFormatter;
import be.nabu.libs.nio.api.Server;

public interface HTTPServer extends Server {
	public MessageDataProvider getMessageDataProvider();
	public void setMessageDataProvider(MessageDataProvider messageDataProvider);
	
	public void route(String hostMatch, EventDispatcher eventDispatcher);
	public void unroute(String hostMatch);
	public EventDispatcher getDispatcher(String hostMatch);
	
	public ExceptionFormatter<HTTPRequest, HTTPResponse> getExceptionFormatter();
	public void setExceptionFormatter(ExceptionFormatter<HTTPRequest, HTTPResponse> exceptionFormatter);
	
	public boolean isProxied();
	public void setProxied(boolean isProxied);
}
