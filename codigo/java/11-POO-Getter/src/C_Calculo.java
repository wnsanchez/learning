/*
Ejemplo de derivado
*/
class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters normales
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Getters derivado
    public double getArea() {
        return base * altura;
    }

}

public class C_Calculo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 3);
        System.out.println("Resultado: " + r1.getArea());
    }
}
