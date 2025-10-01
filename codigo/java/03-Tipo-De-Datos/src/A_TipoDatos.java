/*
PARTE 3: Tipos de datos
-
*/
public class A_TipoDatos {
    public static void main(String[] args) {
        /*
        TIPOS DE DATOS PRIMITIVOS
        Estos son los tipos básicos, no son objetos, y se almacenan directamente en memoria.
        */
        int myInt = 10; // Entero
        double myDouble = 1.70; // Decimal
        char myChar = 'a'; // Un solo carácter con ''
        String myString = "Hola, Java"; // Cadena

        // Ver tipo de dato
        System.out.println(myString.getClass().getSimpleName()); // String

        /*
        TIPOS DE DATOS NO PRIMITIVOS (O REFERENCIADOS)
        Estos no almacenan el valor directamente, sino una referencia a un objeto en la memoria.
        Clases: String, Scanner, etc
        Interfaces: List, Map, etc
        Arrays: int[], String[], etc
        Objetos personalizados: MiClase, etc.
        */

    }

}
