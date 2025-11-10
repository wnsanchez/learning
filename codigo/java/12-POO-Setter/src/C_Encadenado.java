/*
SETTER ENCADENADO
Permite llamar varios setters uno tras otro en una sola línea, gracias a que devuelven el mismo objeto (this) en lugar de void.
- Es muy usado en patrones de diseño como el Builder Pattern o para configurar objetos de manera compacta.
- Tradicionalmente, los setters no devuelven nada, por eso se declaran con void; entonces, el tipo de retorno ya no puede ser void,
sino la clase del propio objeto
*/
class Datos {
    private String nombre;
    private int edad;
    private String ciudad;

    // Constructor
    public Datos(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Setters de nombre
    public Datos setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        return this; // Devuelve el propio objeto persona
    }

    // Setters de edad
    public Datos setEdad(int edad) {
        if (edad < 0 || edad > 128) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120");
        }
        this.edad = edad;
        return this;
    }

    // Setter para ciudad
    public Datos setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

}

public class C_Encadenado {
    public static void main(String[] args) {
        try {
            // Configuración encadenada | varios setters
            Datos p = new Datos("Will", 33, "Trujillo")
                    .setNombre("Luis")
                    .setEdad(-5)
                    .setCiudad("Madrid");

            // Mostrar resultados
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Ciudad: " + p.getCiudad());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
