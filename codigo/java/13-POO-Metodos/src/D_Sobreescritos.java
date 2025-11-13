/*
SOBREESCRITOS | OVERRIDDEN
La sobrescritura ocurre cuando una subclase redefine un método que ya existe en su clase padre (Superclase)
- Hija usa extends

*/

// CLASE PADRE
class Animal {
    public void hacerSonido() {
        System.out.println("El hacer un sonido");
    }

    final void rspirar() {
        System.out.println("El animal respira");
    }
}

// CLASE HIJA
class Perro extends Animal { // Usa extends para heredar
    @Override // Indica que se está sobreescribiendo un método
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class D_Sobreescritos {
    public static void main(String[] args) {
        Animal a = new Perro();
        a.hacerSonido();
        a.rspirar();

    }
}
