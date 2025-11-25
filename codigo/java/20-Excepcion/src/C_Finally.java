/*
FINALLY
Se ejecuta siempre, sin importar si se lanzó una excepción o no.
Es útil para liberar recursos (como cerrar archivos o conexiones)

*/

public class C_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("Ejercicio: ");
            int resultado = 10 / 0; // Esto lanzará una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        } finally {
            System.out.println("Este bloque siempre se ejecuta, sin importar lo que ocurra.");
        }
    }
}
