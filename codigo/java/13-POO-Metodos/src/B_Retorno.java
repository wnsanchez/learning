/*
Sin retorno: Solo realiza algo (como imprimir, guardar, modificar…).
    * void: no devuelve nada
Con retorno: Un método devuelve un valor al lugar desde donde fue llamado.
El tipo de retorno puede ser primitivo (int, double, boolean, etc.) o objeto (String, Persona, etc.).

 */

class Primitivo {
    // Métodos
    public static void saludo() {
        System.out.println("Bienvenido");
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

}

class Clases {
    // Métodos
    public Persona crearPersona(String nombre, int edad) {
        Persona p = new Persona(nombre, edad);
        return p; // Devuelve el objeto creado
    }

}

class Persona {
    // Atributo
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

}

public class B_Retorno {
    public static void main(String[] args) {
        Primitivo sum1 = new Primitivo();
        Primitivo div1 = new Primitivo();

        Primitivo.saludo();
        System.out.println("Suma: " + sum1.suma(4, 3));
        System.out.println("División: " + div1.dividir(6.3, 3));

        // Clases
        Clases fab = new Clases();
        Persona per1 = fab.crearPersona("Lucía", 25);

        per1.mostrarInfo();



    }
}
