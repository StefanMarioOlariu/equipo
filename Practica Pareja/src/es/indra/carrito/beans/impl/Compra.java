package es.indra.carrito.beans.impl;


public class Compra {

	String fecha;
	Producto producto;
	int cantidad;
	/**
	 * @param fecha
	 * @param producto
	 * @param cantidad
	 */
	public Compra(String fecha, Producto producto, int cantidad) {
		super();
		this.fecha = fecha;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
			
}
