package be.nabu.libs.http.api.server;

import java.security.Principal;

public interface RoleHandler {
	public boolean isUserInRole(Principal principal, String role);
}
