package be.nabu.libs.http.api.server;

import be.nabu.libs.events.api.EventDispatcher;
import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.libs.nio.api.ExceptionFormatter;
import be.nabu.libs.nio.api.MessageProcessorFactory;

public interface HTTPProcessorFactory extends MessageProcessorFactory<HTTPRequest, HTTPResponse> {
	public void route(String hostMatch, EventDispatcher eventDispatcher);
	public void unroute(String hostMatch);
	
	public boolean isProxied();
	public void setProxied(boolean isProxied);
	
	public ExceptionFormatter<HTTPRequest, HTTPResponse> getExceptionFormatter();
	public void setExceptionFormatter(ExceptionFormatter<HTTPRequest, HTTPResponse> exceptionFormatter);
}
