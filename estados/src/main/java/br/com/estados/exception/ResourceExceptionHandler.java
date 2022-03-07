package br.com.estados.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		return getResponseEntityError(HttpStatus.NOT_FOUND, e);
	}

	@ExceptionHandler(EnumNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(EnumNotFoundException e, HttpServletRequest request) {
		return getResponseEntityError(HttpStatus.NOT_FOUND, e);
	}

	private ResponseEntity<StandardError> getResponseEntityError(HttpStatus status, RuntimeException e) {
		return ResponseEntity.status(status).body(new StandardError(status.value(), e.getMessage()));
	}

}
