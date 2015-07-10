package be.nabu.libs.http.api.server;

import java.security.Principal;

import be.nabu.utils.mime.api.Header;

public interface AuthenticationHeader extends Header {
	public Principal getPrincipal();
}
