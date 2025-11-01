/*
CONSTRUCTOR COPIA
-  Se utiliza para crear un nuevo objeto a partir de otro objeto existente
*/
class Datos {
    String nombre;
    int edad;

    // Constructor
    public Datos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor copia
    public Datos(Datos otroDatos) {
        this.nombre = otroDatos.nombre;
        this.edad = otroDatos.edad;
    }
}

public class D_Copia {
    public static void main(String[] args) {
        Datos per1 = new Datos("Luis", 30);
        Datos per2 = new Datos("Juan", 16);
        Datos per3 = new Datos(per1); // Copia

        System.out.println("____________________________________________________");
        System.out.println("**** USO DE CONSTRUCTOR ****");
        System.out.println("Persona 1: " + per1.nombre + " | " + per1.edad);
        System.out.println("Persona 2: " + per2.nombre + " | " + per2.edad);
        System.out.println("Persona 3: " + per3.nombre + " | " + per3.edad);
    }
}
