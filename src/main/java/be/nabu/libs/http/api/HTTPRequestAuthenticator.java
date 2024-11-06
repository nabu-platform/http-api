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
