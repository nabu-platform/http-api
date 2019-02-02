package be.nabu.libs.http.api;

import java.util.Map;

public interface HeaderMappingProvider {
	public Map<String, String> getMappings();
}
