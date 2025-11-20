package Ejercicio_1;

public enum EstadoPedido {
    NUEVO,
    PROCESANDO,
    ENVIANDO,
    ENTREGADO,
    CANCELADO;

    public boolean esFinalizado() {
        return this == ENTREGADO || this == CANCELADO;
    }



}
