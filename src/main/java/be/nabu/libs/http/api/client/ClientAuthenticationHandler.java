/*
* Copyright (C) 2015 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package be.nabu.libs.http.api.client;

import java.security.Principal;

/**
 * Authentication is triggered by the server: WWW-Authenticate for endpoint security, Proxy-Authenticate for proxy security
 * The following types are foreseen: Negotiate (kerberos), NTLM, Basic, Digest
 * They all work in the same way, the *-Authenticate header contains the type, a whitespace and a custom challenge
 * The response should be sent in the Authorization or Proxy-Authorization header
 */
public interface ClientAuthenticationHandler {
	public String authenticate(Principal principal, String challenge);
}
