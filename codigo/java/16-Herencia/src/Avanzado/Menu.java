/*

*/

package Avanzado;

public class Menu {
    public static void main(String[] args) {
        // AUTO
        Vehiculo auto = new Auto("Toyota");
        auto.encender();
        auto.acelerar(20);
        auto.mostrarInfo();

        // MOTO
        Vehiculo moto = new Moto("Honda");
        moto.encender();
        moto.acelerar(20);
        moto.mostrarInfo();

        // Para usar métodos específicos de Moto, hacemos casting
        ((Moto)moto).hacerCaballito();

        // CAMIÓN
        Camion camion = new Camion("Volvo", 500);
        camion.acelerar(20); // Acelera solo +10 por la carga
        camion.mostrarInfo();

        // Casting para usar métodos específicos
        ((Camion)camion).descargar(500);

        camion.acelerar(20); // Ahora acelera +20
        camion.mostrarInfo();


    }
}
