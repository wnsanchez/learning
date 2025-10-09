/*
PARTE 7: FOR
- Especialmente útil cuando trabajas con arrays o estructuras repetitivas.
- Sintaxis:
    for (inicialización; condición; actualización) {
        // Código a ejecutar en cada iteración
    }
- Siempre agregar un contador puede ejecutarse indefinidamente

*/

public class A_For {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** FOR ****");
        String datoFor = """
                - Tiene una inicialización, condición, actualización
                """;
        System.out.println(datoFor);
        System.out.println("\n|=== 1. Imprime del 1 al 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Imprime: " + i);
        }

        System.out.println("\n|=== 2. Imprime los saltos");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Número: " + i);
        }

        System.out.println("\n|=== 3. Bucle anidadas");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Uso en arrays
        System.out.println("\n|=== 4. Imprime los nombres de la lista");
        String[] nombres = {"Willian", "Luis", "Lucas"};
        for (int i = 0; i < nombres.length; i++ ) {
            System.out.println("Nombre: " + nombres[i]);
        }

    }
}
