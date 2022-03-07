package br.com.estados.enums;

import br.com.estados.exception.EnumNotFoundException;

public enum RegiaoEnum {

	NORTE("Norte"),
	SUL("Sul"),
	NORDESTE("Nordeste"),
	CENTRO_OESTE("Centro-Oeste"), 
	SUDESTE("Sudeste");

	private String value;

	private RegiaoEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static RegiaoEnum getEnum(String value) {
		for (RegiaoEnum e : values()) {
			if (e.getValue().equalsIgnoreCase(value)) {
				return e;
			}
		}
		throw new EnumNotFoundException(value, RegiaoEnum.class);
	}

}
