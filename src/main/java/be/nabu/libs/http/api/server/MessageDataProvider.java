package be.nabu.libs.http.api.server;

import java.io.IOException;

import be.nabu.libs.resources.api.ReadableResource;
import be.nabu.libs.resources.api.WritableResource;
import be.nabu.utils.mime.api.Header;

public interface MessageDataProvider {
	public <T extends WritableResource & ReadableResource> T newResource(String method, String target, double version, Header...headers) throws IOException;
}
