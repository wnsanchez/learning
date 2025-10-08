/*
PARTE 7: Estructuras
- Arrays: es una estructura de datos que permite almacenar múltiples valores del mismo tipo en una sola variable.
- Declaración, inicialización y en conjunto
*/

public class A_Arrays {
    public static void main(String[] args) {

        // ARRAYS
        System.out.println("____________________________________________________");
        System.out.println(" **** ARRAYS ****");
        String datoArray = """
                - Tamaño fijo (Creado, no se puede cambiar su tamaño)
                - Declaración: tipo[] nombreArray;
                - Tipo de dato: Primitivos,clases wrapper u objetos
                -Wrapper: Integer, Double, Boolean, etc (Versiones de objetos de los tipos primitivos)
                - No tienen métodos
                """;
        System.out.println(datoArray);

        // ENTEROS
        System.out.println("=========| ENTEROS |=========");
        int[] impares; // Declarando
        impares = new int[3]; // Inicialización
        System.out.println("Creación un arrays de 3 enteros pares: [0, 0, 0]"); // Valores nulos
        System.out.println("Impresión de variable: " + impares); // Muestra la asignación en memoria
        System.out.println("Valor null: " + impares[0]); // Accediendo a valores por índice
        System.out.println("Solo muestra 0, aún no se agregado valores");
        System.out.println("Agregando valores: 1, 3, 5 ....");
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        System.out.println("Imprimir [0]: " + impares[0]);
        System.out.println("Imprimir [1]: " + impares[1]);
        System.out.println("Imprimir [2]: " + impares[2]);
        System.out.println("-------------------------------------------");

        int[] pares = new int[3]; // Declaración e inicialización
        System.out.println("Creando arrays de 3 enteros pares:");
        System.out.println("Agregando valores: 2, 4, 6 ...");
        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        System.out.println("Imprime [0]: " + pares[0]);
        System.out.println("Imprime [1]: " + pares[1]);
        System.out.println("Imprime [2]: " + pares[2]);
        System.out.println("-------------------------------------------");

        int[] decimales = {10, 20, 30}; // Declarar + inicializar + asignar
        System.out.println("Creando arrays: ");
        System.out.println("Imprime [0]: " + decimales[0]);
        System.out.println("Imprime [1]: " + decimales[1]);
        System.out.println("Imprime [2]: " + decimales[2]);

        // STRINGS
        System.out.println("=========| CADENAS |=========");
        String[] nombres = {"Willian", "Juan", "Luis"};
        System.out.println("Creando array de nombres: ");
        System.out.println("Imprime [0]: " + nombres[0]);
        System.out.println("Imprime [1]: " + nombres[1]);
        System.out.println("Imprime [2]: " + nombres[2]);

        // CHAR
        System.out.println("=========| CHAR |=========");
        char[] caracteres;
        caracteres = new char[]{'L', 'u', 'i', 's'};
        System.out.println("Creando array de caracteres: ");
        System.out.println("Imprime [0]: " + caracteres[0]);
        System.out.println("Imprime [1]: " + caracteres[1]);
        System.out.println("Imprime [2]: " + caracteres[2]);
        System.out.println("Imprime [3]: " + caracteres[3]);
        //System.out.println("Imprime [4]: " + caracteres[4]); // Error por el índice

        // PROPIEDAD
        System.out.println("=========| PROPIEDAD |========="); // Solo una length
        System.out.println("Longitud: " + pares.length);
        System.out.println("Longitud: " + impares.length);
        System.out.println("Longitud: " + nombres.length);
        System.out.println("Longitud: " + caracteres.length);

    }
}
