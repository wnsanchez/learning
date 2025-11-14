/*
RELACIONES DE CLASES

ASOCIACIÓN
- Ambos objetos pueden vivir por separado
- El vínculo es temporal o débil
- Uno puede referirse al otro mediante una referencia
-
*/
class Dueno {
    private String nombre;

    Dueno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Perro {
    private String nombre;
    private Dueno dueno; // Asociación Perro conoce a su dueño

    Perro(String nombre, Dueno dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
    }

    void  mostrarInfo() {
        System.out.println(nombre + " pertenece a " + dueno.getNombre());
    }

}

public class A_Asociado {
    public static void main(String[] args) {
        Dueno dueno = new Dueno("Willian");
        Perro perro = new Perro("Peluchín", dueno);
        perro.mostrarInfo();
    }
}
