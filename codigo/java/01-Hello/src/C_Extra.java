public class C_Extra {
    public static void main(String[] args) {
        /*
        Impresión en consola
        - System.out.println("xxx"): Imprime con salto de línea
        - System.out.print("xxx"): Imprime sin salto de línea
        - System.out.printf("xxx"): Este te permite imprimir con formato
        */

        System.out.println("* Impresión con salto de línea");
        System.out.print("* Imprime sin salto ");
        System.out.print("de línea");
        System.out.println("\n Salto de línea manual"); // Salto de línea manual con \n
        System.out.println("* Imprime con formato:");
        System.out.printf("Mi nombre es %s y tengo %d años\n", "Juan", 30);
    }
}
