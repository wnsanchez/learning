/*
Excepción personalizada UNCHECKED (la más fácil)
Se crea heredando de RuntimeException
➡ No necesita throws
➡ Obliga a manejarla con try/catch
*/

public class NombreVacioException extends RuntimeException {
    public NombreVacioException(String mensaje) {
        super(mensaje);
    }
}
