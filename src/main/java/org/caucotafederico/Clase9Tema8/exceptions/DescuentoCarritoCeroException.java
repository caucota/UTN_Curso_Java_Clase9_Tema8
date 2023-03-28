package org.caucotafederico.Clase9Tema8.exceptions;

public class DescuentoCarritoCeroException extends Exception {
	private final String mensaje;

	public DescuentoCarritoCeroException(String descripcionError) {
		this.mensaje = descripcionError;
	}
	public String getMensaje() {
		return mensaje;
	}
	

}
