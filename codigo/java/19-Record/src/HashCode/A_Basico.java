/*
HASHCODE: Claculos
String: está basado en los caracteres de la cadena.

*/

package HashCode;

import java.util.HashSet;

public class A_Basico {
    // 1. Tipos primitivos
    static void ejemploPrimitivos() {
        int num = 190;
        boolean bool = true;
        char letra = 'A';

        System.out.println("hashCode de int: " + Integer.hashCode(num));
        System.out.println("hashCode de boolean: " + Boolean.hashCode(bool));
        System.out.println("hashCode de char: " + Character.hashCode(letra));

    }

    // 2. Ejemplo con tipo String (no primitivo)
    static void ejemploString() {
        String str = "Hola";
        System.out.println("hashCode de String: " + str.hashCode()) ; // // 2251088 (basado en la cadena "Hola")
    }

    // 3. Ejemplo con tipo Object (Sin sobreescribir hachCode)
    static void ejemploObject() {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("hashCode de o1 (Object): " + o1.hashCode()); // Basado en la referencia de memoria
        System.out.println("hashCode de o2 (Object): " + o2.hashCode()); // Basado en la referencia de memoria

    }

    // 4. Ejemplo con un Array
    static void ejemploArray() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println("hashCode de array1: " + array1.hashCode());
        System.out.println("hashCode de array2: " + array2.hashCode());

    }

    // Ejemplo con una clase personalizada (con hashCode sobreescrito)
    static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public int hashCode() {
            // Usamos una combinación de atributos para calcular el hash
            return 31 * nombre.hashCode() + edad;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Persona persona = (Persona) obj;
            return edad == persona.edad && nombre.equals(persona.nombre);
        }

    }

    static void ejemploPersona() {
        Persona p1 = new Persona("Carlos", 30);
        Persona p2 = new Persona("Carlos", 30);

        // Verificando si los objetos son iguales y tienen el mismo hashCode
        System.out.println("p1 y p2 son iguales: " + p1.equals(p2)); // true
        System.out.println("hashCode de p1 y p2 son iguales: " + (p1.hashCode() == p2.hashCode())); // true

    }

    // 6. Ejemplo con HashSet (colección)
    public static void ejemploHashSet() {
        HashSet<Persona> set = new HashSet<>();
        set.add(new Persona("Juan", 25));
        set.add(new Persona("Juan", 25));  // Mismo contenido, pero mismo hashCode

        System.out.println("Tamaño del HashSet: " + set.size());  // 1, porque "Juan" es el mismo
    }



    public static void main(String[] args) {
        System.out.println("---- Ejemplo con Tipos Primitivos ----");
        ejemploPrimitivos();

        System.out.println("\n---- Ejemplo con String ----");
        ejemploString();

        System.out.println("\n---- Ejemplo con Object ----");
        ejemploObject();

        System.out.println("\n---- Ejemplo con Array ----");
        ejemploArray();

        System.out.println("\n---- Ejemplo con Persona ----");
        ejemploPersona();

        System.out.println("\n---- Ejemplo con HashSet ----");
        ejemploHashSet();

    }
}
