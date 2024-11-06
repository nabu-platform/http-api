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

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.Future;

import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.utils.mime.impl.FormatException;

public interface NIOHTTPClient extends TimedHTTPClient {
	public Future<HTTPResponse> call(HTTPRequest request, boolean secure) throws IOException, FormatException, ParseException;
}
