package be.nabu.libs.http.api.server;

import java.security.Principal;

public interface ServerAuthenticationHandler {
	/**
	 * This authenticates the given principal in the given realm
	 * It returns the id of the user in that realm
	 */
	public String authenticate(String realm, Principal principal);
}
