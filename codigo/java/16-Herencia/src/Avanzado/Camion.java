package Avanzado;

public class Camion extends Vehiculo {
    int carga; // en kilogramos

    public Camion(String marca, int carga) {
        super(marca);
        this.carga = carga;
    }


    @Override
    public void acelerar(int cantidad) {
        if (carga > 0) {
            // Acelera más lento debido al peso
            velocidad += cantidad / 2;

            System.out.println("El camión aceleró + " + (cantidad / 2) + " km/h por llevar carga");

        } else {
            velocidad += cantidad;
            System.out.println("El camión aceleró + " + cantidad + " km/h." );
        }
    }

    public void cargar(int kilos) {
        this.carga += kilos;
        System.out.println("Cargando " + kilos + " kg");
    }

    public void descargar(int kilos) {
        this.carga -= kilos;
        if (carga < 0) carga = 0;
        System.out.println("Descargando " + kilos + " kg");

    }


}
