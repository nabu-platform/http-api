package be.nabu.libs.http.api.client;

public interface ProxyBypassFilter {
	public boolean bypass(String host, int port);
}
