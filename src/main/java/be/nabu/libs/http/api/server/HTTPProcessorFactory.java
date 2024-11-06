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

package be.nabu.libs.http.api.server;

import be.nabu.libs.events.api.EventDispatcher;
import be.nabu.libs.http.api.HTTPRequest;
import be.nabu.libs.http.api.HTTPResponse;
import be.nabu.libs.nio.api.ExceptionFormatter;
import be.nabu.libs.nio.api.MessageProcessorFactory;

public interface HTTPProcessorFactory extends MessageProcessorFactory<HTTPRequest, HTTPResponse> {
	public void route(String hostMatch, EventDispatcher eventDispatcher);
	public void unroute(String hostMatch);
	public EventDispatcher getDispatcher(String hostMatch);
	
	public boolean isProxied();
	public void setProxied(boolean isProxied);
	
	public ExceptionFormatter<HTTPRequest, HTTPResponse> getExceptionFormatter();
	public void setExceptionFormatter(ExceptionFormatter<HTTPRequest, HTTPResponse> exceptionFormatter);
}
