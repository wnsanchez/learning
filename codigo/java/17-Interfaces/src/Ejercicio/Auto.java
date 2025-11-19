package Ejercicio;

public class Auto implements Vehiculo {
    private int velocidad = 0;

    public void encender() {
        System.out.println("Auto encendido.");
    }

    public void apagar() {
        System.out.println("Auto apagado.");
    }

    public void acelerar(int kmh) {
        velocidad += kmh;
        System.out.println("Auto acelerando a + " + kmh + " km/h. Velocidad actual: " + velocidad);
    }

}
