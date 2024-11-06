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
	
	public static void unregister() {
		HTTPInterceptorManager.interceptor.set(null);
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
