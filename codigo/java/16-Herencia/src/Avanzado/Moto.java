package Avanzado;

public class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int cantidad) {
        // La moto acelera 1.5 veces más rápido
        velocidad += cantidad * 1.5;
        System.out.println("La moto aceleró + " + (cantidad * 1.5) + " km/h.");
    }

    public void hacerCaballito() {
        System.out.println("¡La moto está haciendo caballito!");
    }

}
