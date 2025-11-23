/*
RECORDS
- Comprender el uso equals() y hashCode() antes de record
- equals() sirve para comparar si dos objetos son lógicamente iguales.
    * “¿Tienen la misma referencia en memoria?”
- ❗ Pero para objetos con atributos, eso NO sirve.
 */

// PRIMITIVOS |Para los primitivos, no existe .equals().
class Primitivos {

    void comparar(int a, int b) {
        System.out.println(a == b);
        // Son valores → no objetos
        // Memoria diferente no importa
        // == compara el valor directamente
    }

}


// STRINGS | Sí tiene .equals() implementado.
class Cadenas {
    String s1;
    String s2;

    public Cadenas(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    void comparar() {
        System.out.println(s1.equals(s2));
        // Se compara el contenido del texto
        // No importa si están en distinta memoria
    }

}

// CLASE
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}


public class A_Comparar {
    public static void main(String[] args) {
        // Primitivos
        Primitivos primitivos = new Primitivos();
        primitivos.comparar(4, 4);

        // Cadenas
        Cadenas cadenas = new Cadenas("hola", "Hola");
        cadenas.comparar();

        // Clases
        Persona p1 = new Persona("Ana");
        Persona p2 = new Persona("Ana");
        System.out.println(p1.equals(p2));



    }

}

/*
equals() sirve para comparar objetos, y por defecto compara referencia en memoria;
en primitivos no existe; en Strings equals compara contenido;
 en clases equals compara referencia a menos que lo sobrescribas para comparar contenido.
 */