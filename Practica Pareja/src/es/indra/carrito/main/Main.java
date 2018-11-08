package es.indra.carrito.main;

import java.util.ArrayList;

import es.indra.carrito.beans.impl.Cliente;
import es.indra.carrito.beans.impl.Compra;
import es.indra.carrito.beans.impl.Producto;

public class Main {
	
	
	private static ArrayList<Producto> generarProductos() {
		ArrayList<Producto> productos =  new ArrayList<>();
		
		productos.add(new Producto("Galletas", "Mantequilla", "Alimentacion", 3.50d, 20));
		productos.add(new Producto("Barritas", "Chocolate", "Alimentacion", 1.50d, 100));
		
		productos.add(new Producto("Colonia", "One Million", "Perfumeria", 16.95d, 10));
		productos.add(new Producto("Desodorante", "Roll on", "Perfumeria", 5d, 3));
		
		productos.add(new Producto("Jabon", "Liquido", "Limpieza", 10.70d, 15));
		productos.add(new Producto("KH-7", "Toxico", "Limpieza", 7d, 25));
		
		return productos;
			
		}
	
	private static ArrayList<Cliente>generarClientes(){
		ArrayList<Cliente> clientes=  new ArrayList<>();
		
		clientes.add(new Cliente("Mario", "Olariu", "calle Marques de vadillo", 123456789));
		clientes.add(new Cliente("Sergio", "Martinez", "calle principe pio", 622679838));
				
		return clientes;
		
	}

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = generarProductos();
		
		for (Producto elemento : productos) {
			System.out.println(elemento.toString());
		}
		
		
		
		
		
	}

}
