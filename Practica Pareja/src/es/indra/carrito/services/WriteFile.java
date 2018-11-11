package es.indra.carrito.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import es.indra.carrito.beans.impl.Compra;

public class WriteFile {
	public void escribirHistorial(Compra c) {
		File archivo = new File("historial.txt");
				
		try {
			FileWriter fw = new FileWriter(archivo,true);
			fw.write(c.toString());
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
