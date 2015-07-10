package be.nabu.libs.http.api.server;

import java.io.IOException;

import be.nabu.libs.events.api.EventDispatcher;

public interface HTTPServer {
	public EventDispatcher getEventDispatcher();
	public void start() throws IOException;
	public void stop();
}
