package be.nabu.libs.http.api;

public interface HTTPInterceptor {
	public HTTPEntity intercept(HTTPEntity entity);
}
