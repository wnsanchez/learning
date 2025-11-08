/*
GETTER CONTROLADO
- Es un método que no devuelve el valor "tal cual" del atributo, sino que lo controla, filtra o transforma antes de entregarlo al exterior.
- Se hace para:
    * Proteger información sensible
    * Formatear el valor antes de mostrarlo
    * Evitar errores o valores inválidos
    * Aplicar reglas de negocio
*/

class Usuario {
    private String nombre;
    private String password;

    // Constructor
    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    // Getter Normal
    public String getNombre() {
        return nombre;
    }

    // Getter controlado
    public String getPassword() {
        return "**************"; // Nunca devolvemos la contraseña actual
    }

}

public class D_Controlado {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Willian", "1234abcd");
        Usuario user2 = new Usuario("Luis", "luistaaa");

        System.out.println("Usuario: " + user1.getNombre() + " | Contraseña: " + user1.getPassword());
        System.out.println("Usuario: " + user2.getNombre() + " | Contraseña: " + user2.getPassword());
    }
}
