package be.nabu.libs.http.api.server;

import be.nabu.libs.authentication.api.Device;
import be.nabu.utils.mime.api.Header;

public interface DeviceResolver {
	public Device getDevice(Header...headers);
}
