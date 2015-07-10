package be.nabu.libs.http.api;

public interface HTTPResponse extends HTTPEntity {
	public int getCode();
	public String getMessage();
}
