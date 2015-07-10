package be.nabu.libs.http.api.server;

import be.nabu.libs.http.api.HTTPRequest;

public interface RealmHandler {
	public String getRealm(HTTPRequest request);
}
