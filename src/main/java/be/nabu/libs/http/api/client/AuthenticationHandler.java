package be.nabu.libs.http.api.client;

import java.security.Principal;

/**
 * Authentication is triggered by the server: WWW-Authenticate for endpoint security, Proxy-Authenticate for proxy security
 * The following types are foreseen: Negotiate (kerberos), NTLM, Basic, Digest
 * They all work in the same way, the *-Authenticate header contains the type, a whitespace and a custom challenge
 * The response should be sent in the Authorization or Proxy-Authorization header
 */
public interface AuthenticationHandler {
	public String authenticate(Principal principal, String challenge);
}
