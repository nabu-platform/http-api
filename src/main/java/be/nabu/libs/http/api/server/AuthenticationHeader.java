package be.nabu.libs.http.api.server;

import be.nabu.libs.authentication.api.Token;
import be.nabu.utils.mime.api.Header;

public interface AuthenticationHeader extends Header {
	public Token getToken();
}
