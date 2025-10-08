/*
LINKEDHASHMAP
- Es muy útil, especialmente cuando necesitas mantener el orden de inserción de los elementos o trabajar con estructuras de caché (como LRU).
*/

import java.util.LinkedHashMap;

public class J_LinkedHashMap {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** LINKEDHASHMAP ****");
        String datoLinkedHashMap = """
                - Permite valores y claves null.
                """;

        // PARTE 1 | MAP
        System.out.println("=========| PARTE 1 |=========");
        System.out.println("Lista de edades: ");
        LinkedHashMap<String, Integer> edades = new LinkedHashMap<>();
        edades.put("Julia", 20); // Añadiendo
        edades.put("María", 29);
        edades.put("José", 19);
        edades.put("Manuel", 18);
        System.out.println(edades); // Orden de inserción

        edades.put("Manuel", 29); // Modificación
        System.out.println("Lista modificada: " + edades);

        edades.remove("Manuel");
        System.out.println("Lista actual: " + edades);

        System.out.println("Obtener valor: " + edades.get("Manuel")); // Obtener valor

        System.out.println("Contiene la clave María: " + edades.containsKey("María"));
        System.out.println("Contiene el valor: " + edades.containsValue(29));

        System.out.println("Longitud: " + edades.size()); // Longitud

        System.out.println("Solo clave: " + edades.keySet()); // Keys
        System.out.println("Solo valores: " + edades.values()); // // Values

        System.out.println("Ver conjunto pares: " + edades.entrySet()); // Vista pares

        edades.clear();
        System.out.println("Lista vacía: " + edades);

        System.out.println("¿Está vacía?: " +edades.isEmpty()); // Verificar

    }
}
