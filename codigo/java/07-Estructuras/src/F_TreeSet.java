/*
TREESET
- Almacena elementos únicos (no duplicados)
- Con orden | Mantiene los elementos ordenados, según su orden natural (por ejemplo, alfabético o numérico), o según un `Comparator` que tú definas.
- No puedes a acceder por índice
- No puedes insertar en una posición específica
- Puedes ver todos los elementos ordenados y obtener subconjuntos
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class F_TreeSet {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** TREESET ****");
        String datoTreeSet = """
                - Interface: Set, Collection, SortedSet, NavigableSet, Iterable, Cloneable
                - Puedes ver todos los elementos ordenados y obtener subconjuntos
                """;
        System.out.println(datoTreeSet);

        // Parte 1
        System.out.println("=========| PARTE 1 |=========");
        System.out.println("Lista de números: ");
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1); // Añadiendo
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        System.out.println("Añadidos: " + numeros); // Ordenado
        //numeros.add(2, 10); // No se añade por índice

        numeros.remove(1); // Eliminar elemento
        System.out.println("Lista modificada: " + numeros);

        System.out.println("Contiene 3: " + numeros.contains(3)); // Revisar existencia

        System.out.println("Longitud: " + numeros.size()); // Longitud

        System.out.println("Está vacía? : " + numeros.isEmpty()); // Revisar si esta vacía

        numeros.clear(); // Limpiando

        System.out.println("Limpiando ...");
        System.out.println("Lista actual: " + numeros);

        // Parte 2
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

        // INTERFACES Navigable y Sortedset | Métodos
        System.out.println("=========| EXTRAS |=========");
        System.out.println("Lista de números: ");
        TreeSet<Integer> ordenado = new TreeSet<>();
        ordenado.add(10); // Añadiendo
        ordenado.add(2);
        ordenado.add(30);
        ordenado.add(14);
        ordenado.add(5);
        ordenado.add(16);
        System.out.println("Ordenado: " + ordenado);

        System.out.println("Muestra el primer elemento: " + ordenado.first());
        System.out.println("Devuelve el último: " + ordenado.last());
        System.out.println("Vista descendente: " + ordenado.descendingSet());
        System.out.println("Subconjunto: " + ordenado.subSet(2, 5));
        System.out.println("Elemento mayor cercano a 15: " + ordenado.higher(15));
        System.out.println("Elemento menor cercano a 15: " + ordenado.lower(15));
        System.out.println("Elemento menores a 14: " + ordenado.headSet(14));
        System.out.println("Elemento mayores a 15: " + ordenado.tailSet(15));
        System.out.println(ordenado);


    }
}
