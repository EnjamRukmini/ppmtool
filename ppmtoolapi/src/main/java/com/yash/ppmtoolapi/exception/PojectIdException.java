package com.yash.ppmtoolapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PojectIdException extends RuntimeException {

	private static final long serialVersionUID=1L;
	
	
	public PojectIdException(String errMsg) {
		super(errMsg);
	}
}
