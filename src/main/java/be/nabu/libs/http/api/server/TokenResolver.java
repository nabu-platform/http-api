package be.nabu.libs.http.api.server;

import be.nabu.libs.authentication.api.Token;
import be.nabu.utils.mime.api.Header;

public interface TokenResolver {
	public Token getToken(Header...headers);
}
