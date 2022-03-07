package br.com.estados.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private static final String STANDARD_MESSAGE = "Objeto não foi encontrado.";

	public ObjectNotFoundException() {
		super(STANDARD_MESSAGE);
	}

	public ObjectNotFoundException(Long id) {
		super(STANDARD_MESSAGE + " Id:" + id);
	}

	public ObjectNotFoundException(Long id, Class<?> clazz) {
		super(STANDARD_MESSAGE + " Id:" + id + ", Tipo: " + clazz.getName());
	}

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Exception ex) {
		super(msg, ex);
	}

}
