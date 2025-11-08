/*
GETTERs DERIVADO | Atributo derivado | Propiedad Calculada
- Un método que no devuelve directamente un atributo agregado sino que calcula o se deriva su valor a partir de otros atributos
- Se usa cuando el valor se puede derivar en lugar de almacenarse.

 */

class Persona {
    private String nombre;
    private String apellido;

    // Constructor
    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters Normales
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Getter derivado
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

}

public class B_Derivado {
    public static void main(String[] args) {
        Persona per1 = new Persona("Luis", "Rojo");
        Persona per2 = new Persona("María", "Rivera");

        System.out.println("Persona 1: " + per1.getNombreCompleto());
        System.out.println("Persona 2: " + per2.getNombreCompleto());

    }
}
