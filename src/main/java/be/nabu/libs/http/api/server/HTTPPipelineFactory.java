package be.nabu.libs.http.api.server;

import be.nabu.libs.nio.api.PipelineFactory;

public interface HTTPPipelineFactory extends PipelineFactory {
	public HTTPProcessorFactory getProcessorFactory();
	public MessageDataProvider getMessageDataProvider();
	public void setMessageDataProvider(MessageDataProvider messageDataProvider);
}
