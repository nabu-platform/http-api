package be.nabu.libs.http.api.server;

import be.nabu.libs.http.HTTPException;
import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;

public interface HTTPExceptionFormatter {
	public HTTPResponse format(HTTPRequest request, HTTPException e);
}
