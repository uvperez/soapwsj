package org.soapwsj;

public class MiscUtils {

	public static <T>T checkNotNull(T value) {
		if (value == null)
			throw new NullPointerException("Error campo es invalido");
		return value;
	}

}
