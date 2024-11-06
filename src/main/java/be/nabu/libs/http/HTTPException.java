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

package be.nabu.libs.http;

import java.util.ArrayList;
import java.util.List;

import be.nabu.libs.authentication.api.Device;
import be.nabu.libs.authentication.api.Token;

public class HTTPException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int code;
	private Token token;
	private Device device;
	private List<String> context = new ArrayList<String>();
	private String description;
	
	public HTTPException(int code) {
		super(HTTPCodes.getMessage(code));
		this.code = code;
	}
	public HTTPException(int code, Token token) {
		this(code);
		this.token = token;
	}

	public HTTPException(int code, String message, Throwable cause) {
		super(message == null ? HTTPCodes.getMessage(code) : message, cause);
		this.code = code;
	}
	public HTTPException(int code, String message, String description, Throwable cause) {
		this(code, message, cause);
		this.description = description;
	}
	public HTTPException(int code, String message, Throwable cause, Token token) {
		this(code, message, cause);
		this.token = token;
	}
	public HTTPException(int code, String message, String description, Throwable cause, Token token) {
		this(code, message, cause, token);
		this.description = description;
	}

	public HTTPException(int code, String message) {
		super(message == null ? HTTPCodes.getMessage(code) : message);
		this.code = code;
	}
	public HTTPException(int code, String message, String description) {
		this(code, message);
		this.description = description;
	}
	
	public HTTPException(int code, String message, Token token) {
		this(code, message);
		this.token = token;
	}
	public HTTPException(int code, String message, String description, Token token) {
		this(code, message, token);
		this.description = description;
	}
	
	public HTTPException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}
	public HTTPException(int code, Throwable cause, Token token) {
		this(code, cause);
		this.token = token;
	}

	public int getCode() {
		return code;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
	
	public List<String> getContext() {
		return context;
	}
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
