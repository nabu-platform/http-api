package be.nabu.libs.http.api.server;

import java.net.URI;

import be.nabu.utils.mime.api.Header;

public interface URIHeader extends Header {
	public URI getURI();
}
