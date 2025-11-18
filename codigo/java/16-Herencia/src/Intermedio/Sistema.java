package Intermedio;

public class Sistema {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoTiempoCompleto("Raúl", 120, 3);
        Empleado emp2 = new EmpleadoPorHoras("Ana", 0, 300, 2);
        System.out.println("Salario: " + emp1.calcularSalario());
        System.out.println("Salario: " + emp2.calcularSalario());

    }
}
