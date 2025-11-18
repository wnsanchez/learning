package Intermedio;

public class EmpleadoTiempoCompleto extends Empleado {
    int horasTrabajadas;
    double bono;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;

    }

    public double calcularSalario() {
        return salarioBase + bono;
    }

}
