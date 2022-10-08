package be.nabu.libs.http.api;

public interface HTTPRequestAuthenticatorProvider {
	public HTTPRequestAuthenticator getRequestAuthenticator(String name);
}
