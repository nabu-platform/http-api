package be.nabu.libs.http.api;

import java.security.Principal;

public interface BasicPrincipal extends Principal {
	public String getPassword();
}
