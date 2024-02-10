package be.nabu.libs.http.api.client;

import java.io.IOException;
import java.security.Principal;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.utils.mime.impl.FormatException;

public interface TimedHTTPClient extends HTTPClient {
	public default HTTPResponse execute(HTTPRequest request, Principal principal, boolean secure, boolean followRedirects, Long timeout, TimeUnit unit) throws IOException, FormatException, ParseException {
		return execute(request, principal, secure, followRedirects);
	}
}
