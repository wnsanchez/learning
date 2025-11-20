package Ejercicio_3;

public class Pago {
    private MetodoPago metodo;
    private double monto;

    public Pago(MetodoPago metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
    }

    public void realizar() {
        System.out.println("=== Pago con " + metodo.getDescripcion() + " ===");
        metodo.procesar(monto);   // Aquí ocurre la magia
        System.out.println("Pago completado.\n");
    }
}
