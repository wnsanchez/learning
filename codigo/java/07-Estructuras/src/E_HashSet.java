/*
HASHSET
- Almacenan elementos únicos (no duplicados).
- No tienen índice como una lista.
- Sin orden.
- No puedes acceder por índice
- No puedes insertar en una posición específica
*/

import java.util.HashSet;
import java.util.Set;

public class E_HashSet {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** HASHSET ****");
        String datoHashSet = """
                - Interfaces: Set, Collection, Iterable, Cloneable, Serializable
                - No garantiza ningún orden de los elementos.
                - Usa una tabla hash para almacenar los elementos, 
                lo que lo hace muy eficiente para operaciones como búsqueda, 
                inserción y eliminación (O(1) en promedio).
                """;
        System.out.println(datoHashSet);

        // CADENAS 1
        System.out.println("=========| CADENAS 1 |=========");
        System.out.println("Lista de frutas: ");
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana"); // Añadiendo
        frutas.add("Uva");
        frutas.add("Naranja");
        frutas.add("Lima");
        System.out.println("Añadidos: " + frutas); // Orden aleatorio
        //frutas.add(2, "Mandarina"); // No se añade por índice

        frutas.remove("Lima"); // Eliminar elemento
        System.out.println("Lista modificada: " + frutas);

        System.out.println("Contiene Uva: " + frutas.contains("Uva")); // Revisar existencia

        System.out.println("Longitud: " + frutas.size()); // Longitud

        frutas.clear(); // Limpiando
        System.out.println("limpiando ...");
        System.out.println("Lista actual: " + frutas);

        System.out.println("¿Está vacía?: " + frutas.isEmpty()); // Ver si esta vacía

        // CADENA 2
        System.out.println("=========| CADENAS 2 |=========");
        System.out.println("Lista de frutas 1: ");
        // Programando contra interfaces usando Set | Solo métodos de set
        Set<String> frutasA = new HashSet<>();
        frutasA.add("Manzana"); // Añadiendo
        frutasA.add("Uva");
        frutasA.add("Naranja");
        frutasA.add("Lima");
        System.out.println("Lista A: " + frutasA);

        System.out.println("Lista de frutas 2: ");
        Set<String> frutasB = new HashSet<>();
        frutasB.add("Fresa");
        frutasB.add("Coco");
        frutasB.add("Pera");
        frutasB.add("Piña");
        System.out.println("Lista B: " + frutasB);

        System.out.println("Lista de frutas 3: ");
        Set<String> frutasC = new HashSet<>();
        frutasC.add("Avellana");
        frutasC.add("Cacahuate");
        frutasC.add("Piña");
        System.out.println("Lista C: " + frutasC);

        System.out.println("\n=== OPERACIONES ===");
        System.out.println("** Unión **"); // Todos los elementos de ambos conjuntos, sin duplicados
        Set<String> union = new HashSet<>(frutasA);
        System.out.println("Lista sin unir: " + union); // Vacía
        union.addAll(frutasB);
        System.out.println("Lista unida: " + union);

        System.out.println("\n** Intersección **"); // Solo los elementos comunes
        Set<String> interseccion = new HashSet<>(frutasB);
        System.out.println("Lista sin intersección: " + interseccion);
        interseccion.retainAll(frutasC);
        System.out.println("Lista con intersección: " + interseccion);

        System.out.println("\n** Diferencia **"); // Elementos que están en A pero no en B
        Set<String> diferencia = new HashSet<>(frutasB);
        System.out.println("Lista sin diferencia: " + frutasB);
        diferencia.removeAll(frutasC);
        System.out.println("Lista con diferencia: " + diferencia);

        System.out.println("\n** Simétrica **"); // △ | Elementos que están en A o en B, pero no en ambos
        Set<String> simetrica = new HashSet<>(frutasB);
        System.out.println("Lista actual: " + simetrica);
        simetrica.addAll(frutasC); // Primero unir lista | A ∪ B
        System.out.println("Lista unida: " + simetrica);
        Set<String> inter = new HashSet<>(frutasB);
        inter.retainAll(frutasC); // A ∩ B
        System.out.println("Lista con intersección: " + inter);
        simetrica.removeAll(inter); // (A ∪ B) - (A ∩ B)
        System.out.println("Lista simétrica: " + simetrica);

    }
}
