package be.nabu.libs.http.api;

public interface ContentRewriter {
	public String rewrite(String content, String mimeType);
}
