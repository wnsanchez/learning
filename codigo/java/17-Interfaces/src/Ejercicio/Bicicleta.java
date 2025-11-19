package Ejercicio;

public class Bicicleta implements Vehiculo {
    private int velocidad = 0;

    public void encender() {
        System.out.println("La bicicleta no necesita encenderse, ¡lista!");
    }

    public void apagar() {
        System.out.println("La bicicleta no se apaga, simplemente se deja de usar.");
    }

    public void acelerar(int kmh) {
        velocidad += kmh / 2;
        System.out.println("Pedaleando suavemente... velocidad actual: " + velocidad);
    }
}
