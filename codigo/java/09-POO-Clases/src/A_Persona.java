/*
PARTE 9: POO | CLASES
- Atributos: Variables que describen al objeto
- Métodos: Acciones que puede realizar el objeto
- Constructores: Sirven para inicializar los objetos
- Getters y Setters: Permiten visualizar y modificar datos de manera controlada
- Tipos:
    Clases Normales
    Clases Abstractas
    Clases Internas
    Clases Anónimas y estáticas
 */
public class A_Persona {
    // Atributos | Datos | Características
    String nombre;
    int edad;

    // Constructor (Se llama al crear un objeto)
    public A_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método: Mostrar información
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
    // Método para verficar si es mayor de edad
    public boolean esMayordDeEdad() {
        return edad >= 18;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona
        A_Persona persona1 = new A_Persona("Juan", 20);
        A_Persona persona2 = new A_Persona("Lara", 21);

        // Usando métodos
        persona1.saludar();
        if (persona1.esMayordDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
