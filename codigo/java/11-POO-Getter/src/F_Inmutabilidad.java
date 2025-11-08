/*
INMUTABILIDAD EN JAVA
- Una vez que se le asignan valores a los atributos, estos valores no se pueden modificar.
- Tipos de datos
    * Primitivos | Inmutables: No son objetos. Se copian por valor, no por referencia
    * No primitivos | Objeto : String(inmutable), ArrayList, Persona; por referencia
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class F_Inmutabilidad {
    public static void main(String[] args) {

        System.out.println("|====== INMUTABILIDAD ======|");

        // Primitivos | Inmutables
        System.out.println("\n**** Primitivos inmutables ****");
        // Variables primitivos
        int a = 10; // 10
        int b = a; // Copia el valor
        b = 20; // 20

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // No primitivos | String(Inmutable)
        System.out.println("\n**** No Primitivos: String (Inmutables) ****");
        String s1 = "Hola"; // Referencia original | Objeto
        String s2 = s1; // Apunta a la misma referencia | Objeto
        String s3 = s1 + " Mundo"; // Crea un nuevo objeto

        System.out.println("Original: " + s1);
        System.out.println("Referencia: " + s2);
        System.out.println("Otra referencia: " + s3);

        System.out.println("NOTA: Clases envolventes (Integer,Double, Boolean, etc) son inmutables");

        // No primitivos | Lista(Mutable)
        System.out.println("\n**** No Primitivos: Lista (Mutables) ****");
        ArrayList<String> lista1 = new ArrayList<>();
        System.out.println("|== Original");
        System.out.println("Lista 1: " + lista1); // Vacía | Referencia

        lista1.add("A"); // Añadiendo

        System.out.println("Original: " + lista1); // Añade

        ArrayList<String> lista2 = lista1; // Apunta a la misma referencia
        System.out.println("|== Referencia: ");
        System.out.println("Lista 2: " + lista2);

        lista2.add("B"); // Modifica al valor de la referencia

        System.out.println("|== Apunta al mismo objetos:");
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        ArrayList<String> lista3 = new ArrayList<>(lista1);
        System.out.println("|== Creación de un nuevo objeto");
        System.out.println("Lista 3: " + lista3);
        lista3.add("C"); // Añade | No modifica es un nuevo objeto

        System.out.println("|== Comparación: ");
        System.out.println("Lista 3: " + lista3); // No es la misma referencia
        System.out.println("Lista 1: " + lista1);

    }
}
