package br.com.estados.exception;

public class EnumNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private static final String STANDARD_MESSAGE = "Valor da Enumeração está incorreto.";

	public EnumNotFoundException() {
		super(STANDARD_MESSAGE);
	}

	public EnumNotFoundException(String value) {
		super(STANDARD_MESSAGE + " Valor:" + value);
	}

	public EnumNotFoundException(String value, Class<?> clazz) {
		super(STANDARD_MESSAGE + " Valor:" + value + ", Tipo: " + clazz.getName());
	}

	public EnumNotFoundException(Exception ex) {
		super(STANDARD_MESSAGE, ex);
	}

}
