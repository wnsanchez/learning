/*
HERENCIA
La herencia permite que una clase “hija” reutilice atributos y métodos de una clase “padre”.

*/

class Padre {
    void yoSoy() {
        System.out.println("Yo soy el padre");
    }

    void somosFamilia() {
        System.out.println("Método heredado");
    }

}

// Usa extends para heredar
class Hija extends Padre {
    void yoSoy() { // Sobreescribe
        System.out.println("Yo soy el hijo");
    }

}

public class A_Herencia {
    public static void main(String[] args) {
        Padre padre = new Padre();
        Hija hija = new Hija();

        padre.yoSoy();
        hija.yoSoy(); // Sobreescribe
        hija.somosFamilia(); // heredado del padre

    }
}
