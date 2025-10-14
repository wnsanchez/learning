/*
CLASE INTERNA NO ESTÁTICA | INNER CLASS
Definida dentro de otra clase
- Tiene acceso total a los miembros (incluso private) de la clase que que la contiene
- Para usarla, necesitas una instancia de la clase externa
- Menos código "boilerplate": puedes acceder a atributos private directamente sin getters/setters.
*/

public class D_Carro {
    // Variable
    private String marca;

    // Constructor
    public D_Carro(String marca) {
        this.marca = marca;
    }


    // Clase interna NO estática
    public class Motor {
        private int caballos;

        // Constructor de la clase interna
        public Motor(int caballos) {
            this.caballos = caballos;
        }

        public void mostrarDetalles() {
            // Puede acceder al campo marca de Carro
            System.out.println("Marca: " + marca + ", Caballos: " + caballos);
        }
    }

    // MAIN
    public static void main(String[] args) {
        // Primero se crea una instancia de Carro | Externa
        D_Carro miCarro = new D_Carro("Toyota");

        // Luego se crea una instancia de la clase interna usando la instancia interna
        D_Carro.Motor miMotor = miCarro.new Motor(120);
        miMotor.mostrarDetalles(); // Método de motor


        /*
        SINTAXIS PARA INSTANCIAR INNER CLASS
        ClaseExterna objExterno = new ClaseExterna();
        ClaseExterna.ClaseInterna objInterno = objExterno.new ClaseInterna();
        */

    }
}
