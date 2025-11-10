/*
SETTER DEFENSIVO
- Setter con copia defensiva
- Funciona con objetos mutables
-
*/

// CLASE DIRECCIÓN
class Direccion {
    // Atributos
    private String ciudad;

    // Constructor
    public Direccion(String ciudad) {
        this.ciudad = ciudad;
    }

    // Constructor copia
    public Direccion(Direccion otra) {
        this.ciudad = otra.ciudad;
    }

    // Getters
    public String getCiudad() {
        return ciudad;
    }

    // Setters
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // to string
    public String toString() {
        return "Dirección{" + "ciudad='" + ciudad + '\'' + '}';
    }

}


// CLASE PERSONA
class Personaje {
    private String nombre;
    private Direccion direccion;

    // Constructor
    public Personaje(String nombre, Direccion direccion) {
        this.nombre = nombre;
        // Copia defensiva
        this.direccion = new Direccion(direccion);
    }

    // Getter defensivo
    public Direccion getDireccion() {
        return new Direccion(direccion); // Devuelve una copia
    }

    // Setter Defensivo
    public void setDireccion(Direccion direccion) {
        this.direccion = new Direccion(direccion); // Guarda una copia
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }

}

public class D_Defensivo {
    public static void main(String[] args) {
        Direccion dirOriginal = new Direccion("Madrid");
        Personaje p = new Personaje("Willian", dirOriginal);

        p.mostrarInfo();

        // Cambiamos la dirección original
        dirOriginal.setCiudad("Barcelona");
        System.out.println(dirOriginal.getCiudad()); // Persona sigue protegida

        p.mostrarInfo();
    }



}
