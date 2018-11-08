package es.indra.carrito.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public void escribirHistorial() {
		File archivo = new File("historial.txt");
		
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write("");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
