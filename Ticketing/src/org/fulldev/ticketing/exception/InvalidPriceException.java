package org.fulldev.ticketing.exception;

public class InvalidPriceException extends RuntimeException {

	public InvalidPriceException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPriceException(String message) {
		super(message);
	}

	public InvalidPriceException(Throwable cause) {
		super(cause);
	}

}
