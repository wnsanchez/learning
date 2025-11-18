/*
Herencia básica

*/

package Basico;

// Padre
class Vehiculo {
    String marca;

    Vehiculo(String marca) {
        this.marca = marca;
    }

    void encender() {
        System.out.println(marca + " está encendiendo");
    }

}

// Hija
class Auto extends Vehiculo{
    Auto(String marca) {
        super(marca);
    }

    void tocarBocina() {
        System.out.println("Beep");
    }

}

public class A_Test {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota");
        auto.encender();
        auto.tocarBocina();

    }
}
