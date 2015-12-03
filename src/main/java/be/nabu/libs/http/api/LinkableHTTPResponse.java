package be.nabu.libs.http.api;

public interface LinkableHTTPResponse extends HTTPResponse {
	public void setRequest(HTTPRequest request);
	public HTTPRequest getRequest();
}
