/*
ARRAYS LIST
- Implementa interfaces
*/
import java.util.ArrayList;

public class C_ArrayList {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** ARRAYS LIST ****");
        String datoArrayList = """
                Un ArrayList es una clase de la colección de Java (java.util)
                - Lista dinámica de elementos
                - No funciona con datos primitivos
                - Usa clases wrapper para primitivos
                """;
        System.out.println(datoArrayList);

        // PRIMITIVOS | Integer
        System.out.println("=========| ENTEROS |=========");
        System.out.println("Lista de números: ");
        ArrayList<Integer> numeros; // Declaración
        numeros = new ArrayList<>(); // Inicialización
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        System.out.println(numeros);

        // PRIMITIVOS | Character
        System.out.println("=========| CADENAS |=========");
        System.out.println("Lista de caracteres: ");
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('W');
        letras.add('i');
        letras.add('l');
        letras.add('l');
        System.out.println(letras);

        // MÉTODOS ÚTILES
        System.out.println("=========| ENTEROS |=========");
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Lista de nombres: ");
        nombres.add("Willian"); // Añadiendo elemento al final
        nombres.add("Luis");
        nombres.add("Lara");
        nombres.add("Raúl");
        nombres.add("José");
        System.out.println("Añadidos: " + nombres);
        nombres.add( 2, "Juan"); // Especificando índice

        System.out.println("Añadir en posición 3: " + nombres); // Lista actual

        System.out.println("Primer elemento: " + nombres.getFirst()); // Acceder a elementos
        System.out.println("Último elemento: " + nombres.getLast()); // Acceder a elementos
        System.out.println("Índice elemento: " + nombres.get(2)); // Acceder por índice

        nombres.set(2, "Adolfo"); // Modificando elementos .set
        System.out.println("Lista modificada: " + nombres); // Lista actual

        System.out.println("Eliminar: " + nombres.remove(2)); // Eliminando por índice
        System.out.println("Eliminando elemento José: " + nombres.remove("José")); // Eliminando por elemento
        System.out.println("Lista modificada: " + nombres); // Lista actual

        System.out.println("Contiene Willian: " + nombres.contains("Willian")); // Revisar existencia

        System.out.println("Posición de elemento Willian: " + nombres.indexOf("Willian")); // Posición

        System.out.println("Longitud: " + nombres.size()); // Longitud

        nombres.clear(); // Limpia el ArrayList
        System.out.println("Limpiando....");
        System.out.println("Lista actual: " + nombres);

        System.out.println("¿Está vacía?: " + nombres.isEmpty()); // Ver si esta vacía

    }
}
