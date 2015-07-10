package be.nabu.libs.http;

public class HTTPException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int code;
	
	public HTTPException(int code) {
		super();
		this.code = code;
	}

	public HTTPException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public HTTPException(int code, String message) {
		super(message);
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
