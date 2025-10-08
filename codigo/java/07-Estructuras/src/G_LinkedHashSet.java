/*
LINKEDHASHSET
- Necesitas eliminar duplicados y mantener el orden en que agregaste los elementos.
- Quieres iterar en el orden original.
- Necesitas operaciones rápidas de búsqueda/inserción (aunque un poco más lentas que HashSet).
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class G_LinkedHashSet {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** LINKEDHASHSET ****");
        String datoLinkedHashSet = """
                - No permite duplicados
                - Mantiene el orden en que se insertaron los elementos.
                - Está basada en una tabla hash y una lista doblemente enlazada interna.
                """;
        System.out.println(datoLinkedHashSet);

        // PARTE 1
        System.out.println("=========| PARTE 1 |=========");
        System.out.println("Lista de números: ");
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(10);
        numeros.add(2);
        System.out.println("Añadidos: " + numeros);

        numeros.remove(5); // Eliminar elemento
        numeros.addLast(30); // Añade al último
        System.out.println("Lista modificada: " + numeros);

        System.out.println("Contiene 3: " + numeros.contains(3)); // Revisar existencia

        System.out.println("Longitud: " + numeros.size()); // Longitud

        System.out.println("pipi: " + numeros);

        numeros.clear(); // Limpiando
        System.out.println("Lista actual: " + numeros);

        System.out.println("¿Está vacía?: " + numeros.isEmpty()); // Revisar si está vacía

        // PARTE 2
        System.out.println("=========| PARTE 2 |=========");
        System.out.println("Lista de frutas: ");
        // Programando contra interfaces usando Set | Solo métodos de set
        Set<String> frutasA = new TreeSet<>();
        frutasA.add("Manzana"); // Añadiendo
        frutasA.add("Uva");
        frutasA.add("Naranja");
        frutasA.add("Lima");
        System.out.println("Lista A: " + frutasA);

        System.out.println("Lista de frutas 2: ");
        Set<String> frutasB = new TreeSet<>();
        frutasB.add("Fresa");
        frutasB.add("Coco");
        frutasB.add("Pera");
        frutasB.add("Piña");
        System.out.println("Lista B: " + frutasB);

        System.out.println("Lista de frutas 3: ");
        Set<String> frutasC = new TreeSet<>();
        frutasC.add("Avellana");
        frutasC.add("Cacahuate");
        frutasC.add("Piña");
        System.out.println("Lista C: " + frutasC);

        System.out.println("\n=== OPERACIONES ===");
        System.out.println("** Unión **"); // Todos los elementos de ambos conjuntos, sin duplicados
        Set<String> union = new TreeSet<>(frutasA);
        System.out.println("Lista sin unir: " + union); // Vacía
        union.addAll(frutasB);
        System.out.println("Lista unida: " + union);

        System.out.println("\n** Intersección **"); // Solo los elementos comunes
        Set<String> interseccion = new TreeSet<>(frutasB);
        System.out.println("Lista sin intersección: " + interseccion);
        interseccion.retainAll(frutasC);
        System.out.println("Lista con intersección: " + interseccion);

        System.out.println("\n** Diferencia **"); // Elementos que están en A pero no en B
        Set<String> diferencia = new TreeSet<>(frutasB);
        System.out.println("Lista sin diferencia: " + frutasB);
        diferencia.removeAll(frutasC);
        System.out.println("Lista con diferencia: " + diferencia);

        System.out.println("\n** Simétrica **"); // △ | Elementos que están en A o en B, pero no en ambos
        Set<String> simetrica = new TreeSet<>(frutasB);
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
