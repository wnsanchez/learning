/*
GETTER CONTROLADO

 */

class Info {
    private String nombre;
    private int edad;

    // Constructor
    public Info(String nombre, int edad) {
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

    // Setter de nombre
    public void setNombre(String nombre) {
        // Validamos que el nombre no sea nulo ni vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            // throw: lanza una excepción
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    // Setter de edad
    public void setEdad(int edad) {
        // Debe se positiva
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120 años.");
        }
        this.edad = edad;
    }

}

public class B_Controlado {
    public static void main(String[] args) {
         Info p = new Info("Will", 15);

        try {
            p.setNombre("Ana");
            p.setEdad(25);
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());

            // Intento de error
            p.setEdad(-5); // ❌ Esto lanza excepción
            System.out.println(p.getEdad()); // No imprime ya que lanza la excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
