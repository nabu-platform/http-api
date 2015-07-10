package be.nabu.libs.http.api;


public interface NTLMPrincipal extends BasicPrincipal {
	public String getDomain();
	public String getHostName();
}
