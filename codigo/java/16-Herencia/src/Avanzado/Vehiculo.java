/*
Un método es abstracto cuando la clase padre define “qué debe hacerse”,
pero cada hijo define “cómo debe hacerse”.
*/

package Avanzado;

public abstract class Vehiculo {
    // Atributos
    String marca;
    int velocidad;

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    // Métodos abstracto | La superclase NO sabe cómo implementar ese método
    public abstract void acelerar(int cantidad); // Se implementa en cada hijo

    // Métodos normales | La clase padre sí conoce la implementación común
    public void encender() {
        System.out.println("Encendiendo " + marca + " ...");
    }

    public void apagar() {
        System.out.println("Apagando " + marca + " ...");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad);
    }


}
