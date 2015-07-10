package be.nabu.libs.http.api;

public interface HTTPRequest extends HTTPEntity {
	public String getMethod();
	public String getTarget();
}
