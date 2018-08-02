/**
 * 
 */
package com.tsiry.org.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Tsiry MANANKASINA
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND) // This ensures that Spring boot responds
										// with a 404 Not Found status when this
										// exception is thrown.
public class MyFileNotFoundException extends Exception {
	public MyFileNotFoundException(String message) {
		super(message);
	}

	public MyFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
