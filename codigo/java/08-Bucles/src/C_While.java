/*
WHILE
- Sintaxis:
while (condición) {
    // Bloque código a ejecuta
    }
- Si es true ejecuta el bloque de código
- Sí es false termina el bucle

*/

public class C_While {
    public static void main(String[] args) {
        // WHILE
        System.out.println("____________________________________________________");
        System.out.println(" **** WHILE ****");

        // PARTE 1: Contar del 1 al 5
        System.out.println("|=== Contar hacia adelante");

        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // PARTE 2: Contar hacia atrás
        System.out.println("|=== Contar hacia atrás");
        int j = 5;
        while (j >= 1) {
            System.out.println("j = " + j);
            j--;
        }


        System.out.println("=========| NOMBRES | ARRAYS |=========");
        String[] names = {"Willian", "Lara", "Diego"};
        int index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }
        System.out.println("\nCOMPARACIÓN");
        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Lara")) {
                find = true;
            }
            index++;
        }


    }
}
