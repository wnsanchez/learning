package Ejercicio;

public class Moto implements Vehiculo {
    private int velocidad = 0;


    @Override
    public void encender() {
        System.out.println("Moto encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Moto apagada");
    }

    @Override
    public void acelerar(int kmh) {
        velocidad += kmh * 2; // Acelera más rápido
        System.out.println("Moto acelerando velozmente. Velocidad actual: " + velocidad);
    }
}
