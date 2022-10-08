package be.nabu.libs.http.api;

import javax.jws.WebParam;
import javax.jws.WebResult;

public interface HTTPRequestAuthenticator {
	// return whether or not you succeeded in authenticating this
	@WebResult(name = "authenticated")
	public boolean authenticate(
		// the request to authenticate
		@WebParam(name = "request") HTTPRequest request,
		// the system might have an explicit context configured
		@WebParam(name = "context") String context,
		// when it is preemtive authentication, this is not filled in
		// when it is in response to a failed authentication, we will send back the triggering response, it might have more information
		@WebParam(name = "trigger") HTTPResponse trigger,
		// suppose you have supplied a credential that has a timeout and we got back an unauthorized, it might be timed out
		// force a refresh and try again
		@WebParam(name = "refresh") boolean refresh);
}
