/*
SOBRECARGADOS | OVERLOADED
Una clase tiene varios métodos con el mismo nombre, pero diferentes parámetros(Cantidad o tipo)
*/

class Calculadora {
    // Métodos 1: Suma Enteros
    public int suma(int a, int b) {
        return a + b;
    }

    // Método 2: Suma de dpubles (mismo nombre, diferente tipo)
    public double suma(double a, double b) {
        return a + b;
    }

    // Método 3: Suma de 3 números
    public int suma(int a, int b, int c) {
        return a + b + c;
    }

}

public class C_Sobrecarga {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("Suma de enteros: " + c.suma(4, 3));
        System.out.println("Suma de decimal: " + c.suma(2.34, 45.5));
        System.out.println("Suma de 3 números: " + c.suma(2, 4, 3));

    }
}
