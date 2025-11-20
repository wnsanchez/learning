package Ejercicio_2;

public class Sistema {
    public static void main(String[] args) {
        // Programa
        Usuario u1 = new Usuario("Ana", Rol.INVITADO);
        Usuario u2 = new Usuario("Luis", Rol.USUARIO);
        Usuario u3 = new Usuario("Carla", Rol.ADMIN);

        u1.mostrarPermisos();
        u2.mostrarPermisos();
        u3.mostrarPermisos();

    }
}
