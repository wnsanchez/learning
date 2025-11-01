/*
PARTE 10: CONSTRUCTORES
- Bloque de código que se utiliza para inicializar los objetos de una clase.
- Se invoca automáticamente para configurar el objeto
- Características
    * Mismo nombre de clase
    * No tiene tipo de retorno, ni siquiera void
- Tipos
    * Default
    * Parámetros
    * Sobrecarga
*/
class Defecto {

    // Atributos
    String nombre;
    int edad;
    double altura;
    char caracter;

    // Constructor implícito | Default
    Defecto() {
        // No hace nada, pero permite crear objetos
    }

}

public class A_Default {
    public static void main(String[] args) {
        Defecto defecto = new Defecto();

        System.out.println("____________________________________________________");
        System.out.println("**** CONSTRUCTOR POR DEFECTO ****");
        System.out.println(defecto.nombre); // null (Valor por defecto de String)
        System.out.println(defecto.edad); // 0 (Valor por defecto de int)
        System.out.println(defecto.altura); // 0.0 (Valor por defecto de double)
        System.out.println(defecto.caracter); // Nulo

    }

}


