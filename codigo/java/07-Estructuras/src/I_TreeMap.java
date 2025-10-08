/*
TREEMAP
TreeMap es una implementación de la interfaz Map que ordena automáticamente las claves:
- En orden natural o usando Comparator

*/

import java.util.Map;
import java.util.TreeMap;

public class I_TreeMap {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** TREEMAP ****");
        String datoTreeMap = """
                - No permite claves null, pero sí valores null.
                """;

        // Parte 1
        System.out.println("=========| PARTE 1 |=========");
        System.out.println("Lista de números: ");
        TreeMap<String, Integer> edades = new TreeMap<>();
        edades.put("María", 19);
        edades.put("Andrea", 19);
        edades.put("Marco", 23);
        edades.put("Luis", 17);
        System.out.println("Añadidos: " + edades); // Ordenado según clave

        edades.put("Luis", 20); // Modificación de valor
        System.out.println("Lista modificada: " + edades);

        edades.remove("Andrea"); // Eliminar por clave
        System.out.println("Lista actual: " + edades);

        System.out.println("Valor asociado: " + edades.get("Luis")); // Obtener valor

        System.out.println("Contiene la clave María: " + edades.containsKey("María")); // Existencia de clave
        System.out.println("Contiene el valor 23: " + edades.containsValue(23)); // Existencia de valor

        System.out.println("Longitud: " + edades.size()); // Longitud

        System.out.println("Solo claves: " + edades.keySet()); // Keys
        System.out.println("Solo valores: " + edades.values()); // Values

        System.out.println("Ver conjunto pares: " + edades.entrySet()); // Vista pares

        edades.clear(); // Limpiando
        System.out.println("Lista actual: " + edades);

        // PARTE 2 | Imterface Navigable
        System.out.println("=========| PARTE 2 |=========");
        System.out.println("Lista de colores: ");
        TreeMap<Integer, String> colores = new TreeMap<>();
        colores.put(2, "Azul");
        colores.put(5, "Rojo");
        colores.put(1, "Amarillo");
        colores.put(3, "Blanco");
        colores.put(4, "Negro");
        colores.put(6, "Dorado");
        colores.put(7, "Verde");
        System.out.println("Añadidos: " + colores); // Ordenado según clave

        System.out.println("Primer elemento: " + colores.firstEntry()); // Primer
        System.out.println("Último elemento: " + colores.lastEntry()); // Último

        System.out.println("Entrada menor que: " + colores.lowerEntry(4)); // clave < 4
        System.out.println("Muestra solo la clave: " + colores.lowerKey(4)); // Similar pero solo la clave

        System.out.println("Entrada menor o igual que: " + colores.floorEntry(4)); // clave <= 4
        System.out.println("Muestra solo la clave: " + colores.floorKey(4)); // Similar pero solo la clave

        System.out.println("Entrada mayor: " + colores.higherEntry(3));  // clave > 3
        System.out.println("Muestra solo la clave: " + colores.higherKey(3));

        System.out.println("Entrada mayor igual: " + colores.ceilingEntry(4)); // clave > 4
        System.out.println("Muestra solo la clave: " + colores.ceilingKey(4));

        System.out.println("Quita y devuelve: " + colores.pollFirstEntry()); // Quita primera entrada
        System.out.println("Quita y devuelve: " + colores.pollLastEntry()); // Quita la última entrada

        System.out.println("Submapa: " + colores.subMap(3, true, 6,false));
        System.out.println("Submapa head" + colores.headMap(4, true));
        System.out.println("Submap tail: " + colores.tailMap(4, false));

    }
}
