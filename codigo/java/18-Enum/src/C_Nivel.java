/*
Los enum pueden tener propiedades, constructores y métodos.
 */

public enum C_Nivel {
    BAJO(1),
    MEDIO(2),
    ALTO(3);

    private final int codigo;

    C_Nivel(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
