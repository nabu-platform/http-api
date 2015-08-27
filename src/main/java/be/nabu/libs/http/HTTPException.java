package be.nabu.libs.http;

public class HTTPException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int code;
	
	public HTTPException(int code) {
		super(HTTPCodes.getMessage(code));
		this.code = code;
	}

	public HTTPException(int code, String message, Throwable cause) {
		super(message == null ? HTTPCodes.getMessage(code) : message, cause);
		this.code = code;
	}

	public HTTPException(int code, String message) {
		super(message == null ? HTTPCodes.getMessage(code) : message);
		this.code = code;
	}

	public HTTPException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
