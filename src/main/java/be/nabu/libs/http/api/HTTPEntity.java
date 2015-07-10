package be.nabu.libs.http.api;

import be.nabu.utils.mime.api.ModifiablePart;

public interface HTTPEntity {
	public ModifiablePart getContent();
	public double getVersion();
}
