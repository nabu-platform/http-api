package be.nabu.libs.http.api.server;

import java.security.cert.Certificate;

import javax.net.ssl.SSLContext;

import be.nabu.utils.mime.api.Header;

public interface SecurityHeader extends Header {
	public SSLContext getSecurityContext();
	public Certificate [] getPeerCertificates();
}
