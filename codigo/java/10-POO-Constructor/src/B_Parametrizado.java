/*
CONSTRUCTOR PARAMETRIZADO
- Recibe parámetros para inicializar un objeto
- Concepto:
    * Parámetros: nombres de variables en la definición
    * Argumentos: valores que se envían en la llamada
-
*/
class Persona {
    String nombre;
    int edad;

    // Constructor con parámetros
    Persona(String nombre, int edad) { // Parámetros
        this.nombre = nombre;
        this.edad = edad;
    }

}

public class B_Parametrizado {
    public static void main(String[] args) {
        // Creando el objeto
        //Persona p1 = new Persona(); // Error: Falta parámetros

        System.out.println("____________________________________________________");
        System.out.println("**** CONSTRUCTOR POR DEFECTO ****");
        Persona p2 = new Persona("Willian", 20); // Argumentos ingresados
        Persona p3 = new Persona("María", 21);  // Argumentos ingresados

        System.out.println("==== Persona A: ");
        System.out.println("Nombre: " + p2.nombre);
        System.out.println("Edad: " + p2.edad);
        System.out.println("==== Persona B: ");
        System.out.println("Nombre: " + p3.nombre);
        System.out.println("Edad: " + p3.edad);
    }

}
