package Entities;

import org.caucotafederico.Clase9Tema8.exceptions.DescuentoCarritoCeroException;

public abstract class Descuento {
	private String descripcion;
	private Double valorDesc;
	
	public Descuento(String descripcion, Double valorDesc) {
		this.descripcion = descripcion;
		this.valorDesc = valorDesc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getValorDesc() {
		return valorDesc;
	}
	public void setValorDesc(Double valorDesc) {
		this.valorDesc = valorDesc;
	}
	
	public boolean verificarAplicacionDescuento(Double TotalCompra, Double MontoDescuento) throws DescuentoCarritoCeroException{
		if (TotalCompra == 0) {
			throw new DescuentoCarritoCeroException("No se puede aplicar un Descuento porque el monto total de la compra es igual a cero");
		}
		Double montoDescuento = this.getValorDesc();
		if (TotalCompra < montoDescuento) {
			throw new DescuentoCarritoCeroException("No se puede aplicar un Descuento porque el monto total de la compra ($" + TotalCompra + ") es menor al Descuento ($" + montoDescuento +")");
		}
				
		return true;
	}
	
	public abstract Double getMontoDescuento(Double TotalCompra) throws DescuentoCarritoCeroException;

}
