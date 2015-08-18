package be.nabu.libs.http.api.server;

import java.io.Closeable;
import java.io.IOException;

import be.nabu.libs.http.UnknownFrameException;
import be.nabu.utils.io.api.ByteBuffer;
import be.nabu.utils.io.api.PushbackContainer;

public interface MessageFramer<T> extends Closeable {
	/**
	 * Push data to the framer
	 */
	public void push(PushbackContainer<ByteBuffer> content) throws UnknownFrameException, IOException;
	/**
	 * Check whether or not it is identified as a correct frame
	 */
	public boolean isIdentified();
	/**
	 * Check whether or not the parsing is done
	 */
	public boolean isDone();
	/**
	 * Whether or not the data was considered closed
	 */
	public boolean isClosed();
	/**
	 * Get the message (only works if isDone() returns true)
	 */
	public T getMessage();
}
