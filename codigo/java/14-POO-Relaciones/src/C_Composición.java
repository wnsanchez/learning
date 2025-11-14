/*
COMPOSICIÓN
Es la relación más fuerte. La clase “contenedora” posee y controla completamente a la otra clase. Si el objeto principal se destruye, los objetos contenidos también.
- El objeto contenido no puede existir sin el contenedor.
- Se crea dentro del objeto (con new Motor() dentro del constructor)
- Se destruye junto con él
- Es una relación de dependencia total

*/

class Motor {
    void encender() {
        System.out.println("Motor encendido");
    }
}

class Coche {
    private Motor motor; // Composición el contiene su motor propio

    Coche() {
        this.motor = new Motor(); // El coche crea su motor
    }

    void arrancar() {
        motor.encender();
        System.out.println("Coche arrancando");

    }
}


public class C_Composición {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.arrancar();
        // Si el coche deja de existir, su motor también

    }
}
