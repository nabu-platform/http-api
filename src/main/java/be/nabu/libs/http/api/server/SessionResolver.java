package be.nabu.libs.http.api.server;

import be.nabu.utils.mime.api.Header;

public interface SessionResolver {
	public Session getSession(Header...headers);
}
