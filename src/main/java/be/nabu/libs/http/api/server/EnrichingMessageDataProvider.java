package be.nabu.libs.http.api.server;

import be.nabu.utils.mime.api.Header;
import be.nabu.utils.mime.api.ModifiablePart;

public interface EnrichingMessageDataProvider extends MessageDataProvider {
	public void enrich(ModifiablePart part, String method, String target, double version, Header...headers);
}
