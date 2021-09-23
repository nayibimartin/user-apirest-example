package com.example.userapirestexample.domain.exception;

public class ResourceUpdateException extends RuntimeException {

	public ResourceUpdateException(String message) {
		super(message);
	}

	public ResourceUpdateException(Throwable cause) {
		super(cause);
	}

}
