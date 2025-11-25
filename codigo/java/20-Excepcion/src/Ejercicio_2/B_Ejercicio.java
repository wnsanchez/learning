package Ejercicio_2;

import java.io.FileReader;
import java.io.IOException;

// CON THROWS
public class B_Ejercicio {
    public static void leerArchivo(String ruta) throws IOException {
        FileReader fr = new FileReader(ruta);
        System.out.println("Archivo abierto correctamente");
    }

    public static void main(String[] args) {
        try {
            leerArchivo("jsjs.sk");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
