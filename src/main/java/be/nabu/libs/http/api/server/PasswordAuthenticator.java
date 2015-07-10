package be.nabu.libs.http.api.server;

public interface PasswordAuthenticator {
	public boolean isValid(String realm, String username, String password);
}
