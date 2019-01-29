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
	public HTTPException(int code, String message, Throwable cause, Token token) {
		this(code, message, cause);
		this.token = token;
	}

	public HTTPException(int code, String message) {
		super(message == null ? HTTPCodes.getMessage(code) : message);
		this.code = code;
	}
	public HTTPException(int code, String message, Token token) {
		this(code, message);
		this.token = token;
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
}
