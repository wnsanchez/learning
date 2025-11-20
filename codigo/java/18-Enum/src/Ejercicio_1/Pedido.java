package Ejercicio_1;

public class Pedido {
    private int id;
    EstadoPedido estado;

    public Pedido(int id) {
        this.id = id;
        this.estado = EstadoPedido.NUEVO; // Estado inicial
    }

    public void avanzarEstado() {
        switch (estado) {
            case NUEVO -> estado = EstadoPedido.PROCESANDO;
            case PROCESANDO -> estado = EstadoPedido.ENVIANDO;
            case ENVIANDO -> estado = EstadoPedido.ENTREGADO;
            case ENTREGADO, CANCELADO -> System.out.println("El pedido ya está finalizado.");

        }

    }

    // Cancela el pedido solo si todavía se puede cancelar.
    public void cancelar() {
        if (!estado.esFinalizado()) {
            estado = EstadoPedido.CANCELADO;
        }
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " -> Estado: " + estado;
    }

}
