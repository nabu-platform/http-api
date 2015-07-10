package be.nabu.libs.http.api.client;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;

import javax.net.ssl.SSLContext;

/**
 * A connection handler for http clients
 * It should allow reuse of connections over multiple requests
 */
public interface ConnectionHandler extends Closeable {
	
	public SSLContext getSecureContext();
	public Socket connect(String host, int port, boolean secure) throws IOException;
	
	/**
	 * Release the connection back into the pool without necessarily closing it
	 */
	public void release(Socket socket) throws IOException;
	
	/**
	 * Close the socket, useful when there are no persistent connections
	 */
	public void close(Socket socket) throws IOException;

	/**
	 * Get the proxy (if any) for the connections
	 * This is needed to authenticate to the proxy if necessary
	 */
	public Proxy getProxy();
	
	public int getSocketTimeout();
	public int getConnectionTimeout();
}
