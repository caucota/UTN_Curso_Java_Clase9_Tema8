package org.caucotafederico.Clase9Tema8;

import static org.junit.Assert.assertEquals;

import org.caucotafederico.Clase9Tema8.exceptions.DescuentoCarritoCeroException;
import org.junit.Test;

import Entities.Carrito;
import Entities.Descuento;
import Entities.DescuentoPorMonto;
import Entities.DescuentoPorc;
import Entities.DescuentoPorcConTope;
import Entities.ItemCarrito;
import Entities.Persona;
import Entities.Producto;

public class CarritoTest {
	/*
	@Test
	public void test1_probarTotalCarrito()  {
		Producto prodTest = new Producto("", 0.0);
	
		Descuento descuentoCarrito = new DescuentoPorMonto("SIN DESCUENTO", 0.0);		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		carritoCompra.setDesc(descuentoCarrito);
		
		prodTest = new Producto("Pan", 25.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 1));
		prodTest = new Producto("Queso", 100.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 2));
		prodTest = new Producto("Leche", 85.5 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 6));

		Double rtdoEsperado = 738.0;

		
		try {
			assertEquals(rtdoEsperado, carritoCompra.calcularTotalConDescuento());
		} catch (DescuentoCarritoCeroException e) {
			System.out.println(e.getMensaje());
		}
	
	}
	
	*/
	
	@Test
	public void test2_probarTotalCarrito() {
		Producto prodTest = new Producto("", 0.0);
	
		Descuento descuentoCarrito = new DescuentoPorMonto("DESCUENTO FIJO", 10.0);		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		carritoCompra.setDesc(descuentoCarrito);
		
		prodTest = new Producto("Pan", 0.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 1));
		prodTest = new Producto("Queso", 0.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 2));
		prodTest = new Producto("Leche", 0.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 6));

		Double rtdoEsperado = 0.0;
		
		try {
			assertEquals(rtdoEsperado, carritoCompra.calcularTotalConDescuento());
		} catch (DescuentoCarritoCeroException e) {
			System.out.println(e.getMensaje());
		}
	}
	 
	@Test
	public void test3_probarConDescuentoFijo() {
		Producto prodTest = new Producto("", 0.0);
	
		Descuento descuentoCarrito = new DescuentoPorMonto("DESCUENTO FIJO", 1880.0);		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		carritoCompra.setDesc(descuentoCarrito);
		
		prodTest = new Producto("Pan", 25.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 1));
		prodTest = new Producto("Queso", 100.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 2));
		prodTest = new Producto("Leche", 85.5 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 6));

		Double rtdoEsperado = 1140.0;
		
		try {
			assertEquals(rtdoEsperado, carritoCompra.calcularTotalConDescuento());
		} catch (DescuentoCarritoCeroException e) {
			System.out.println(e.getMensaje());
		}
	}
	
	/*
	@Test
	public void test4_probarConDescuentoPorPorcentaje() {
		Producto prodTest = new Producto("", 0.0);
	
		Descuento descuentoCarrito = new DescuentoPorc("DESCUENTO PORCENTAJE", 10.0);		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		carritoCompra.setDesc(descuentoCarrito);
		
		prodTest = new Producto("Pan", 25.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 1));
		prodTest = new Producto("Queso", 100.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 2));
		prodTest = new Producto("Leche", 85.5 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 6));

		Double rtdoEsperado = 2400.0;

		
		try {
			assertEquals(rtdoEsperado, carritoCompra.calcularTotalConDescuento());
		} catch (DescuentoCarritoCeroException e) {
			System.out.println(e.getMensaje());
		}

	}

	@Test
	public void test5_probarConDescuentoPorPorcentajeConTope() {
		Producto prodTest = new Producto("", 0.0);
	
		Descuento descuentoCarrito = new DescuentoPorcConTope("DESCUENTO PORCENTAJE CON TOPE", 10.0, 22.0);		
		Persona cliente = new Persona("Perez", "Juan", "1512455");
		Carrito carritoCompra = new Carrito(cliente);
		carritoCompra.setDesc(descuentoCarrito);
		
		prodTest = new Producto("Pan", 25.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 1));
		prodTest = new Producto("Queso", 100.0 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 2));
		prodTest = new Producto("Leche", 85.5 );
		carritoCompra.appendItemCarrito(new ItemCarrito(prodTest, 6));

		Double rtdoEsperado = 716.0;
		
		try {
			assertEquals(rtdoEsperado, carritoCompra.calcularTotalConDescuento());
		} catch (DescuentoCarritoCeroException e) {
			System.out.println(e.getMensaje());
		}

	}
	*/


}
