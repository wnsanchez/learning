public class A_Basico {
    public static void main(String[] args) {
        // Uso básico
        try {
            int resultado = 10 / 0; // Genera una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
            System.out.println("Mensaje de error: " + e.getMessage()); // e: Permite ver detalles del error
            e.printStackTrace(); // Imprime la traza completa
        }

    }
}


