/*
EJERCICIO FIGURAS GEOMÉTRICAS
*/

// Clase Abstracta
abstract class Figura {
    // Método abastracto
    abstract double calcularArea(); // Sin implementar sin {}

    // Método normal
    public void mostrarFigura() {
        System.out.println("Soy una figura");
    }

}

class Cuadrado extends Figura {
    // Variables
    double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Método
    @Override
    double calcularArea (){
        return lado * lado;
    }

}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * (radio * radio);
    }

}

public class C_FiguraTest {
    public static void main(String[] args) {
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Circulo(10);

        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Área del círculo: " + f2.calcularArea());
        f1.mostrarFigura();

    }
}
