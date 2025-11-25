/*
throw sirve para lanzar manualmente una excepción en el momento exacto que quieras.
Sintaxis: throw new TipoDeExcepcion("Mensaje opcional");
 - throw: lanza una excepción, detiene el método
 - new: crea un objeto de excepción

Útil:
    * Validar datos de entrada
    * Evitar estados inválidos
    * Evitar que el programa siga con valores incorrectos
*/


public class D_Manual {

    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new NombreVacioException("El nombre no puede estar vacío ");
        }
        System.out.println("Nombre válido: " + nombre);
    }

    public static void main(String[] args) {
        validarNombre(""); // Lanza excepción
    }
}


