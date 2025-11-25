public class E_Manual {
    public static void conectar() throws ConexionFallidaException {
        boolean servidorRespondio = false; // Simulación

        if (!servidorRespondio) {
            throw new ConexionFallidaException("No se pudo conectar al servidor.");
        }
        System.out.println("Conexión exitosa");
    }

    public static void main(String[] args) {
        // Usando try | catch
        try {
            conectar();
        } catch (ConexionFallidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
