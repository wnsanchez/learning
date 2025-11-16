/*
MODIFICADORES
- public: Accesible desde cualquier parte del problema
- private: Accesible solo dentro de la misma clase
- protected: Accesible desde
    * la misma clase
    * clases del mismo paquete
    * subclases incluso sí están en otro paquete
- default: Sin escribir nada | implícita
    Accesible únicamente desde el mismo paquete


*/

package Paquete_1;

public class ClaseA {
    public String atributoPublico = "Soy público";
    protected String atributoProtegido = "Soy protegido";
    String atributoDefault = "Soy default";
    private String atributoPrivado = "Soy privado";

    public void mostrarAtributo() {
        System.out.println("--- Dentro de Clase A ---");
        System.out.println(atributoPublico);
        System.out.println(atributoProtegido);
        System.out.println(atributoDefault);
        System.out.println(atributoPrivado);

    }

    private void metodoPrivado() {
        System.out.println("Soy un método privado");
    }

    protected void metodoProtected() {
        System.out.println("Sy un método protegido");
    }

}
