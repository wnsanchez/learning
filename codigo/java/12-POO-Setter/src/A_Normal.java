/*
SETTERS
Método que cambia el valor de un atributo privado
Getter: te deja ver
Setter: te deja cambiarlo
- Normal
- Controlado
- Encadenado
- Defensivo
 */

class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


     //Setter normal
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class A_Normal {
    public static void main(String[] args) {
        System.out.println("|===== SETTERS =====|");
        Persona p1 = new Persona("Luis", 23);
        System.out.println("Nombre original: " + p1.getNombre());
        p1.setNombre("Willian"); // Modificar con set
        System.out.println("Nombre modificado: " + p1.getNombre());
    }
}
