package be.nabu.libs.http.api.server;

import be.nabu.libs.nio.api.PipelineFactory;

public interface HTTPPipelineFactory extends PipelineFactory {
	public HTTPProcessorFactory getProcessorFactory();
	public MessageDataProvider getMessageDataProvider();
	public void setMessageDataProvider(MessageDataProvider messageDataProvider);
	public long getReadTimeout();
	public void setReadTimeout(long timeout);
	public long getWriteTimeout();
	public void setWriteTimeout(long timeout);
	public int getRequestLimit();
	public void setRequestLimit(int limit);
	public int getResponseLimit();
	public void setResponseLimit(int limit);
}
