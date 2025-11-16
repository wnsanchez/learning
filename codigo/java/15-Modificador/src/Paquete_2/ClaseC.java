
package Paquete_2;

import Paquete_1.ClaseA;

public class ClaseC extends ClaseA{
//    public ClaseC(String atributoProtegido) {
//        this.atributoProtegido = atributoProtegido; // Acceso permitido: atributo protected
//    }

    public void probarAccesoC() {
        ClaseA claseA = new ClaseA();
        System.out.println("Probando clase C: ");
        System.out.println(claseA.atributoPublico);
        //System.out.println(claseA.atributoProtegido);
        //System.out.println(claseA.atributoDefault);
        //System.out.println(claseA.atributoPrivado);

        System.out.println(this.atributoProtegido);

        //System.out.println(claseA.metodoProtegido);

    }

    @Override
    protected void metodoProtected() {
        System.out.println("Editado en la clase hija");
}

}