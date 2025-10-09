import java.util.List;

public class F_BreakYContinue {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** BREAK Y CONTINUE ****");

        // BREAK
        System.out.println("----------- BREAK -------------");
        String datoBreak = """
                - Detiene completamente la ejecución del bucle.
                - Se suele usar cuando se encuentra lo que busca.
                """;
        System.out.println(datoBreak);
        System.out.println("|=== 1. Salir cuando encuentra un número | FOR");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Soy el " + i);
            if (i == 5) {
                System.out.println("Se encontró el " + i);
                break;
            }
        }

        System.out.println("\n|=== 2. Salir cuando encuentra un número | WHILE");
        int index = 1;
        while (index <= 10) {
            System.out.println("Soy el " + index);
            if (index == 5) {
                System.out.println("Se encontró el " + index);
                break;
            }
            index++;
        }

        System.out.println("\n|=== 3. Bucles Anidados");
        System.out.println("Rompe solo el más interno");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("\n----------- CONTINUE ------------");
        String datoContinue = """
                - Omite el resto de código del bucle y vuelve a evaluar la condición
                - Se usa para saltar ciertos casos sin detenerlo
                """;
        System.out.println("|=== 1. Saltar los múltiplos de 3 | FOR");
        for (int i = 1; i <= 6; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("|=== 2. Saltar los múltiplos de 3 | FOR");
        int inicio = 1;
        while (inicio <= 6) {
            if (inicio % 3 == 0) {
                inicio++;
                continue;
            }
            System.out.println("i = " + inicio);
            inicio++;
        }




    }
}
