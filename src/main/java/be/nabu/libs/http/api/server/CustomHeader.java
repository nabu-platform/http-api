package be.nabu.libs.http.api.server;

public interface CustomHeader {
	/**
	 * The name of the header in the request
	 */
	public String getName();
	
	/**
	 * Whether or not it is allowed for the user to set this header
	 */
	public boolean isUserValueAllowed();
}
