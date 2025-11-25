/*
Manejar una Checked Exception
 */

package Ejercicio_2;

import java.io.FileReader;
import java.io.IOException;

public class A_Ejercicio {
    public static void leerArchivo(String ruta) {
        try {
            FileReader fr = new FileReader(ruta);
            System.out.println("Archivo abierto correctamente");
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage() );
        }
    }

    public static void main(String[] args) {
        leerArchivo("app.js");
    }
}
