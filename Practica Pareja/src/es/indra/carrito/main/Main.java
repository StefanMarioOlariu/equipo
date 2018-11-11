package es.indra.carrito.main;

import java.util.ArrayList;

import es.indra.carrito.beans.impl.Cliente;
import es.indra.carrito.beans.impl.Compra;
import es.indra.carrito.beans.impl.Producto;
import es.indra.carrito.services.WriteFile;

public class Main {

	private static ArrayList<Producto> generarProductos() {
		ArrayList<Producto> productos = new ArrayList<>();

		productos.add(new Producto("Galletas", "Mantequilla", "Alimentacion", 3.50d, 20));
		productos.add(new Producto("Barritas", "Chocolate", "Alimentacion", 1.50d, 100));

		productos.add(new Producto("Colonia", "One Million", "Perfumeria", 16.95d, 10));
		productos.add(new Producto("Desodorante", "Roll on", "Perfumeria", 5d, 3));

		productos.add(new Producto("Jabon", "Liquido", "Limpieza", 10.70d, 15));
		productos.add(new Producto("KH-7", "Toxico", "Limpieza", 7d, 25));

		return productos;

	}

	private static ArrayList<Cliente> generarClientes() {
		ArrayList<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("Mario", "Olariu", "calle Marques de vadillo", 123456789));
		clientes.add(new Cliente("Sergio", "Martinez", "calle principe pio", 622679838));

		return clientes;

	}

	public static void main(String[] args) {

		ArrayList<Producto> productos = generarProductos();
		ArrayList<Cliente> clientes = generarClientes();
		ArrayList<Compra> compra = new ArrayList<Compra>();

		int cantidad = 2;

		for (Producto elemento : productos) {
			System.out.println(elemento.toStringCompleto());
		}

		for (Cliente elemento : clientes) {
			System.out.println(elemento.toStringCompleto());
		}

		System.out.println("\nNuestro cliente: " + clientes.get(1).getNombre() + " quiere comprar " + cantidad
				+ " barritas y 4 desodorantes");

		if (productos.get(1).stockDisponible(productos.get(1), cantidad)) {
			System.out.println("Se pueden comprar todas las barritas.");
		} else {
			System.out.println("No hay stock disponible, solo hay " + productos.get(1).getCantidad() + " unidades.");
		}

		if (productos.get(3).stockDisponible(productos.get(3), 4)) {
			System.out.println("Se pueden comprar todos los desodorantes.");
		} else {
			System.out.println("No hay stock disponible, solo hay " + productos.get(3).getCantidad() + " unidades.");
		}

		double precio = productos.get(1).getPrecio() * cantidad;
		System.out.println("Como no hay stock del desodorante solo puede "
				+ "comprar las 2 barritas con un precio total de: " + precio);

		compra.add(new Compra("11/11/2018", productos.get(1), clientes.get(1), cantidad));
		compra.add(new Compra("11/11/2018", productos.get(1), clientes.get(0), cantidad));
		System.out.println(compra.get(0).toString());

		WriteFile wf = new WriteFile();

		for (int i = 0; i < compra.size(); i++) {
			wf.escribirHistorial(compra.get(i));
		}

	}

}
