import java.util.HashMap;
import java.util.Map;

/*
HASHMAP
Colección que almacena datos en pares clave-valor
- Clave (Key): Es lo que usas para encontrar el dato
- Valor (Value): Es el dato que guardas
*/
public class H_HashMap {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** HASHMAP ****");
        String datoHashMap = """
                - Interfaces: Map, Cloneable, Serialización.
                - No ordenado
                """;
        System.out.println(datoHashMap);

        // PARTE 1 | Interface Map
        System.out.println("=========| PARTE 1 |=========");
        System.out.println("Lista de edades: ");
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Sofía", 18); // Añadiendo
        edades.put("María", 20);
        edades.put("Liz", 17);
        edades.put("Luis", 19);
        System.out.println("Añadidos: " + edades); // No ordenado

        edades.put("Liz", 27); // Modificando
        System.out.println("Lista modificada: " + edades);

        System.out.println("Valor asociado: " + edades.get("María")); // Obtener valor

        System.out.println("Contiene la clave Liz: " + edades.containsKey("Liz")); // Existencia de clave
        System.out.println("Contiene el valor 27: " + edades.containsValue(27)); // Existencia de valor

        System.out.println("Longitud: " + edades.size()); // Longitud

        System.out.println("Solo claves: " + edades.keySet()); // Keys
        System.out.println("Solo valores: " + edades.values()); // Values

        System.out.println("Ver conjunto pares: " + edades.entrySet()); // Vista pares

        edades.clear();
        System.out.println("Lista actual: " + edades);

        // PARTE 2
        System.out.println("=========| PARTE 2 |=========");
        System.out.println("Lista de colores: ");
        //
        Map<Integer, String> mapa1 = new HashMap<>();
        mapa1.put(1, "Rojo");
        mapa1.put(2, "Amarillo");
        System.out.println("Mapa 1: " + mapa1);

        Map<Integer, String> mapa2 = new HashMap<>();
        mapa2.put(2, "Blanco"); // Sobreescribe si tiene la misma clave
        mapa2.put(3, "Azul");

        Map<Integer, String> mapa3 = new HashMap<>();
        mapa3.put(3, "Azul");
        mapa3.put(4, "Dorado");

        System.out.println("** Unión **"); // Todos los elementos de ambos conjuntos, sin duplicados
        Map<Integer, String> union = new HashMap<>(mapa1);
        union.putAll(mapa2);
        System.out.println("Unión: " + union);

        System.out.println("\n** Intersección **"); // Solo los elementos comunes
        Map<Integer, String> interseccion = new HashMap<>();
        for (Integer clave: mapa2.keySet()) {
            if (mapa3.containsKey(clave)) {
                interseccion.put(clave, mapa3.get(clave));
            }
        }
        System.out.println("Intersección: " + interseccion);

        System.out.println("\n** Diferencia **"); // Elementos que están en A pero no en B
        Map<Integer, String> diferencia = new HashMap<>(mapa2);
        for (Integer clave: mapa3.keySet() ) {
            diferencia.remove(clave);
        }
        System.out.println("Diferencia: " + diferencia);


    }
}
