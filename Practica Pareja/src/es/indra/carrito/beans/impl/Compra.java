package es.indra.carrito.beans.impl;


public class Compra {

	String fecha;
	Producto producto;
	Cliente cliente;
	int cantidad;
	/**
	 * @param fecha
	 * @param producto
	 * @param cantidad
	 */
	public Compra(String fecha, Producto producto, Cliente cliente, int cantidad) {
		super();
		this.fecha = fecha;
		this.producto = producto;
		this.cliente = cliente;
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return fecha + ";" + producto + ";" + cliente;
	}
	
			
}
