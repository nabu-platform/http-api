package be.nabu.libs.http;

import be.nabu.libs.http.api.HTTPEntity;
import be.nabu.libs.http.api.HTTPInterceptor;

public class HTTPInterceptorManager {
	private static ThreadLocal<HTTPInterceptor> interceptor = new ThreadLocal<HTTPInterceptor>();
	
	public static HTTPInterceptor getInterceptor() {
		return interceptor.get();
	}
	
	public static void register(HTTPInterceptor interceptor) {
		HTTPInterceptorManager.interceptor.set(interceptor);
	}
	
	public static void unregister(HTTPInterceptor interceptor) {
		HTTPInterceptorManager.interceptor.set(null);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends HTTPEntity> T intercept(T entity) {
		if (interceptor.get() != null) {
			HTTPEntity intercept = interceptor.get().intercept(entity);
			if (intercept != null) {
				return (T) intercept;
			}
		}
		return entity;
	}
}
