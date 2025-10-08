public class B_Matriz {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** ARRAYS | MATRIZ ****");
        String datoMatriz = """
                Los arrays **bidimensionales** (o más) son como tablas. Por ejemplo, una matriz de 3 filas x 2 columnas:
                """;
        System.out.println(datoMatriz);
        int[][] ejemploMatriz = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        System.out.println("Imprimir [0]: " + ejemploMatriz[0][0]); // Valores dentro del primer
        System.out.println("Imprimir [1]: " + ejemploMatriz[0][1]); // Valores dentro del primer
    }
}
