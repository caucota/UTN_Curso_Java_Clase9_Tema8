package Entities;

import org.caucotafederico.Clase9Tema8.exceptions.DescuentoCarritoCeroException;

public class DescuentoPorMonto extends Descuento {

	public DescuentoPorMonto(String descripcion, Double valorDesc) {
		super(descripcion, valorDesc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getMontoDescuento(Double TotalCompra) throws DescuentoCarritoCeroException{
		Double montoDescuento = this.getValorDesc();
		verificarAplicacionDescuento(TotalCompra, montoDescuento);
		return montoDescuento;
		
	}

}
