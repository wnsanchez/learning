/*
GETTERS
- Getters (accesor) es un método público que se usa para obtener el valor de un atributo privado
- No accedes directamente al atributo (`obj.atributo`)
- Sino lo haces a tráves de un método (`obj.getAtributo`)

Propósito: Protege los datos y te permite controlar qué y como se devuelve

*/
class Datos {
    String nombre;
    private int edad;
    private int id;

    // Constructor
    Datos(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;

    }


    // Getters | get + Nombre del atributo
    public int getId() { // Si es boolean sse usa is: isActivo
        return id;
    }
}

public class A_Acceso {
    public static void main(String[] args) {
        // Ingreso de datos
        Datos per1 = new Datos("Willian", 23, 1111);
        Datos per2 = new Datos("Lucy", 34, 1112);

        // Impresión
        System.out.println("=====| USO DE GETTERS |=====");
        System.out.println("Persona 1: ");
        System.out.println("Nombre: " + per1.nombre); // Ver
        per1.nombre = "Luis";
        System.out.println("Nombre mod: " + per1.nombre); // Modificar
        //System.out.println("Edad: " + per1.edad); // No se puede ver, ni modificar
        System.out.println("ID: " + per1.getId()); // Ver gracias al método

        System.out.println("----------------------------");

        System.out.println("Persona 2: ");
        System.out.println("Nonbre: " + per2.nombre);
        System.out.println("ID: " + per2.getId());


    }
}
