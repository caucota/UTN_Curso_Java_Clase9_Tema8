package Entities;

import org.caucotafederico.Clase9Tema8.exceptions.DescuentoCarritoCeroException;

public class DescuentoPorc extends Descuento {

	public DescuentoPorc(String descripcion, Double porcentajeDesc) {
		super(descripcion, porcentajeDesc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getMontoDescuento(Double TotalCompra) throws DescuentoCarritoCeroException {
		Double montoDescuento = TotalCompra * this.getValorDesc() / 100;
		verificarAplicacionDescuento(TotalCompra, montoDescuento);
		return montoDescuento;
		
	}

}
