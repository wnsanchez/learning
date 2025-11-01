/*
SOBRECARGA DE CONSTRUCTORES | Constructor Overloading
- Ocurre cuando una clase tiene más de un constructor, pero con diferentes listas de parámetros.
- Útil para que un objeto sea creado de diferentes maneras.

*/

class  Estudiante{
    String nombre;
    String carrera;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.carrera = "Desconocido";
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    // Constructor con solo nombre
    public Estudiante(String nombre) {
        // this: hace referencia al atributo del objeto
        this.nombre = nombre; // nombre es parámetro del constructor
        this.carrera = "Desconocido";
    }


}

public class C_Sobrecarga {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante(); // Defecto
        Estudiante est2 = new Estudiante("Willian", "Administración"); // Parámetros
        Estudiante est3 = new Estudiante("Luis"); // Solo un parámetro

        System.out.println("____________________________________________________");
        System.out.println("**** USO DE CONSTRUCTOR ****");
        System.out.println("Default: " + est1.nombre + " | " + est1.carrera);
        System.out.println("Parametrizado: " + est2.nombre + " | " + est2.carrera);
        System.out.println("Solo uno: " + est3.nombre + " | " + est3.carrera);

    }
}
