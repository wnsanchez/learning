package Ejercicio_3;
/*
Cada constante del enum puede tener comportamiento propio, como si fueran tres clases diferentes, pero dentro de un mismo tipo.
 */
public enum MetodoPago {
    TARJETA("Pago con tarjeta bancaria") {
        @Override
        public void procesar(double monto) {
            System.out.println("Procesando pago con tarjeta por $" + monto);
            System.out.println("Verificando fondos y autorización ...");
        }
    },

    PAYPAL("Pago con PayPal") {
        @Override
        public void procesar(double monto) {
            System.out.println("Procesando pago con Paypal por $" + monto);
            System.out.println("Conectando con la cuenta Paypal");
        }
    },

    TRANSFERENCIA("Pago por transferencia bancaria") {
        @Override
        public void procesar(double monto) {
            System.out.println("Procesando pago con Transferencia por $" + monto);
            System.out.println("Esperando confirmación desde el banco ...");
        }

    };

    // CAMPO
    private final String descripcion;

    // Constructor


    MetodoPago(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método abstracto que cada enum debe implementar
    public abstract void procesar(double monto);
}
