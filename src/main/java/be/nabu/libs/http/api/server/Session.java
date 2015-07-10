package be.nabu.libs.http.api.server;

public interface Session extends Iterable<String> {
	public String getId();
	public Object get(String name);
	public void set(String name, Object value);
	public void destroy();
}
