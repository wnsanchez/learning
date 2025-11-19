package Ejercicio;

public class GestorVehiculos {

    public static void operarVehiculo(Vehiculo v) {
        v.info();           // método default
        v.encender();       // método obligatorio
        v.acelerar(10);     // método obligatorio
        v.apagar();         // método obligatorio
        System.out.println("--------------");
    }

}
