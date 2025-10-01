public class B_Ejercicios {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println("                    EJERCICIOS                     ");
        System.out.println("====================================================");

        // 1. Crea una variable con el resultado de cada operación aritmética
        int a = 4;
        int b = 2;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int dividir = a / b;
        System.out.println("===| EJERCICIO 1: Operaciones");
        System.out.println("Valor de \"a\": " + a);
        System.out.println("Valor de \"b\": " + b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Dividir: " + dividir);

        // 2. Crea una variable para cada dato tipo de operación de asignación
        int c = 6;
        int d = 2;
        System.out.println("===| EJERCICIO 2: Asignaciones");
        System.out.println("Valor inicial de \"c\": " + c);
        System.out.println("Valor inicial de \"d\": " + d);
        c += 2;
        System.out.println("Suma: " + c);
        c -= 2;
        System.out.println("Resta: " + c);
        c *= 2;
        System.out.println("Multiplicación: " + c);
        c /= 2;
        System.out.println("Dividir: " + c);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación
        System.out.println("===| EJERCICIO 3: Comparación | true");
        System.out.println("4 == 4: " + (4 == 4) );
        System.out.println("3 >= 2: " + (3 >= 2) );
        System.out.println("2 != 4: " + (2 != 4) );

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación
        System.out.println("===| EJERCICIO 4: Comparación | false");
        System.out.println("3 >= 4: " + (3 >= 4));
        System.out.println("2 != 2: " + (2 != 2));
        System.out.println("3 == 2: " + (3 == 2));

        // 5. Utiliza el operador lógico and
        System.out.println("===| EJERCICIO 5: AND | &&");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && false: " + (false && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("(4 > 3) && (3 == 3): " + ((4 > 3) && (3 == 3)));

        // 6. Combina operadores lógicos
        System.out.println("===| EJERCICIO 6: Lógicos");
        System.out.println("(true || false) && (false || false): " + ((true || false) && (false || false)));

        // 7. Añade alguna negación
        System.out.println("===| EJERCICIO 7: not | !");
        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);

        // 8. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println("===| EJERCICIO 8: MIX");
        boolean resultado = ((4 != 4) || ((3 + 5) < 4));
        System.out.println("Combinación: ((4 != 4) || ((3 + 5) < 4)): " + resultado);

        System.out.println("____________________________________________________");
    }
}
