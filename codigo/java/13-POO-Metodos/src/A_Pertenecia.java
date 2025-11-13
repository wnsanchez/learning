/*
MÉTODOS
- Realiza una acción | Comportamientos
- Bloque de código reutilizable | Tarea específica
- SINTAXIS
    * modificador tipoDeRetorno nombreMétodo(parámetros) {
        // Cuerpo del método
        // Instrucciones
        return valor; (si tienes tipo de retorno)
      }
- Modificador: public | private | protected | default
- Retorno: void | int | double | char | String | clase | arrays

PERTENENCIA: Métodos de instancia(Objetosd) y  Estáticos(Clase)
*/

class Instancia {
    private String nombre;

    public Instancia(String nombre) {
        this.nombre = nombre;
    }

    // Método sin retorno, sin parámetro
    public void saludar() {
        System.out.println("Mi nombre es: " + nombre);
    }
}

class Estatico {
    public static String saludo() {
        return "Hola Mundo";
    }
}

public class A_Pertenecia {
    public static void main(String[] args) {
        // Instancia
        Instancia ins1 = new Instancia("Willian");

        ins1.saludar();

        // Estático | Sin instancia
        String saludo = Estatico.saludo();
        System.out.println(saludo);

    }
}
