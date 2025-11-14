import java.util.List;

/*
AGREGACIÓN
- Asociación más fuerte, pero los objetos aún pueden existir por separado
- Suele llamar una relación "tienen un" ("has-a")
- La relación es de “todo-parte”, pero las partes pueden vivir fuera del todo.
-


*/
class Estudiante {
    String nombre;

    Estudiante(String nombre) {
        this.nombre = nombre;
    }

}

class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes; // Agregación la uni tiene estudiantes

    Universidad(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    void mostrarEstudiante() {
        System.out.println("Universidad: " + nombre);
        for (Estudiante e: estudiantes) {
            System.out.println("- " + e.nombre);
        }
    }

}

public class B_Agregacion {
    public static void main(String[] args) {
        List<Estudiante> lista = List.of(
                new Estudiante("Ana"),
                new Estudiante("Luis")
        );

        Universidad uni = new Universidad("UNAM", lista);
        uni.mostrarEstudiante();

    }
}
