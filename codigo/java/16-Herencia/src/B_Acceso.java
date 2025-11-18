/*
SUPER: Acceder al padre
super permite acceder a métodos o atributos de la clase padre.


 */


class Animal {
    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    void comer() {
        System.out.println(nombre + " esta comiendo");
    }
    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Hija
class Perro extends Animal {
    Perro(String nombre) {
        super(nombre); // Llamamos al constructor de animal | super
    }

    void ladrar() {
        System.out.println(nombre + " dice. ¡Guau!");
    }

    // Sobreescribe
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }

}

public class B_Acceso {
    public static void main(String[] args) {
        //
        Perro perro = new Perro("Rocky");
        perro.comer();
        perro.ladrar();
        perro.sonido();
    }
}
