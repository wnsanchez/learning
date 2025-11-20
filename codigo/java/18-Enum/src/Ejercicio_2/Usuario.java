package Ejercicio_2;

public class Usuario {
    private String nombre;
    private Rol rol;

    public Usuario(String nombre, Rol rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void mostrarPermisos() {
        switch (rol) {
            case INVITADO -> System.out.println("Permiso: Solo lectura");
            case USUARIO -> System.out.println("Permiso: leer y crear contenido");
            case ADMIN -> System.out.println("Permiso: control total, borra y administrar");
        }
    }

}
