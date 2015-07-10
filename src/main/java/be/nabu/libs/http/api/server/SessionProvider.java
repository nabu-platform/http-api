package be.nabu.libs.http.api.server;

public interface SessionProvider {
	public Session getSession(String sessionId);
	public Session newSession();
}
