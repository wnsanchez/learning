/*
DO-WHILE
- Sintaxis
    do {
    // Bloque de código a ejecutar
    } while (condición);
- El bloque de código se ejecuta al menos una vez, antes de evaluar la condición.
*/

public class D_Do_While {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** DO-WHILE ****");

        // 1. Se ejecuta al menos de una vez
        System.out.println("|=== 1. Se imprime una vez");
        int h = 10;
        do {
            System.out.println("Se imprime una vez");
        } while (h < 5);

        // 2. Contar hasta 5
        System.out.println("|=== 2. Imprime 1 al 5");
        int i = 1;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 5);

        // DO -WHILE | Realiza una ejecución antes del bucle
        System.out.println("|=== EJEMPLO");
        int index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while ( index < 1);

    }
}
