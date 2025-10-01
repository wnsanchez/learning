/*
PARTE 5: STRINGS
-
*/

public class A_Strings {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** STRINGS ****");
        // Cadena de texto
        String nombre = "Willian"; // Almacena en un "pool de strings"
        String nombreIgual = "Willian"; // Apunta al mismo objeto en memoria
        var mismoNombre = new String("Willian"); // Crea un nuevo objeto con el mismo valor

        String apellido = "Sánchez";
        String saludo = "Bienvenido Java";
        String textoFrase = "    Hello, World    ";
        System.out.println("===| CADENAS DE TEXTO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Saludo: " + saludo);
        System.out.println("Frase: " + textoFrase);


        // OPERACIONES
        System.out.println("\n===| OPERACIONES ===");
        System.out.println("|* Longitud \"nombre\": " + nombre.length()); // Longitud
        System.out.println("|* Obtener carácter: " + nombre.charAt(1)); // Extraer carácter
        System.out.println("|* Subcadena: " + nombre.substring(0, 4)); // Rebanado | Subcadena
        System.out.println("|* Mayúscula: " + nombre.toUpperCase()); // Mayúscula
        System.out.println("|* Minúscula: " + nombre.toLowerCase()); // Minúscula
        System.out.println("|* Comparación de contenido: " + nombre.contains("Java")); // Total y completa
        System.out.println("|* Comparación con equals: " + nombre.equals(mismoNombre)); // Compara contenido
        System.out.println("|* Comparación con ==: " + (nombre == mismoNombre)); // Compara el objeto
        System.out.println("|* Eliminar espacios alrededor: " + textoFrase.trim());
        System.out.println("|* Reemplazar un texto: " + saludo.replace("Java", "Python"));
        System.out.print("|* Formateo: ");
        System.out.println(String.format("Hola yo me llamo %s %s", nombre, apellido));
    }
}
