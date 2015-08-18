package be.nabu.libs.http.api.server;

public interface MessageFramerFactory<T> {
	public MessageFramer<T> newFramer();
}
