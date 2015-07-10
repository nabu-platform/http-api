package be.nabu.libs.http.api.client;

import java.io.IOException;
import java.net.Socket;
import java.security.Principal;

public interface Proxy {
	/**
	 * This allows the connection manager to tunnel through a proxy
	 * 
	 * @param host The host we want to tunnel to
	 * @param port The port we want to connect on
	 * @param connectionTimeout 
	 * @param socketTimeout
	 * @param secure Whether or not the target connection will be secured. You should _not_ attempt to establish the SSLSocket yourself as the SSLContext is not known to you. It will be wrapped around this socket.
	 * @return A socket or perhaps an SSLSocket but then it only secures the connection to the proxy, a new SSLSocket will be layered over it for the endpoint
	 */
	public Socket tunnel(String host, int port, int connectionTimeout, int socketTimeout, boolean secure) throws IOException;
	
	/**
	 * The principal used to authenticate to this proxy (if any)
	 */
	public Principal getPrincipal();
}
