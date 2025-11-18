package Avanzado;

public class Auto extends Vehiculo {


    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("El auto aceleró " + cantidad + " km/h");
    }

    public void tocarBocina() {
        System.out.println("Beep Beep");
    }
}
