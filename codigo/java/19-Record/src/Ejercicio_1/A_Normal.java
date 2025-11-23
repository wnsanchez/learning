package Ejercicio_1;

/*
CLASE NORMAL INMUTABLE
- Usar campos private final
- No tener setters
- No permitir cambiar internamente colecciones o arrays
- Tener un constructor que inicialice todo
- Sobrescribir correctamente equals(), hashCode(), toString()

 */

public final class A_Normal {
    // Campo
    private final String nombre;
    private final int edad;

    // Constructor
    public A_Normal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /*
    @Override
    public boolean equals(...) {}
    @Override
    public int hashCode(...) {}
    @Override
    public String toString() {}
     */
}
