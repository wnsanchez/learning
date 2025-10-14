/*
CLASE INTERNA ESTÁTICA | STATIC NESTED CLASS
Es una clase anidada dentro de otra clase, pero con el modificador static
- No tiene acceso directo a los miembros no estáticos de la clase externa
- Si puede acceder a los miembros estáticos de la clase externa
Está relacionado con la clase externa, pero no depende de ella.
 */

public class E_Computadora {
    private static String fabricante = "Open AI Computers";

    // Clase interna estática
    public static class Procesador {
        // Variable
        private String modelo;

        // Constructor
        public Procesador(String modelo) {
            this.modelo = modelo;
        }

        // Método
        public void mostrarDetalles() {
            System.out.println("Fabricante: " + fabricante + ", Procesador: " + modelo);
        }
    }

    public static void main(String[] args) {
        // No se necesita una instancia de computadora
        E_Computadora.Procesador cpu = new E_Computadora.Procesador("Ryzen 9");
        cpu.mostrarDetalles();

    }

}
