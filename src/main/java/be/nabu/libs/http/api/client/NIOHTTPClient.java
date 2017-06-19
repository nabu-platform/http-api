package be.nabu.libs.http.api.client;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.Future;

import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.utils.mime.impl.FormatException;

public interface NIOHTTPClient extends HTTPClient {
	public Future<HTTPResponse> call(HTTPRequest request, boolean secure) throws IOException, FormatException, ParseException;
}
