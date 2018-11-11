/**
 * 
 */
package es.indra.carrito.beans.impl;


/**
 * @author aula16
 *
 */
public class Producto{
	
	String nombre, descripcion, categoria;
	double precio;
	int cantidad;
	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 */
	/**
	 * @param nombre
	 * @param descripcion
	 * @param categoria
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, String descripcion, String categoria, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidad = cantidad;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	public Producto aumentarCantidad(Producto p,int cantidad) {
		Producto producto = p;
		producto.setCantidad(producto.getCantidad()+cantidad);
		
		return producto;
	}
	
	
	public String toStringCompleto() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", precio="
				+ precio + ", cantidad=" + cantidad + "]";
	}
	public String toString() {
		return nombre + ";" + precio;
	}
	public Producto disminuirCantidad(Producto p,int cantidad) {
		Producto producto = p;
		producto.setCantidad(producto.getCantidad()-cantidad);
		
		return producto;
	}
	
	public static boolean stockDisponible(Producto p, int cantidad) {
		boolean disponible = true;
		
		if (p.getCantidad() <= cantidad) {
			disponible = false;
		}
		return disponible;
	}
	

	
	
}
