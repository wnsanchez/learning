/*
CLASE ABSTRACTA
- No se puede instanciar directamente
- Es extendida (extends) por otras clases
- Puede tener 0, 1 o varios método abstracto
- Método abstracto:
    * No tiene implementación no usa {}
    * Debe implementar todos los métodos abstractos a los hijos
- El método abstracto solo puede existir dentro de una clase abstracta
*/

// CLASE ABSTRACTA
abstract class Animal {
    // Método abtracto (obliga a las subclases a implementarlo)
    abstract void hacerSonido(); // Sin implementación {}

    // Método normal (opcional para subclases)
    void dormir() {
        System.out.println("Zzz...");
    }
}

// SUB CLASE
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau Guau");
    }

}

public class B_AnimalTest {
    public static void main(String[] args) {
        // Animal a = new Animal -> No se puede instanciar
        Animal miPerro = new Perro(); //  Se puede porque Perro implementa el método abstracto

        miPerro.hacerSonido(); // Guau
        miPerro.dormir();

    }
}
