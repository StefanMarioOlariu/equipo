/**
 * 
 */
package es.indra.carrito.beans.impl;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author aula16
 *
 */
public class Cliente {
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
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre + ";" + apellido;
	}
	
	public void comparProductos(ArrayList<Producto> productos, ArrayList<Integer> cantidad){
		
	}
	
}
