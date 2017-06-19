package be.nabu.libs.http.api.client;

import java.io.Closeable;
import java.io.IOException;
import java.security.Principal;
import java.text.ParseException;

import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.utils.mime.impl.FormatException;

public interface HTTPClient extends Closeable {
	public HTTPResponse execute(HTTPRequest request, Principal principal, boolean secure, boolean followRedirects) throws IOException, FormatException, ParseException;
}
