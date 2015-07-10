package be.nabu.libs.http.api.server;

import be.nabu.libs.resources.api.ReadableResource;
import be.nabu.libs.resources.api.WritableResource;

public interface MessageDataProvider {
	public <T extends WritableResource & ReadableResource> T newResource(Long size);
}
