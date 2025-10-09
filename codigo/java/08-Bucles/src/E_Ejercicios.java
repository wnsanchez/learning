import java.util.*;

public class E_Ejercicios {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println("                    EJERCICIOS                     ");
        System.out.println("====================================================");

        // 1. Imprime los números del 1 al 10 | WHILE
        System.out.println("\n===| Ejercicio 1: Imprime del 1 al 10");
        int h = 1;
        while (h <= 10) {
            System.out.println("Imprime: " + h);
            h++;
        }

        // 2. Uso de while para mostrar todos los valores de un ArrayList | DO-WHILE
        System.out.println("\n===| Ejercicio 2: Recorre una ArrayList");
        List<String> nombres = new ArrayList<>();
        nombres.add("Willian");
        nombres.add("Lara");
        nombres.add("Luis");
        System.out.println("Lista: " + nombres);
        int n = 0;
        do {
            System.out.println("Nombre: " + nombres.get(n));
            n++;
        } while (n < nombres.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 | FOR
        System.out.println("\n===| Ejercicio 3: Múltiplos de 5");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("Múltiplo: " + i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total
        System.out.println("\n===| Ejercicio 4: Recorre una Array");
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Sumando ...");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma es: " + suma);

        // 5. Recorrer un Array y mostrar su valores | FOR
        System.out.println("\n===| Ejercicio 5: Recorre una Array");
        String[] paises = {"Venezuela", "Ecuador", "Perú"};
        for (int i = 0; i < paises.length; i++) {
            System.out.println("País: " + paises[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("\n===| Ejercicio 6: HashSet y HashMap");
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        System.out.println("Lista Set: " + colores);
        for (String color: colores) {
            System.out.println("Color => " + color);
        }
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Julia", 23);
        edades.put("María", 19);
        System.out.println("Lista Map: " + edades);
        for (Map.Entry<String, Integer> entrada: edades.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
        }

    }
}
