package com.furnitureManagementSystem.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.furnitureManagementSystem.rest.model.response.ErrorMessage;

public class FurnitureServiceException extends RuntimeException {
	private static final long serialVersionUID = 8601674281650156365L;
	private HttpStatus status;

	public FurnitureServiceException(String message, HttpStatus status) {
		super(message);

		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public ResponseEntity<Object> getErrorResponse() {
		ErrorMessage errorMessage = new ErrorMessage(new Date(), this.getMessage());
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), this.getStatus());
	}
}
