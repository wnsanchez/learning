package Basico;

// Padre
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

}

// Hija
class Estudiante extends Persona{
    int grado;

    Estudiante(String nombre, int grado) {
        super(nombre);
        this.grado = grado;
    }

}

public class B_Test {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Willian", 3);

        System.out.println(estudiante.nombre);
        System.out.println(estudiante.grado);
    }
}
