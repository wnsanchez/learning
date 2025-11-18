package Basico;

// Padre
class Forma {
    void dibujar() {
        System.out.println("Dibujando forma");
    }
}

// Hija
class Circulo extends Forma {
    @Override
    void dibujar() {
        System.out.println("Dibujando círculo");
    }
}


public class C_Test {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Forma circulo = new Circulo();

        forma.dibujar();
        circulo.dibujar();

    }
}
