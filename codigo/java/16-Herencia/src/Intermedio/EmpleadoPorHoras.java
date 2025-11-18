package Intermedio;

public class EmpleadoPorHoras extends Empleado{
    int horasTrabajadas;
    double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }


}
