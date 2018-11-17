package org.soapwsj;

public class SoapException extends RuntimeException {
	private static final long serialVersionUID = -8694112531801390089L;

	public SoapException(String message) {
		super(message);
	}

	public SoapException(String message, Throwable cause) {
		super(message, cause);
	}

}
