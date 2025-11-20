package Ejercicio_3;

public class Ejecuta {
    public static void main(String[] args) {
        Pago p1 = new Pago(MetodoPago.TARJETA, 100);
        Pago p2 = new Pago(MetodoPago.PAYPAL, 59.99);
        Pago p3 = new Pago(MetodoPago.TRANSFERENCIA, 2500);

        p1.realizar();
        p2.realizar();
        p3.realizar();
    }
}
