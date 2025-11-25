/*
Excepción personalizada CHECKED (un poco más formal)
✔ Se crea heredando de Exception
➡ Necesita throws
➡ Obliga a manejarla con try/catch
*/

public class ConexionFallidaException extends Exception {
    public ConexionFallidaException(String message) {
        super(message);
    }
}
