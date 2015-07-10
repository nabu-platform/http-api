package be.nabu.libs.http;

public class UnknownFrameException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnknownFrameException() {
		super();
	}

	public UnknownFrameException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownFrameException(String message) {
		super(message);
	}

	public UnknownFrameException(Throwable cause) {
		super(cause);
	}

}
