/**
 * 
 */
package es.indra.carrito.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author aula16
 *
 */
public class Cliente {
	private Map<String, ArrayList> historial;
	private String nombre, apellido, direccion;
	private int telefono;

	/**
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(String nombre, String apellido, String direccion, int telefono) {
		super();
		historial = new HashMap<>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Map<String, ArrayList> getHistorial() {
		return historial;
	}

	public void setHistorial(Map<String, ArrayList> historial) {
		this.historial = historial;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	public void comprar(String fecha, ArrayList<Producto> productos, ArrayList<Integer> cantidades) {
		ArrayList temp = new ArrayList<>();
		temp.add(productos);
		temp.add(cantidades);
		historial.put(fecha, temp);
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public void verCompras() { //recorre todas las compras

		System.out.println("El cliente " + nombre + " ha comprado: ");
		double total = 0;
		Iterator<String> ite = historial.keySet().iterator();

		while (ite.hasNext()) {// recorre cada compra
			total = total + verCompraPorFecha((String) ite.next());
		}
		System.out.println("\n Total de las compras: " + total + "€");
	}

	public String toStringCompleto() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

	@Override
	public String toString() {
		return nombre + ";" + apellido;
	}

	public double verCompraPorFecha(String fecha) {
		double total = 0d;
		ArrayList conjunto = (ArrayList) historial.get(fecha);

		ArrayList<Producto> productos = (ArrayList<Producto>) conjunto.get(0);
		ArrayList<Integer> cantidades = (ArrayList<Integer>) conjunto.get(1);

		System.out.println("\n - " + fecha);

		for (int i = 0; i < productos.size(); i++) {// j recorre cada producto en la compra y las cantidades
			Producto prodTemp = productos.get(i);

			total = total + (prodTemp.getPrecio() * cantidades.get(i));
			System.out.println("\t- " + prodTemp.getNombre() + " : " + cantidades.get(i));// multiplica precio por
																							// cantidad y multiplica
		}
		System.out.println("El total de esta compra es: " + total);
		return total;
	}

}