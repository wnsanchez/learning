/*
PARTE 2: Variables y Constantes
- Permitir almacenar datos para después utilizarlos
- Declarar variables e inicializar su sintaxis "tipo_dato nombre_de_variable"
- Constantes: Valor que no cambia durante la ejecución.
*/

public class A_VariablesYConstantes {
    public static void main(String[] args) {
        // VARIABLE
        String nombre; // Declarando variable
        nombre = "Willian"; // Inicializando la variable
        String pais = "Perú"; // Declarando e inicialización

        // Constantes | Mayúscula
        final String EMAIL = "correojavita.com";

        // Var | Palabra reservada, esta infiere el tipo de dato
        var apodo = "Will";

        // Impresión
        System.out.println(nombre); // Llama variable
        System.out.println(pais);
        System.out.println(EMAIL);
        System.out.println(apodo);

        // Cambiando variables
        nombre = "Adolfo";
        System.out.println(nombre); // Cambia

        // Cambiando constantes
        /*
        EMAIL = "correonuevo@gmail.com";
        System.out.println(EMAIL);
        */
    }
}
